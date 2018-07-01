package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl2s1;
import com.renu.hstu_r_n_board_backend.dto.Agl2s1;

@Repository
@Transactional
public class DaoImplAgl2s1 implements DaoAgl2s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean aglL2S1Add(Agl2s1 agl2s1) {
			try {
				sessionFactory.getCurrentSession().persist(agl2s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agl2s1> aglL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Agl2s1", Agl2s1.class).getResultList();
			
		}

		@Override
		public boolean aglL2S1Delete(int id) {
	     try {
			Agl2s1 list=sessionFactory.getCurrentSession().load(Agl2s1.class, id);
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
		public boolean aglL2S1Update(Agl2s1 agl2s1) {
			try {
				sessionFactory.getCurrentSession().update(agl2s1);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			}
		}

		@Override
		public boolean aglL2S1Truncate(Agl2s1 agl2s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl2s1").executeUpdate();
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public Agl2s1 aglL2S1GetById(int id) {
			List<Agl2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agl2s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}


}
