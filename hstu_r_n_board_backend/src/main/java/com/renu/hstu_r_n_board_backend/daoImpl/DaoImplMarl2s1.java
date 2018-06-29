package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMarl2s1;
import com.renu.hstu_r_n_board_backend.dto.Marl2s1;
@Repository
@Transactional

public class DaoImplMarl2s1 implements DaoMarl2s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean marL2S1Add(Marl2s1 marl2s1) {
			try {
				sessionFactory.getCurrentSession().persist(marl2s1);
				return true;
			} catch (Exception e) {
	         e.printStackTrace();
	         return false;
			
			}
		}

		@Override
		public List<Marl2s1> marL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Marl2s1", Marl2s1.class).getResultList();
			
		}

		@Override
		public boolean marL2S1Delete(int id) {
			try {
				Marl2s1 list=sessionFactory.getCurrentSession().load(Marl2s1.class, id);
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
		public boolean marL2S1Update(Marl2s1 marl2s1) {
			try {
				sessionFactory.getCurrentSession().update(marl2s1);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			
			}
		}

		@Override
		public boolean marL2S1Truncate(Marl2s1 marl2s1) {
	         try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Marl2s1").executeUpdate();
				return true;
			} catch (Exception e) {

			e.printStackTrace();
			return false;
			}
		
		}

		@Override
		public Marl2s1 marL2S1GetById(int id) {
			List<Marl2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Marl2s1 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		}

}
