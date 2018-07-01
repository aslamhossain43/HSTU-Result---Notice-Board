package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl2s2;
import com.renu.hstu_r_n_board_backend.dto.Agl2s2;

@Repository
@Transactional
public class DaoImplAgl2s2 implements DaoAgl2s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean aglL2S2Add(Agl2s2 agl2s2) {
			try {
				sessionFactory.getCurrentSession().persist(agl2s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agl2s2> aglL2S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Agl2s2", Agl2s2.class).getResultList();
			
		}

		@Override
		public boolean aglL2S2Delete(int id) {
	     try {
			Agl2s2 list=sessionFactory.getCurrentSession().load(Agl2s2.class, id);
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
		public boolean aglL2S2Update(Agl2s2 agl2s2) {
			try {
				sessionFactory.getCurrentSession().update(agl2s2);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			}
		}

		@Override
		public boolean aglL2S2Truncate(Agl2s2 agl2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl2s2").executeUpdate();
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public Agl2s2 aglL2S2GetById(int id) {
			List<Agl2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Agl2s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
