package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFisl1s2;
import com.renu.hstu_r_n_board_backend.dto.Fisl1s2;

@Repository
@Transactional
public class DaoImplFisl1s2 implements DaoFisl1s2{

	 @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean fisL1S2Add(Fisl1s2 fisl1s2) {
	        try {
				sessionFactory.getCurrentSession().persist(fisl1s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		
		}

		@Override
		public List<Fisl1s2> fisL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Fisl1s2", Fisl1s2.class).getResultList();
			
		}

		@Override
		public boolean fisL1S2Delete(int id) {
			try {
				Fisl1s2 list=sessionFactory.getCurrentSession().load(Fisl1s2.class, id);
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
		public boolean fisL1S2Update(Fisl1s2 fisl1s2) {
			try {
				sessionFactory.getCurrentSession().update(fisl1s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean fisL1S2Truncate(Fisl1s2 fisl1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fisl1s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Fisl1s2 fisL1S2GetById(int id) {
		List<Fisl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Fisl1s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}

}
