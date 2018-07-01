package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl3s2;
import com.renu.hstu_r_n_board_backend.dto.Agl3s2;

@Repository
@Transactional
public class DaoImplAgl3s2 implements DaoAgl3s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean aglL3S2Add(Agl3s2 agl3s2) {
			try {
				sessionFactory.getCurrentSession().persist(agl3s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agl3s2> aglL3S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Agl3s2", Agl3s2.class).getResultList();
			
		}

		@Override
		public boolean aglL3S2Delete(int id) {
	     try {
			Agl3s2 list=sessionFactory.getCurrentSession().load(Agl3s2.class, id);
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
		public boolean aglL3S2Update(Agl3s2 agl3s2) {
			try {
				sessionFactory.getCurrentSession().update(agl3s2);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			}
		}

		@Override
		public boolean aglL3S2Truncate(Agl3s2 agl3s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl3s2").executeUpdate();
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public Agl3s2 aglL3S2GetById(int id) {
			List<Agl3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Agl3s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
