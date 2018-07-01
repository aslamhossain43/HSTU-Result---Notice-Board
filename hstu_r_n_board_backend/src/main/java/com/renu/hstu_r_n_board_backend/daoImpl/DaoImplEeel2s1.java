package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEeel2s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s1;

@Repository
@Transactional
public class DaoImplEeel2s1 implements DaoEeel2s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean eeeL2S1Add(Eeel2s1 eeel2s1) {
	try {
		sessionFactory.getCurrentSession().persist(eeel2s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;

	}
		
		}

		@Override
		public List<Eeel2s1> eeeL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Eeel2s1", Eeel2s1.class).getResultList();
			
		}

		@Override
		public boolean eeeL2S1Delete(int id) {
	try {
		Eeel2s1 list=sessionFactory.getCurrentSession().load(Eeel2s1.class, id);
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
		public boolean eeeL2S1Update(Eeel2s1 eeel2s1) {
		try {
			sessionFactory.getCurrentSession().update(eeel2s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean eeeL2S1Truncate(Eeel2s1 eeel2s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Eeel2s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Eeel2s1 eeeL2S1GetById(int id) {
		List<Eeel2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Eeel2s1 p where p.id=:id").setParameter("id", id).list();
		return list.size()>0?list.get(0):null;
		}
}
