package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml2s1;
import com.renu.hstu_r_n_board_backend.dto.Dvml2s1;

@Repository
@Transactional
public class DaoImplDvml2s1 implements DaoDvml2s1{

	 @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean dvmL2S1Add(Dvml2s1 dvml2s1) {
try {
	sessionFactory.getCurrentSession().persist(dvml2s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml2s1> dvmL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml2s1", Dvml2s1.class).getResultList();
	}

	@Override
	public boolean dvmL2S1Delete(int id) {
     try {
		Dvml2s1 list=sessionFactory.getCurrentSession().load(Dvml2s1.class, id);
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
	public boolean dvmL2S1Update(Dvml2s1 dvml2s1) {
		try {
			sessionFactory.getCurrentSession().update(dvml2s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL2S1Truncate(Dvml2s1 dvml2s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml2s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml2s1 dvmL2S1GetById(int id) {
	List<Dvml2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml2s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
