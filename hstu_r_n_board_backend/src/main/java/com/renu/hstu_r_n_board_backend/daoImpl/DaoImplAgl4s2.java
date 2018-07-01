package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl4s2;
import com.renu.hstu_r_n_board_backend.dto.Agl4s2;

@Repository
@Transactional
public class DaoImplAgl4s2 implements DaoAgl4s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean aglL4S2Add(Agl4s2 agl4s2) {
			try {
				sessionFactory.getCurrentSession().persist(agl4s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agl4s2> aglL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Agl4s2", Agl4s2.class).getResultList();
			
		}

		@Override
		public boolean aglL4S2Delete(int id) {
	     try {
			Agl4s2 list=sessionFactory.getCurrentSession().load(Agl4s2.class, id);
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
		public boolean aglL4S2Update(Agl4s2 agl4s2) {
			try {
				sessionFactory.getCurrentSession().update(agl4s2);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			}
		}

		@Override
		public boolean aglL4S2Truncate(Agl4s2 agl4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl4s2").executeUpdate();
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public Agl4s2 aglL4S2GetById(int id) {
			List<Agl4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Agl4s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}


}
