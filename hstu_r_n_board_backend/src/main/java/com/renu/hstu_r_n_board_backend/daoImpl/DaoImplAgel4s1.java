package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgel4s1;
import com.renu.hstu_r_n_board_backend.dto.Agel4s1;

@Repository
@Transactional
public class DaoImplAgel4s1 implements DaoAgel4s1{

	   @Autowired
	      private SessionFactory sessionFactory;
	      
		@Override
		public boolean ageL4S1Add(Agel4s1 agel4s1) {
			try {
				sessionFactory.getCurrentSession().persist(agel4s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agel4s1> ageL4S1GetAll() {

			return sessionFactory.getCurrentSession().createQuery("FROM Agel4s1", Agel4s1.class).getResultList();
			
		}

		@Override
		public boolean ageL4S1Delete(int id) {
			try {
				Agel4s1 list=sessionFactory.getCurrentSession().load(Agel4s1.class, id);
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
		public boolean ageL4S1Update(Agel4s1 agel4s1) {
		try {
			sessionFactory.getCurrentSession().update(agel4s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean ageL4S1Truncate(Agel4s1 agel4s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agel4s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Agel4s1 ageL4S1GetById(int id) {
			List<Agel4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agel4s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}
}
