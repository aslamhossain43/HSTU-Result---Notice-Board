package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoStal2s2;
import com.renu.hstu_r_n_board_backend.dto.Stal2s2;

@Repository
@Transactional
public class DaoImplStal2s2 implements DaoStal2s2 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean staL2S2Add(Stal2s2 stal2s2) {
		try {
			sessionFactory.getCurrentSession().persist(stal2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Stal2s2> staL2S2GetAll() {

		return sessionFactory.getCurrentSession().createQuery("FROM Stal2s2", Stal2s2.class).getResultList();

	}

	@Override
	public boolean staL2S2Delete(int id) {
		try {
			Stal2s2 list = sessionFactory.getCurrentSession().load(Stal2s2.class, id);
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
	public boolean staL2S2Update(Stal2s2 stal2s2) {
		try {
			sessionFactory.getCurrentSession().update(stal2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean staL2S2Truncate(Stal2s2 stal2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Stal2s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Stal2s2 staL2S2GetById(int id) {
		List<Stal2s2> list = sessionFactory.getCurrentSession().createQuery("FROM Stal2s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
