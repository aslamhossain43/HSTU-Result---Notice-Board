package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml4s2;
import com.renu.hstu_r_n_board_backend.dto.Dvml4s2;

@Repository
@Transactional
public class DaoImplDvml4s2 implements DaoDvml4s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean dvmL4S2Add(Dvml4s2 dvml4s2) {
try {
	sessionFactory.getCurrentSession().persist(dvml4s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml4s2> dvmL4S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml4s2", Dvml4s2.class).getResultList();
	}

	@Override
	public boolean dvmL4S2Delete(int id) {
     try {
		Dvml4s2 list=sessionFactory.getCurrentSession().load(Dvml4s2.class, id);
		if (list!=null) {
			sessionFactory.getCurrentSession().delete(list);
		}
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	
	}
	
	}

	@Override
	public boolean dvmL4S2Update(Dvml4s2 dvml4s2) {
		try {
			sessionFactory.getCurrentSession().update(dvml4s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL4S2Truncate(Dvml4s2 dvml4s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml4s2").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml4s2 dvmL4S2GetById(int id) {
	List<Dvml4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml4s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}
}
