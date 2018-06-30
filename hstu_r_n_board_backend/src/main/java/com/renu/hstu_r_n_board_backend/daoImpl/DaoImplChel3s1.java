package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoChel3s1;
import com.renu.hstu_r_n_board_backend.dto.Chel3s1;

@Repository
@Transactional
public class DaoImplChel3s1 implements DaoChel3s1{

	 @Autowired
	    private SessionFactory sessionFactory;
		@Override
		public boolean cheL3S1Add(Chel3s1 chel3s1) {
			try {
				sessionFactory.getCurrentSession().persist(chel3s1);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public List<Chel3s1> cheL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Chel3s1", Chel3s1.class).getResultList();
			
		}

		@Override
		public boolean cheL3S1Delete(int id) {
			try {
				Chel3s1 list=sessionFactory.getCurrentSession().load(Chel3s1.class, id);
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
		public boolean cheL3S1Update(Chel3s1 chel3s1) {
			try {
				sessionFactory.getCurrentSession().update(chel3s1);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public boolean cheL3S1Truncate(Chel3s1 chel3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Chel3s1").executeUpdate();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public Chel3s1 cheL3S1GetById(int id) {
			
				List<Chel3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Chel3s1 p where p.id=:id").setParameter("id", id).list();
				return list.size()>0?list.get(0):null;
			
		}
}
