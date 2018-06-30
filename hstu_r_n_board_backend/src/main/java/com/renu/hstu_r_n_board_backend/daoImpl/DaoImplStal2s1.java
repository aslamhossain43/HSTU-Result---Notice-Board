package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoStal2s1;
import com.renu.hstu_r_n_board_backend.dto.Stal1s1;
import com.renu.hstu_r_n_board_backend.dto.Stal1s2;
import com.renu.hstu_r_n_board_backend.dto.Stal2s1;

@Repository
@Transactional
public class DaoImplStal2s1 implements DaoStal2s1 {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean staL2S1Add(Stal2s1 stal2s1) {
		try {
			sessionFactory.getCurrentSession().persist(stal2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Stal2s1> staL2S1GetAll() {

		return sessionFactory.getCurrentSession().createQuery("FROM Stal2s1", Stal2s1.class).getResultList();

	}

	@Override
	public boolean staL2S1Delete(int id) {
		try {
			Stal2s1 list = sessionFactory.getCurrentSession().load(Stal2s1.class, id);
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
	public boolean staL2S1Update(Stal2s1 stal2s1) {
		try {
			sessionFactory.getCurrentSession().update(stal2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean staL2S1Truncate(Stal2s1 stal2s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Stal2s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Stal2s1 staL2S1GetById(int id) {
		List<Stal2s1> list = sessionFactory.getCurrentSession().createQuery("FROM Stal2s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
