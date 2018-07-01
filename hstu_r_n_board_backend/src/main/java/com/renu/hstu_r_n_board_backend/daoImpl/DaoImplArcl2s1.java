package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoArcl2s1;
import com.renu.hstu_r_n_board_backend.dto.Arcl2s1;

@Repository
@Transactional
public class DaoImplArcl2s1 implements DaoArcl2s1{
	  @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean arcL2S1Add(Arcl2s1 arcl2s1) {
	try {
		sessionFactory.getCurrentSession().persist(arcl2s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public List<Arcl2s1> arcL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Arcl2s1", Arcl2s1.class).getResultList();
			
		}

		@Override
		public boolean arcL2S1Delete(int id) {
	try {
		Arcl2s1 list=sessionFactory.getCurrentSession().load(Arcl2s1.class, id);
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
		public boolean arcL2S1Update(Arcl2s1 arcl2s1) {
			try {
				sessionFactory.getCurrentSession().update(arcl2s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean arcL2S1Truncate(Arcl2s1 arcl2s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Arcl2s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Arcl2s1 arcL2S1GetById(int id) {
	List<Arcl2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Arcl2s1 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
		
		
		}

}
