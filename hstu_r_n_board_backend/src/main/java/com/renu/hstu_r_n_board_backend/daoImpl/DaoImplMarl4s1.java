package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMarl4s1;
import com.renu.hstu_r_n_board_backend.dto.Marl4s1;

@Repository
@Transactional

public class DaoImplMarl4s1 implements DaoMarl4s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean marL4S1Add(Marl4s1 marl4s1) {
			try {
				sessionFactory.getCurrentSession().persist(marl4s1);
				return true;
			} catch (Exception e) {
	         e.printStackTrace();
	         return false;
			
			}
		}

		@Override
		public List<Marl4s1> marL4S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Marl4s1", Marl4s1.class).getResultList();
			
		}

		@Override
		public boolean marL4S1Delete(int id) {
			try {
				Marl4s1 list=sessionFactory.getCurrentSession().load(Marl4s1.class, id);
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
		public boolean marL4S1Update(Marl4s1 marl4s1) {
			try {
				sessionFactory.getCurrentSession().update(marl4s1);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			
			}
		}

		@Override
		public boolean marL4S1Truncate(Marl4s1 marl4s1) {
	         try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Marl4s1").executeUpdate();
				return true;
			} catch (Exception e) {

			e.printStackTrace();
			return false;
			}
		
		}

		@Override
		public Marl4s1 marL4S1GetById(int id) {
			List<Marl4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Marl4s1 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		}
		
}
