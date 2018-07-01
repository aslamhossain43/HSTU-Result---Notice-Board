package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml3s2;
import com.renu.hstu_r_n_board_backend.dto.Dvml3s1;
import com.renu.hstu_r_n_board_backend.dto.Dvml3s2;

@Repository
@Transactional
public class DaoImplDvml3s2 implements DaoDvml3s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean dvmL3S2Add(Dvml3s2 dvml3s2) {
try {
	sessionFactory.getCurrentSession().persist(dvml3s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml3s2> dvmL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml3s2", Dvml3s2.class).getResultList();
	}

	@Override
	public boolean dvmL3S2Delete(int id) {
     try {
		Dvml3s2 list=sessionFactory.getCurrentSession().load(Dvml3s2.class, id);
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
	public boolean dvmL3S2Update(Dvml3s2 dvml3s2) {
		try {
			sessionFactory.getCurrentSession().update(dvml3s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL3S2Truncate(Dvml3s2 dvml3s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml3s2").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml3s2 dvmL3S2GetById(int id) {
	List<Dvml3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml3s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}


}
