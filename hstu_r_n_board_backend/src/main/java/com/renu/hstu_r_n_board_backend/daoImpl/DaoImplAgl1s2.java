package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl1s2;
import com.renu.hstu_r_n_board_backend.dto.Agl1s2;

@Repository
@Transactional
public class DaoImplAgl1s2 implements DaoAgl1s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean aglL1S2Add(Agl1s2 agl1s2) {
			try {
				sessionFactory.getCurrentSession().persist(agl1s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public List<Agl1s2> aglL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Agl1s2", Agl1s2.class).getResultList();
			
		}

		@Override
		public boolean aglL1S2Delete(int id) {
	     try {
			Agl1s2 list=sessionFactory.getCurrentSession().load(Agl1s2.class, id);
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
		public boolean aglL1S2Update(Agl1s2 agl1s2) {
			try {
				sessionFactory.getCurrentSession().update(agl1s2);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			}
		}

		@Override
		public boolean aglL1S2Truncate(Agl1s2 agl1s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl1s2").executeUpdate();
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public Agl1s2 aglL1S2GetById(int id) {
			List<Agl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Agl1s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
