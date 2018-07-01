package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFisl2s2;
import com.renu.hstu_r_n_board_backend.dto.Fisl2s2;

@Repository
@Transactional
public class DaoImplFisl2s2 implements DaoFisl2s2{

	 @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean fisL2S2Add(Fisl2s2 fisl2s2) {
	        try {
				sessionFactory.getCurrentSession().persist(fisl2s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		
		}

		@Override
		public List<Fisl2s2> fisL2S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Fisl2s2", Fisl2s2.class).getResultList();
			
		}

		@Override
		public boolean fisL2S2Delete(int id) {
			try {
				Fisl2s2 list=sessionFactory.getCurrentSession().load(Fisl2s2.class, id);
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
		public boolean fisL2S2Update(Fisl2s2 fisl2s2) {
			try {
				sessionFactory.getCurrentSession().update(fisl2s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean fisL2S2Truncate(Fisl2s2 fisl2s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fisl2s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Fisl2s2 fisL2S2GetById(int id) {
		List<Fisl2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Fisl2s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
