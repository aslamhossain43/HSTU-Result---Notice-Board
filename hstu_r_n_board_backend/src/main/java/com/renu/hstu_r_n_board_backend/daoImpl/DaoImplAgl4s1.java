package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl4s1;
import com.renu.hstu_r_n_board_backend.dto.Agl4s1;

@Repository
@Transactional
public class DaoImplAgl4s1 implements DaoAgl4s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean aglL4S1Add(Agl4s1 agl4s1) {
			try {
				sessionFactory.getCurrentSession().persist(agl4s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agl4s1> aglL4S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Agl4s1", Agl4s1.class).getResultList();
			
		}

		@Override
		public boolean aglL4S1Delete(int id) {
	     try {
			Agl4s1 list=sessionFactory.getCurrentSession().load(Agl4s1.class, id);
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
		public boolean aglL4S1Update(Agl4s1 agl4s1) {
			try {
				sessionFactory.getCurrentSession().update(agl4s1);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			}
		}

		@Override
		public boolean aglL4S1Truncate(Agl4s1 agl4s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl4s1").executeUpdate();
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public Agl4s1 aglL4S1GetById(int id) {
			List<Agl4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agl4s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
