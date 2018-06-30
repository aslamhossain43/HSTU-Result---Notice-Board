package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoStal3s1;
import com.renu.hstu_r_n_board_backend.dto.Stal3s1;

@Repository
@Transactional
public class DaoImplStal3s1 implements DaoStal3s1 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean staL3S1Add(Stal3s1 stal3s1) {
		try {
			sessionFactory.getCurrentSession().persist(stal3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Stal3s1> staL3S1GetAll() {

		return sessionFactory.getCurrentSession().createQuery("FROM Stal3s1", Stal3s1.class).getResultList();

	}

	@Override
	public boolean staL3S1Delete(int id) {
		try {
			Stal3s1 list = sessionFactory.getCurrentSession().load(Stal3s1.class, id);
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
	public boolean staL3S1Update(Stal3s1 stal3s1) {
		try {
			sessionFactory.getCurrentSession().update(stal3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean staL3S1Truncate(Stal3s1 stal3s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Stal3s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Stal3s1 staL3S1GetById(int id) {
		List<Stal3s1> list = sessionFactory.getCurrentSession().createQuery("FROM Stal3s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
