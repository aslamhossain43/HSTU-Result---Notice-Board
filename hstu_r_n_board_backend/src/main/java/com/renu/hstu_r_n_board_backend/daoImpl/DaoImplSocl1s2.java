package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl1s2;
import com.renu.hstu_r_n_board_backend.dto.Socl1s2;

@Repository
@Transactional
public class DaoImplSocl1s2 implements DaoSocl1s2 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL1S2Add(Socl1s2 socl1s2) {
		try {
			sessionFactory.getCurrentSession().persist(socl1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl1s2> socL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl1s2", Socl1s2.class).getResultList();
	}

	@Override
	public boolean socL1S2Delete(int id) {
		try {
			Socl1s2 list = sessionFactory.getCurrentSession().load(Socl1s2.class, id);
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
	public boolean socL1S2Update(Socl1s2 socl1s2) {
		try {
			sessionFactory.getCurrentSession().update(socl1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL1S2Truncate(Socl1s2 socl1s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl1s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl1s2 socL1S2GetById(int id) {
		List<Socl1s2> list = sessionFactory.getCurrentSession().createQuery("FROM Socl1s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
