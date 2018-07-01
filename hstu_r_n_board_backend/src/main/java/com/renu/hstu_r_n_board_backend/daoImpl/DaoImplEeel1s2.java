package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEeel1s2;
import com.renu.hstu_r_n_board_backend.dto.Eeel1s2;

@Repository
@Transactional
public class DaoImplEeel1s2 implements DaoEeel1s2{
	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean eeeL1S2Add(Eeel1s2 eeel1s2) {
	try {
		sessionFactory.getCurrentSession().persist(eeel1s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;

	}
		
		}

		@Override
		public List<Eeel1s2> eeeL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Eeel1s2", Eeel1s2.class).getResultList();
			
		}

		@Override
		public boolean eeeL1S2Delete(int id) {
	try {
		Eeel1s2 list=sessionFactory.getCurrentSession().load(Eeel1s2.class, id);
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
		public boolean eeeL1S2Update(Eeel1s2 eeel1s2) {
		try {
			sessionFactory.getCurrentSession().update(eeel1s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public boolean eeeL1S2Truncate(Eeel1s2 eeel1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Eeel1s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			
			}
		}

		@Override
		public Eeel1s2 eeeL1S2GetById(int id) {
		List<Eeel1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Eeel1s2 p where p.id=:id").setParameter("id", id).list();
		return list.size()>0?list.get(0):null;
		}

}
