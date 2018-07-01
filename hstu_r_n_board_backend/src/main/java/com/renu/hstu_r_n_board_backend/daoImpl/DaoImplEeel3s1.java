package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEeel3s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel3s1;

@Repository
@Transactional
public class DaoImplEeel3s1 implements DaoEeel3s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean eeeL3S1Add(Eeel3s1 eeel3s1) {
	try {
		sessionFactory.getCurrentSession().persist(eeel3s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;

	}
		
		}

		@Override
		public List<Eeel3s1> eeeL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Eeel3s1", Eeel3s1.class).getResultList();
			
		}

		@Override
		public boolean eeeL3S1Delete(int id) {
	try {
		Eeel3s1 list=sessionFactory.getCurrentSession().load(Eeel3s1.class, id);
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
		public boolean eeeL3S1Update(Eeel3s1 eeel3s1) {
		try {
			sessionFactory.getCurrentSession().update(eeel3s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean eeeL3S1Truncate(Eeel3s1 eeel3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Eeel3s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Eeel3s1 eeeL3S1GetById(int id) {
		List<Eeel3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Eeel3s1 p where p.id=:id").setParameter("id", id).list();
		return list.size()>0?list.get(0):null;
		}
}
