package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFinl2s1;
import com.renu.hstu_r_n_board_backend.dto.Finl2s1;

@Repository
@Transactional
public class DaoImplFinl2s1 implements DaoFinl2s1{

	  @Autowired
	  private SessionFactory sessionFactory;
		@Override
		public boolean finL2S1Add(Finl2s1 finl2s1) {
			try {
				sessionFactory.getCurrentSession().persist(finl2s1);
				return true;
			} catch (Exception e) {
	          e.printStackTrace();
	          return false;
			
			}
		}

		@Override
		public List<Finl2s1> finL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Finl2s1", Finl2s1.class).getResultList();
		}

		@Override
		public boolean finL2S1Delete(int id) {
			try {
				Finl2s1 list=sessionFactory.getCurrentSession().load(Finl2s1.class, id);
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
		public boolean finL2S1Update(Finl2s1 finl2s1) {
	     try {
			sessionFactory.getCurrentSession().update(finl2s1);
			return true;
		} catch (Exception e) {
	      e.printStackTrace();
	      return false;
		
		}
		
		}

		@Override
		public boolean finL2S1Truncate(Finl2s1 finl2s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Finl2s1").executeUpdate();
				return true;
			} catch (Exception e) {
	    e.printStackTrace();
	    return false;
			
			}
		}

		@Override
		public Finl2s1 finL2S1GetById(int id) {
		List<Finl2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Finl2s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
