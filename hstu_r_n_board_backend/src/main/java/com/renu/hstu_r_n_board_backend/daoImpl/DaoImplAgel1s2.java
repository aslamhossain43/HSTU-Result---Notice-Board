package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgel1s2;
import com.renu.hstu_r_n_board_backend.dto.Agel1s2;

@Repository
@Transactional
public class DaoImplAgel1s2 implements DaoAgel1s2{

	   @Autowired
	      private SessionFactory sessionFactory;
	      
		@Override
		public boolean ageL1S2Add(Agel1s2 agel1s2) {
			try {
				sessionFactory.getCurrentSession().persist(agel1s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agel1s2> ageL1S2GetAll() {

			return sessionFactory.getCurrentSession().createQuery("FROM Agel1s2", Agel1s2.class).getResultList();
			
		}

		@Override
		public boolean ageL1S2Delete(int id) {
			try {
				Agel1s2 list=sessionFactory.getCurrentSession().load(Agel1s2.class, id);
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
		public boolean ageL1S2Update(Agel1s2 agel1s2) {
		try {
			sessionFactory.getCurrentSession().update(agel1s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean ageL1S2Truncate(Agel1s2 agel1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agel1s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Agel1s2 ageL1S2GetById(int id) {
			List<Agel1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Agel1s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
