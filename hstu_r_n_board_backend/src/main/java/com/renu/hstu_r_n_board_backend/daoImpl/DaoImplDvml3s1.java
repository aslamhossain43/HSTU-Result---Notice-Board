package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml3s1;
import com.renu.hstu_r_n_board_backend.dto.Dvml3s1;

@Repository
@Transactional
public class DaoImplDvml3s1 implements DaoDvml3s1{

	 @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean dvmL3S1Add(Dvml3s1 dvml3s1) {
try {
	sessionFactory.getCurrentSession().persist(dvml3s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml3s1> dvmL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml3s1", Dvml3s1.class).getResultList();
	}

	@Override
	public boolean dvmL3S1Delete(int id) {
     try {
		Dvml3s1 list=sessionFactory.getCurrentSession().load(Dvml3s1.class, id);
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
	public boolean dvmL3S1Update(Dvml3s1 dvml3s1) {
		try {
			sessionFactory.getCurrentSession().update(dvml3s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL3S1Truncate(Dvml3s1 dvml3s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml3s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml3s1 dvmL3S1GetById(int id) {
	List<Dvml3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml3s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
