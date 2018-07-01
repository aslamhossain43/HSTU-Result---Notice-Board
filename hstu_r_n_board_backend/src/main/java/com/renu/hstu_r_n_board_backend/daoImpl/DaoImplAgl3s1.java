package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl3s1;
import com.renu.hstu_r_n_board_backend.dto.Agl3s1;

@Repository
@Transactional
public class DaoImplAgl3s1 implements DaoAgl3s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean aglL3S1Add(Agl3s1 agl3s1) {
			try {
				sessionFactory.getCurrentSession().persist(agl3s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agl3s1> aglL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Agl3s1", Agl3s1.class).getResultList();
			
		}

		@Override
		public boolean aglL3S1Delete(int id) {
	     try {
			Agl3s1 list=sessionFactory.getCurrentSession().load(Agl3s1.class, id);
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
		public boolean aglL3S1Update(Agl3s1 agl3s1) {
			try {
				sessionFactory.getCurrentSession().update(agl3s1);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			}
		}

		@Override
		public boolean aglL3S1Truncate(Agl3s1 agl3s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl3s1").executeUpdate();
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public Agl3s1 aglL3S1GetById(int id) {
			List<Agl3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agl3s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}


}
