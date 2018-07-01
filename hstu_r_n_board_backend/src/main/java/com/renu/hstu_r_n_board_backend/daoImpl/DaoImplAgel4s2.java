package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgel4s2;
import com.renu.hstu_r_n_board_backend.dto.Agel4s2;

@Repository
@Transactional
public class DaoImplAgel4s2 implements DaoAgel4s2{

	   @Autowired
	      private SessionFactory sessionFactory;
	      
		@Override
		public boolean ageL4S2Add(Agel4s2 agel4s2) {
			try {
				sessionFactory.getCurrentSession().persist(agel4s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agel4s2> ageL4S2GetAll() {

			return sessionFactory.getCurrentSession().createQuery("FROM Agel4s2", Agel4s2.class).getResultList();
			
		}

		@Override
		public boolean ageL4S2Delete(int id) {
			try {
				Agel4s2 list=sessionFactory.getCurrentSession().load(Agel4s2.class, id);
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
		public boolean ageL4S2Update(Agel4s2 agel4s2) {
		try {
			sessionFactory.getCurrentSession().update(agel4s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean ageL4S2Truncate(Agel4s2 agel4s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agel4s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Agel4s2 ageL4S2GetById(int id) {
			List<Agel4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Agel4s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
