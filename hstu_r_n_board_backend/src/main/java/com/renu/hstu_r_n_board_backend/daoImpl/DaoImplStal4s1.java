package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoStal4s1;
import com.renu.hstu_r_n_board_backend.dto.Stal4s1;

@Repository
@Transactional
public class DaoImplStal4s1 implements DaoStal4s1 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean staL4S1Add(Stal4s1 stal4s1) {
		try {
			sessionFactory.getCurrentSession().persist(stal4s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Stal4s1> staL4S1GetAll() {

		return sessionFactory.getCurrentSession().createQuery("FROM Stal4s1", Stal4s1.class).getResultList();

	}

	@Override
	public boolean staL4S1Delete(int id) {
		try {
			Stal4s1 list = sessionFactory.getCurrentSession().load(Stal4s1.class, id);
			if (list != null) {
				sessionFactory.getCurrentSession().delete(list);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean staL4S1Update(Stal4s1 stal4s1) {
		try {
			sessionFactory.getCurrentSession().update(stal4s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean staL4S1Truncate(Stal4s1 stal4s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Stal4s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Stal4s1 staL4S1GetById(int id) {
		List<Stal4s1> list = sessionFactory.getCurrentSession().createQuery("FROM Stal4s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
