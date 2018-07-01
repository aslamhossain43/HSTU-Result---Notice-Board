package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFisl2s1;
import com.renu.hstu_r_n_board_backend.dto.Fisl2s1;

@Repository
@Transactional
public class DaoImplFisl2s1 implements DaoFisl2s1{

	 @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean fisL2S1Add(Fisl2s1 fisl2s1) {
	        try {
				sessionFactory.getCurrentSession().persist(fisl2s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		
		}

		@Override
		public List<Fisl2s1> fisL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Fisl2s1", Fisl2s1.class).getResultList();
			
		}

		@Override
		public boolean fisL2S1Delete(int id) {
			try {
				Fisl2s1 list=sessionFactory.getCurrentSession().load(Fisl2s1.class, id);
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
		public boolean fisL2S1Update(Fisl2s1 fisl2s1) {
			try {
				sessionFactory.getCurrentSession().update(fisl2s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean fisL2S1Truncate(Fisl2s1 fisl2s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fisl2s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Fisl2s1 fisL2S1GetById(int id) {
		List<Fisl2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Fisl2s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}

}
