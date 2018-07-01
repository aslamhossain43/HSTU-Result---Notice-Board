package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgel3s2;
import com.renu.hstu_r_n_board_backend.dto.Agel3s2;

@Repository
@Transactional
public class DaoImplAgel3s2 implements DaoAgel3s2{

	   @Autowired
	      private SessionFactory sessionFactory;
	      
		@Override
		public boolean ageL3S2Add(Agel3s2 agel3s2) {
			try {
				sessionFactory.getCurrentSession().persist(agel3s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agel3s2> ageL3S2GetAll() {

			return sessionFactory.getCurrentSession().createQuery("FROM Agel3s2", Agel3s2.class).getResultList();
			
		}

		@Override
		public boolean ageL3S2Delete(int id) {
			try {
				Agel3s2 list=sessionFactory.getCurrentSession().load(Agel3s2.class, id);
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
		public boolean ageL3S2Update(Agel3s2 agel3s2) {
		try {
			sessionFactory.getCurrentSession().update(agel3s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean ageL3S2Truncate(Agel3s2 agel3s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agel3s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Agel3s2 ageL3S2GetById(int id) {
			List<Agel3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Agel3s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}
}
