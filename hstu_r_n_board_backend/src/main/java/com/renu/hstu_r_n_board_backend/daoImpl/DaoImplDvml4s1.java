package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml4s1;
import com.renu.hstu_r_n_board_backend.dto.Dvml4s1;

@Repository
@Transactional
public class DaoImplDvml4s1 implements DaoDvml4s1{

	 @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean dvmL4S1Add(Dvml4s1 dvml4s1) {
try {
	sessionFactory.getCurrentSession().persist(dvml4s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml4s1> dvmL4S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml4s1", Dvml4s1.class).getResultList();
	}

	@Override
	public boolean dvmL4S1Delete(int id) {
     try {
		Dvml4s1 list=sessionFactory.getCurrentSession().load(Dvml4s1.class, id);
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
	public boolean dvmL4S1Update(Dvml4s1 dvml4s1) {
		try {
			sessionFactory.getCurrentSession().update(dvml4s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL4S1Truncate(Dvml4s1 dvml4s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml4s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml4s1 dvmL4S1GetById(int id) {
	List<Dvml4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml4s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
