package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoStal3s2;
import com.renu.hstu_r_n_board_backend.dto.Stal3s2;

@Repository
@Transactional
public class DaoImplStal3s2 implements DaoStal3s2 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean staL3S2Add(Stal3s2 stal3s2) {
		try {
			sessionFactory.getCurrentSession().persist(stal3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Stal3s2> staL3S2GetAll() {

		return sessionFactory.getCurrentSession().createQuery("FROM Stal3s2", Stal3s2.class).getResultList();

	}

	@Override
	public boolean staL3S2Delete(int id) {
		try {
			Stal3s2 list = sessionFactory.getCurrentSession().load(Stal3s2.class, id);
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
	public boolean staL3S2Update(Stal3s2 stal3s2) {
		try {
			sessionFactory.getCurrentSession().update(stal3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean staL3S2Truncate(Stal3s2 stal3s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Stal3s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Stal3s2 staL3S2GetById(int id) {
		List<Stal3s2> list = sessionFactory.getCurrentSession().createQuery("FROM Stal3s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
