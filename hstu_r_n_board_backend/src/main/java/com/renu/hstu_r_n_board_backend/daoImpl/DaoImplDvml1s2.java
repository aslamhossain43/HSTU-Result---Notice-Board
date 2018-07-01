package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml1s2;
import com.renu.hstu_r_n_board_backend.dto.Dvml1s1;
import com.renu.hstu_r_n_board_backend.dto.Dvml1s2;

@Repository
@Transactional
public class DaoImplDvml1s2 implements DaoDvml1s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean dvmL1S2Add(Dvml1s2 dvml1s2) {
try {
	sessionFactory.getCurrentSession().persist(dvml1s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml1s2> dvmL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml1s2", Dvml1s2.class).getResultList();
	}

	@Override
	public boolean dvmL1S2Delete(int id) {
     try {
		Dvml1s2 list=sessionFactory.getCurrentSession().load(Dvml1s2.class, id);
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
	public boolean dvmL1S2Update(Dvml1s2 dvml1s2) {
		try {
			sessionFactory.getCurrentSession().update(dvml1s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL1S2Truncate(Dvml1s2 dvml1s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml1s2").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml1s2 dvmL1S2GetById(int id) {
	List<Dvml1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml1s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}


}
