package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoStal4s2;
import com.renu.hstu_r_n_board_backend.dto.Stal4s2;

@Repository
@Transactional
public class DaoImplStal4s2 implements DaoStal4s2 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean staL4S2Add(Stal4s2 stal4s2) {
		try {
			sessionFactory.getCurrentSession().persist(stal4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Stal4s2> staL4S2GetAll() {

		return sessionFactory.getCurrentSession().createQuery("FROM Stal4s2", Stal4s2.class).getResultList();

	}

	@Override
	public boolean staL4S2Delete(int id) {
		try {
			Stal4s2 list = sessionFactory.getCurrentSession().load(Stal4s2.class, id);
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
	public boolean staL4S2Update(Stal4s2 stal4s2) {
		try {
			sessionFactory.getCurrentSession().update(stal4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean staL4S2Truncate(Stal4s2 stal4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Stal4s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Stal4s2 staL4S2GetById(int id) {
		List<Stal4s2> list = sessionFactory.getCurrentSession().createQuery("FROM Stal4s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
