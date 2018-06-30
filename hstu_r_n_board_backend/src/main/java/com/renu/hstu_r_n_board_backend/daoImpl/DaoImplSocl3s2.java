package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl3s2;
import com.renu.hstu_r_n_board_backend.dto.Socl3s1;
import com.renu.hstu_r_n_board_backend.dto.Socl3s2;

@Repository
@Transactional
public class DaoImplSocl3s2 implements DaoSocl3s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL3S2Add(Socl3s2 socl3s2) {
		try {
			sessionFactory.getCurrentSession().persist(socl3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl3s2> socL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl3s2",Socl3s2.class).getResultList();
	}

	@Override
	public boolean socL3S2Delete(int id) {
		try {
			Socl3s2 list = sessionFactory.getCurrentSession().load(Socl3s2.class, id);
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
	public boolean socL3S2Update(Socl3s2 socl3s2) {
		try {
			sessionFactory.getCurrentSession().update(socl3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL3S2Truncate(Socl3s2 socl3s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl3s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl3s2 socL3S2GetById(int id) {
		List<Socl3s2> list = sessionFactory.getCurrentSession().createQuery("FROM Socl3s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
