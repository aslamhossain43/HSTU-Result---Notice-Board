package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFisl3s1;
import com.renu.hstu_r_n_board_backend.dto.Fisl3s1;

@Repository
@Transactional
public class DaoImplFisl3s1 implements DaoFisl3s1{

	 @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean fisL3S1Add(Fisl3s1 fisl3s1) {
	        try {
				sessionFactory.getCurrentSession().persist(fisl3s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		
		}

		@Override
		public List<Fisl3s1> fisL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Fisl3s1", Fisl3s1.class).getResultList();
			
		}

		@Override
		public boolean fisL3S1Delete(int id) {
			try {
				Fisl3s1 list=sessionFactory.getCurrentSession().load(Fisl3s1.class, id);
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
		public boolean fisL3S1Update(Fisl3s1 fisl3s1) {
			try {
				sessionFactory.getCurrentSession().update(fisl3s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean fisL3S1Truncate(Fisl3s1 fisl3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fisl3s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Fisl3s1 fisL3S1GetById(int id) {
		List<Fisl3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Fisl3s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
