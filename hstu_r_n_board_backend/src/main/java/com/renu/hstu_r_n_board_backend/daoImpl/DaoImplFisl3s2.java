package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFisl3s2;
import com.renu.hstu_r_n_board_backend.dto.Fisl3s2;

@Repository
@Transactional
public class DaoImplFisl3s2 implements DaoFisl3s2{


	 @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean fisL3S2Add(Fisl3s2 fisl3s2) {
	        try {
				sessionFactory.getCurrentSession().persist(fisl3s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		
		}

		@Override
		public List<Fisl3s2> fisL3S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Fisl3s2", Fisl3s2.class).getResultList();
			
		}

		@Override
		public boolean fisL3S2Delete(int id) {
			try {
				Fisl3s2 list=sessionFactory.getCurrentSession().load(Fisl3s2.class, id);
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
		public boolean fisL3S2Update(Fisl3s2 fisl3s2) {
			try {
				sessionFactory.getCurrentSession().update(fisl3s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean fisL3S2Truncate(Fisl3s2 fisl3s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fisl3s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Fisl3s2 fisL3S2GetById(int id) {
		List<Fisl3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Fisl3s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
