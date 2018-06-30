package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFinl4s2;
import com.renu.hstu_r_n_board_backend.dto.Finl4s2;

@Repository
@Transactional
public class DaoImplFinl4s2 implements DaoFinl4s2{

	  @Autowired
	  private SessionFactory sessionFactory;
		@Override
		public boolean finL4S2Add(Finl4s2 finl4s2) {
			try {
				sessionFactory.getCurrentSession().persist(finl4s2);
				return true;
			} catch (Exception e) {
	          e.printStackTrace();
	          return false;
			
			}
		}

		@Override
		public List<Finl4s2> finL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Finl4s2", Finl4s2.class).getResultList();
		}

		@Override
		public boolean finL4S2Delete(int id) {
			try {
				Finl4s2 list=sessionFactory.getCurrentSession().load(Finl4s2.class, id);
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
		public boolean finL4S2Update(Finl4s2 finl4s2) {
	     try {
			sessionFactory.getCurrentSession().update(finl4s2);
			return true;
		} catch (Exception e) {
	      e.printStackTrace();
	      return false;
		
		}
		
		}

		@Override
		public boolean finL4S2Truncate(Finl4s2 finl4s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Finl4s2").executeUpdate();
				return true;
			} catch (Exception e) {
	    e.printStackTrace();
	    return false;
			
			}
		}

		@Override
		public Finl4s2 finL4S2GetById(int id) {
		List<Finl4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Finl4s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}

}
