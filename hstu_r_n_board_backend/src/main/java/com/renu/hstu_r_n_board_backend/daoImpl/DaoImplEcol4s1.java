package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol4s1;
import com.renu.hstu_r_n_board_backend.dto.Ecol4s1;

@Repository
@Transactional
public class DaoImplEcol4s1 implements DaoEcol4s1{

	 @Autowired
     private SessionFactory sessionFactory;
     
     
	@Override
	public boolean ecoL4S1Add(Ecol4s1 ecol4s1) {
try {
	sessionFactory.getCurrentSession().persist(ecol4s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	}

	@Override
	public List<Ecol4s1> ecoL4S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol4s1", Ecol4s1.class).getResultList();
		
	}

	@Override
	public boolean ecoL4S1Delete(int id) {
		try {
			Ecol4s1 list=sessionFactory.getCurrentSession().load(Ecol4s1.class, id);
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
	public boolean ecoL4S1Update(Ecol4s1 ecol4s1) {
		try {
			sessionFactory.getCurrentSession().update(ecol4s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean ecoL4S1Truncate(Ecol4s1 ecol4s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol4s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Ecol4s1 ecoL4S1GetById(int id) {
		List<Ecol4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Ecol4s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}
}
