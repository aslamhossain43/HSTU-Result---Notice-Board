package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgel2s1;
import com.renu.hstu_r_n_board_backend.dto.Agel2s1;

@Repository
@Transactional
public class DaoImplAgel2s1 implements DaoAgel2s1{

	   @Autowired
	      private SessionFactory sessionFactory;
	      
		@Override
		public boolean ageL2S1Add(Agel2s1 agel2s1) {
			try {
				sessionFactory.getCurrentSession().persist(agel2s1);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agel2s1> ageL2S1GetAll() {

			return sessionFactory.getCurrentSession().createQuery("FROM Agel2s1", Agel2s1.class).getResultList();
			
		}

		@Override
		public boolean ageL2S1Delete(int id) {
			try {
				Agel2s1 list=sessionFactory.getCurrentSession().load(Agel2s1.class, id);
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
		public boolean ageL2S1Update(Agel2s1 agel2s1) {
		try {
			sessionFactory.getCurrentSession().update(agel2s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean ageL2S1Truncate(Agel2s1 agel2s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agel2s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Agel2s1 ageL2S1GetById(int id) {
			List<Agel2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agel2s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
