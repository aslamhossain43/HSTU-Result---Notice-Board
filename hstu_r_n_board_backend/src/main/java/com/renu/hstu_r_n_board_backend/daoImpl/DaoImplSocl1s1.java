package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl1s1;
import com.renu.hstu_r_n_board_backend.dto.Socl1s1;

@Repository
@Transactional
public class DaoImplSocl1s1 implements DaoSocl1s1 {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL1S1Add(Socl1s1 socl1s1) {
		try {
			sessionFactory.getCurrentSession().persist(socl1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl1s1> socL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl1s1",Socl1s1.class).getResultList();
	}

	@Override
	public boolean socL1S1Delete(int id) {
		try {
			Socl1s1 list = sessionFactory.getCurrentSession().load(Socl1s1.class, id);
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
	public boolean socL1S1Update(Socl1s1 socl1s1) {
		try {
			sessionFactory.getCurrentSession().update(socl1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL1S1Truncate(Socl1s1 socl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl1s1 socL1S1GetById(int id) {
		List<Socl1s1> list = sessionFactory.getCurrentSession().createQuery("FROM Socl1s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
