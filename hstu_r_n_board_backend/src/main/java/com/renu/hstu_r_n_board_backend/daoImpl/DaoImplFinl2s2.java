package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFinl2s2;
import com.renu.hstu_r_n_board_backend.dto.Finl2s2;

@Repository
@Transactional
public class DaoImplFinl2s2 implements DaoFinl2s2{

	  @Autowired
	  private SessionFactory sessionFactory;
		@Override
		public boolean finL2S2Add(Finl2s2 finl2s2) {
			try {
				sessionFactory.getCurrentSession().persist(finl2s2);
				return true;
			} catch (Exception e) {
	          e.printStackTrace();
	          return false;
			
			}
		}

		@Override
		public List<Finl2s2> finL2S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Finl2s2", Finl2s2.class).getResultList();
		}

		@Override
		public boolean finL2S2Delete(int id) {
			try {
				Finl2s2 list=sessionFactory.getCurrentSession().load(Finl2s2.class, id);
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
		public boolean finL2S2Update(Finl2s2 finl2s2) {
	     try {
			sessionFactory.getCurrentSession().update(finl2s2);
			return true;
		} catch (Exception e) {
	      e.printStackTrace();
	      return false;
		
		}
		
		}

		@Override
		public boolean finL2S2Truncate(Finl2s2 finl2s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Finl2s2").executeUpdate();
				return true;
			} catch (Exception e) {
	    e.printStackTrace();
	    return false;
			
			}
		}

		@Override
		public Finl2s2 finL2S2GetById(int id) {
		List<Finl2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Finl2s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
