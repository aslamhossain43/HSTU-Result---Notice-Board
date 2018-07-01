package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFisl4s2;
import com.renu.hstu_r_n_board_backend.dto.Fisl4s2;

@Repository
@Transactional
public class DaoImplFisl4s2 implements DaoFisl4s2{


	 @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean fisL4S2Add(Fisl4s2 fisl4s2) {
	        try {
				sessionFactory.getCurrentSession().persist(fisl4s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		
		}

		@Override
		public List<Fisl4s2> fisL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Fisl4s2", Fisl4s2.class).getResultList();
			
		}

		@Override
		public boolean fisL4S2Delete(int id) {
			try {
				Fisl4s2 list=sessionFactory.getCurrentSession().load(Fisl4s2.class, id);
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
		public boolean fisL4S2Update(Fisl4s2 fisl4s2) {
			try {
				sessionFactory.getCurrentSession().update(fisl4s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean fisL4S2Truncate(Fisl4s2 fisl4s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fisl4s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Fisl4s2 fisL4S2GetById(int id) {
		List<Fisl4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Fisl4s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
