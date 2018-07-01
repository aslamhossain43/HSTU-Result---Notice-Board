package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoArcl4s2;
import com.renu.hstu_r_n_board_backend.dto.Arcl4s2;

@Repository
@Transactional
public class DaoImplArcl4s2 implements DaoArcl4s2{


	  @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean arcL4S2Add(Arcl4s2 arcl4s2) {
	try {
		sessionFactory.getCurrentSession().persist(arcl4s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public List<Arcl4s2> arcL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Arcl4s2", Arcl4s2.class).getResultList();
			
		}

		@Override
		public boolean arcL4S2Delete(int id) {
	try {
		Arcl4s2 list=sessionFactory.getCurrentSession().load(Arcl4s2.class, id);
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
		public boolean arcL4S2Update(Arcl4s2 arcl4s2) {
			try {
				sessionFactory.getCurrentSession().update(arcl4s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean arcL4S2Truncate(Arcl4s2 arcl4s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Arcl4s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Arcl4s2 arcL4S2GetById(int id) {
	List<Arcl4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Arcl4s2 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
		
		
		}
}
