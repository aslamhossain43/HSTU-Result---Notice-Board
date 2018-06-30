package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoChel3s2;
import com.renu.hstu_r_n_board_backend.dto.Chel3s2;

@Repository
@Transactional
public class DaoImplChel3s2 implements DaoChel3s2{

	 @Autowired
	    private SessionFactory sessionFactory;
		@Override
		public boolean cheL3S2Add(Chel3s2 chel3s2) {
			try {
				sessionFactory.getCurrentSession().persist(chel3s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public List<Chel3s2> cheL3S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Chel3s2", Chel3s2.class).getResultList();
			
		}

		@Override
		public boolean cheL3S2Delete(int id) {
			try {
				Chel3s2 list=sessionFactory.getCurrentSession().load(Chel3s2.class, id);
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
		public boolean cheL3S2Update(Chel3s2 chel3s2) {
			try {
				sessionFactory.getCurrentSession().update(chel3s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public boolean cheL3S2Truncate(Chel3s2 chel3s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Chel3s2").executeUpdate();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public Chel3s2 cheL3S2GetById(int id) {
			
				List<Chel3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Chel3s2 p where p.id=:id").setParameter("id", id).list();
				return list.size()>0?list.get(0):null;
			
		}


}
