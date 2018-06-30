package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl4s2;
import com.renu.hstu_r_n_board_backend.dto.Socl4s1;
import com.renu.hstu_r_n_board_backend.dto.Socl4s2;

@Repository
@Transactional
public class DaoImplSocl4s2 implements DaoSocl4s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL4S2Add(Socl4s2 socl4s2) {
		try {
			sessionFactory.getCurrentSession().persist(socl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl4s2> socL4S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl4s2",Socl4s2.class).getResultList();
	}

	@Override
	public boolean socL4S2Delete(int id) {
		try {
			Socl4s2 list = sessionFactory.getCurrentSession().load(Socl4s2.class, id);
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
	public boolean socL4S2Update(Socl4s2 socl4s2) {
		try {
			sessionFactory.getCurrentSession().update(socl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL4S2Truncate(Socl4s2 socl4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl4s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl4s2 socL4S2GetById(int id) {
		List<Socl4s2> list = sessionFactory.getCurrentSession().createQuery("FROM Socl4s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
