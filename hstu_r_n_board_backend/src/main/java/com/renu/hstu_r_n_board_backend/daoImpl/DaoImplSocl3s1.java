package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl3s1;
import com.renu.hstu_r_n_board_backend.dto.Socl3s1;

@Repository
@Transactional
public class DaoImplSocl3s1 implements DaoSocl3s1{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL3S1Add(Socl3s1 socl3s1) {
		try {
			sessionFactory.getCurrentSession().persist(socl3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl3s1> socL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl3s1",Socl3s1.class).getResultList();
	}

	@Override
	public boolean socL3S1Delete(int id) {
		try {
			Socl3s1 list = sessionFactory.getCurrentSession().load(Socl3s1.class, id);
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
	public boolean socL3S1Update(Socl3s1 socl3s1) {
		try {
			sessionFactory.getCurrentSession().update(socl3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL3S1Truncate(Socl3s1 socl3s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl3s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl3s1 socL3S1GetById(int id) {
		List<Socl3s1> list = sessionFactory.getCurrentSession().createQuery("FROM Socl3s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
