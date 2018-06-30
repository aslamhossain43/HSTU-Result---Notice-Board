package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFinl3s2;
import com.renu.hstu_r_n_board_backend.dto.Finl3s2;

@Repository
@Transactional
public class DaoImplFinl3s2 implements DaoFinl3s2{

	  @Autowired
	  private SessionFactory sessionFactory;
		@Override
		public boolean finL3S2Add(Finl3s2 finl3s2) {
			try {
				sessionFactory.getCurrentSession().persist(finl3s2);
				return true;
			} catch (Exception e) {
	          e.printStackTrace();
	          return false;
			
			}
		}

		@Override
		public List<Finl3s2> finL3S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Finl3s2", Finl3s2.class).getResultList();
		}

		@Override
		public boolean finL3S2Delete(int id) {
			try {
				Finl3s2 list=sessionFactory.getCurrentSession().load(Finl3s2.class, id);
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
		public boolean finL3S2Update(Finl3s2 finl3s2) {
	     try {
			sessionFactory.getCurrentSession().update(finl3s2);
			return true;
		} catch (Exception e) {
	      e.printStackTrace();
	      return false;
		
		}
		
		}

		@Override
		public boolean finL3S2Truncate(Finl3s2 finl3s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Finl3s2").executeUpdate();
				return true;
			} catch (Exception e) {
	    e.printStackTrace();
	    return false;
			
			}
		}

		@Override
		public Finl3s2 finL3S2GetById(int id) {
		List<Finl3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Finl3s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}

}
