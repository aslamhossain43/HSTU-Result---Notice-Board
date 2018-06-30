package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl2s1;
import com.renu.hstu_r_n_board_backend.dto.Socl2s1;

@Repository
@Transactional
public class DaoImplSocl2s1 implements DaoSocl2s1{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL2S1Add(Socl2s1 socl2s1) {
		try {
			sessionFactory.getCurrentSession().persist(socl2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl2s1> socL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl2s1",Socl2s1.class).getResultList();
	}

	@Override
	public boolean socL2S1Delete(int id) {
		try {
			Socl2s1 list = sessionFactory.getCurrentSession().load(Socl2s1.class, id);
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
	public boolean socL2S1Update(Socl2s1 socl2s1) {
		try {
			sessionFactory.getCurrentSession().update(socl2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL2S1Truncate(Socl2s1 socl2s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl2s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl2s1 socL2S1GetById(int id) {
		List<Socl2s1> list = sessionFactory.getCurrentSession().createQuery("FROM Socl2s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
