package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl4s1;
import com.renu.hstu_r_n_board_backend.dto.Socl4s1;

@Repository
@Transactional
public class DaoImplSocl4s1 implements DaoSocl4s1{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL4S1Add(Socl4s1 socl4s1) {
		try {
			sessionFactory.getCurrentSession().persist(socl4s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl4s1> socL4S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl4s1",Socl4s1.class).getResultList();
	}

	@Override
	public boolean socL4S1Delete(int id) {
		try {
			Socl4s1 list = sessionFactory.getCurrentSession().load(Socl4s1.class, id);
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
	public boolean socL4S1Update(Socl4s1 socl4s1) {
		try {
			sessionFactory.getCurrentSession().update(socl4s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL4S1Truncate(Socl4s1 socl4s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl4s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl4s1 socL4S1GetById(int id) {
		List<Socl4s1> list = sessionFactory.getCurrentSession().createQuery("FROM Socl4s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
