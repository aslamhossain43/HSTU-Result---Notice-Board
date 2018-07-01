package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgel3s1;
import com.renu.hstu_r_n_board_backend.dto.Agel3s1;

@Repository
@Transactional
public class DaoImplAgel3s1 implements DaoAgel3s1{

	   @Autowired
	      private SessionFactory sessionFactory;
	      
		@Override
		public boolean ageL3S1Add(Agel3s1 agel3s1) {
			try {
				sessionFactory.getCurrentSession().persist(agel3s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agel3s1> ageL3S1GetAll() {

			return sessionFactory.getCurrentSession().createQuery("FROM Agel3s1", Agel3s1.class).getResultList();
			
		}

		@Override
		public boolean ageL3S1Delete(int id) {
			try {
				Agel3s1 list=sessionFactory.getCurrentSession().load(Agel3s1.class, id);
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
		public boolean ageL3S1Update(Agel3s1 agel3s1) {
		try {
			sessionFactory.getCurrentSession().update(agel3s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean ageL3S1Truncate(Agel3s1 agel3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agel3s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Agel3s1 ageL3S1GetById(int id) {
			List<Agel3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agel3s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}
}
