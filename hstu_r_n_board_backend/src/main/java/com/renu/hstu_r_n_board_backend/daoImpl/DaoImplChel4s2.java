package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoChel4s2;
import com.renu.hstu_r_n_board_backend.dto.Chel4s2;

@Repository
@Transactional
public class DaoImplChel4s2 implements DaoChel4s2{

	 @Autowired
	    private SessionFactory sessionFactory;
		@Override
		public boolean cheL4S2Add(Chel4s2 chel4s2) {
			try {
				sessionFactory.getCurrentSession().persist(chel4s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public List<Chel4s2> cheL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Chel4s2", Chel4s2.class).getResultList();
			
		}

		@Override
		public boolean cheL4S2Delete(int id) {
			try {
				Chel4s2 list=sessionFactory.getCurrentSession().load(Chel4s2.class, id);
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
		public boolean cheL4S2Update(Chel4s2 chel4s2) {
			try {
				sessionFactory.getCurrentSession().update(chel4s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public boolean cheL4S2Truncate(Chel4s2 chel4s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Chel4s2").executeUpdate();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public Chel4s2 cheL4S2GetById(int id) {
			
				List<Chel4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Chel4s2 p where p.id=:id").setParameter("id", id).list();
				return list.size()>0?list.get(0):null;
			
		}
}
