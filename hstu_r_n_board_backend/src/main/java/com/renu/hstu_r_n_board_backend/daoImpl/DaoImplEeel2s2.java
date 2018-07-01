package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEeel2s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel2s2;

@Repository
@Transactional
public class DaoImplEeel2s2 implements DaoEeel2s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean eeeL2S2Add(Eeel2s2 eeel2s2) {
	try {
		sessionFactory.getCurrentSession().persist(eeel2s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;

	}
		
		}

		@Override
		public List<Eeel2s2> eeeL2S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Eeel2s2", Eeel2s2.class).getResultList();
			
		}

		@Override
		public boolean eeeL2S2Delete(int id) {
	try {
		Eeel2s2 list=sessionFactory.getCurrentSession().load(Eeel2s2.class, id);
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
		public boolean eeeL2S2Update(Eeel2s2 eeel2s2) {
		try {
			sessionFactory.getCurrentSession().update(eeel2s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean eeeL2S2Truncate(Eeel2s2 eeel2s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Eeel2s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Eeel2s2 eeeL2S2GetById(int id) {
		List<Eeel2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Eeel2s2 p where p.id=:id").setParameter("id", id).list();
		return list.size()>0?list.get(0):null;
		}
}
