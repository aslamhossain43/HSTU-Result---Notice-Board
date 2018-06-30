package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFinl3s1;
import com.renu.hstu_r_n_board_backend.dto.Finl3s1;

@Repository
@Transactional
public class DaoImplFinl3s1 implements DaoFinl3s1{

	  @Autowired
	  private SessionFactory sessionFactory;
		@Override
		public boolean finL3S1Add(Finl3s1 finl3s1) {
			try {
				sessionFactory.getCurrentSession().persist(finl3s1);
				return true;
			} catch (Exception e) {
	          e.printStackTrace();
	          return false;
			
			}
		}

		@Override
		public List<Finl3s1> finL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Finl3s1", Finl3s1.class).getResultList();
		}

		@Override
		public boolean finL3S1Delete(int id) {
			try {
				Finl3s1 list=sessionFactory.getCurrentSession().load(Finl3s1.class, id);
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
		public boolean finL3S1Update(Finl3s1 finl3s1) {
	     try {
			sessionFactory.getCurrentSession().update(finl3s1);
			return true;
		} catch (Exception e) {
	      e.printStackTrace();
	      return false;
		
		}
		
		}

		@Override
		public boolean finL3S1Truncate(Finl3s1 finl3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Finl3s1").executeUpdate();
				return true;
			} catch (Exception e) {
	    e.printStackTrace();
	    return false;
			
			}
		}

		@Override
		public Finl3s1 finL3S1GetById(int id) {
		List<Finl3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Finl3s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}

}
