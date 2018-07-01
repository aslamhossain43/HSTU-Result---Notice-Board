package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoArcl4s1;
import com.renu.hstu_r_n_board_backend.dto.Arcl4s1;

@Repository
@Transactional
public class DaoImplArcl4s1 implements DaoArcl4s1{

	  @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean arcL4S1Add(Arcl4s1 arcl4s1) {
	try {
		sessionFactory.getCurrentSession().persist(arcl4s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public List<Arcl4s1> arcL4S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Arcl4s1", Arcl4s1.class).getResultList();
			
		}

		@Override
		public boolean arcL4S1Delete(int id) {
	try {
		Arcl4s1 list=sessionFactory.getCurrentSession().load(Arcl4s1.class, id);
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
		public boolean arcL4S1Update(Arcl4s1 arcl4s1) {
			try {
				sessionFactory.getCurrentSession().update(arcl4s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean arcL4S1Truncate(Arcl4s1 arcl4s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Arcl4s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Arcl4s1 arcL4S1GetById(int id) {
	List<Arcl4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Arcl4s1 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
		
		
		}

}
