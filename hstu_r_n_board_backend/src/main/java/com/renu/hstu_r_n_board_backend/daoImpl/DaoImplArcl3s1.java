package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoArcl3s1;
import com.renu.hstu_r_n_board_backend.dto.Arcl3s1;

@Repository
@Transactional
public class DaoImplArcl3s1 implements DaoArcl3s1{

	  @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean arcL3S1Add(Arcl3s1 arcl3s1) {
	try {
		sessionFactory.getCurrentSession().persist(arcl3s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public List<Arcl3s1> arcL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Arcl3s1", Arcl3s1.class).getResultList();
			
		}

		@Override
		public boolean arcL3S1Delete(int id) {
	try {
		Arcl3s1 list=sessionFactory.getCurrentSession().load(Arcl3s1.class, id);
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
		public boolean arcL3S1Update(Arcl3s1 arcl3s1) {
			try {
				sessionFactory.getCurrentSession().update(arcl3s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean arcL3S1Truncate(Arcl3s1 arcl3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Arcl3s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Arcl3s1 arcL3S1GetById(int id) {
	List<Arcl3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Arcl3s1 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
		
		
		}
	 
}
