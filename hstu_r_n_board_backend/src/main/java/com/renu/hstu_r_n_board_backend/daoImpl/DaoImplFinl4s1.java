package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFinl4s1;
import com.renu.hstu_r_n_board_backend.dto.Finl4s1;

@Repository
@Transactional
public class DaoImplFinl4s1 implements DaoFinl4s1{

	  @Autowired
	  private SessionFactory sessionFactory;
		@Override
		public boolean finL4S1Add(Finl4s1 finl4s1) {
			try {
				sessionFactory.getCurrentSession().persist(finl4s1);
				return true;
			} catch (Exception e) {
	          e.printStackTrace();
	          return false;
			
			}
		}

		@Override
		public List<Finl4s1> finL4S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Finl4s1", Finl4s1.class).getResultList();
		}

		@Override
		public boolean finL4S1Delete(int id) {
			try {
				Finl4s1 list=sessionFactory.getCurrentSession().load(Finl4s1.class, id);
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
		public boolean finL4S1Update(Finl4s1 finl4s1) {
	     try {
			sessionFactory.getCurrentSession().update(finl4s1);
			return true;
		} catch (Exception e) {
	      e.printStackTrace();
	      return false;
		
		}
		
		}

		@Override
		public boolean finL4S1Truncate(Finl4s1 finl4s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Finl4s1").executeUpdate();
				return true;
			} catch (Exception e) {
	    e.printStackTrace();
	    return false;
			
			}
		}

		@Override
		public Finl4s1 finL4S1GetById(int id) {
		List<Finl4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Finl4s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
