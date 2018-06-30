package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFinl1s2;
import com.renu.hstu_r_n_board_backend.dto.Finl1s2;

@Repository
@Transactional
public class DaoImplFinl1s2 implements DaoFinl1s2{
	  @Autowired
	  private SessionFactory sessionFactory;
		@Override
		public boolean finL1S2Add(Finl1s2 finl1s2) {
			try {
				sessionFactory.getCurrentSession().persist(finl1s2);
				return true;
			} catch (Exception e) {
	          e.printStackTrace();
	          return false;
			
			}
		}

		@Override
		public List<Finl1s2> finL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Finl1s2", Finl1s2.class).getResultList();
		}

		@Override
		public boolean finL1S2Delete(int id) {
			try {
				Finl1s2 list=sessionFactory.getCurrentSession().load(Finl1s2.class, id);
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
		public boolean finL1S2Update(Finl1s2 finl1s2) {
	     try {
			sessionFactory.getCurrentSession().update(finl1s2);
			return true;
		} catch (Exception e) {
	      e.printStackTrace();
	      return false;
		
		}
		
		}

		@Override
		public boolean finL1S2Truncate(Finl1s2 finl1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Finl1s2").executeUpdate();
				return true;
			} catch (Exception e) {
	    e.printStackTrace();
	    return false;
			
			}
		}

		@Override
		public Finl1s2 finL1S2GetById(int id) {
		List<Finl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Finl1s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
