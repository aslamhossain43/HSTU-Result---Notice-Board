package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoSocl2s2;
import com.renu.hstu_r_n_board_backend.dto.Socl2s1;
import com.renu.hstu_r_n_board_backend.dto.Socl2s2;

@Repository
@Transactional
public class DaoImplSocl2s2 implements DaoSocl2s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean socL2S2Add(Socl2s2 socl2s2) {
		try {
			sessionFactory.getCurrentSession().persist(socl2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public List<Socl2s2> socL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Socl2s2",Socl2s2.class).getResultList();
	}

	@Override
	public boolean socL2S2Delete(int id) {
		try {
			Socl2s2 list = sessionFactory.getCurrentSession().load(Socl2s2.class, id);
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
	public boolean socL2S2Update(Socl2s2 socl2s2) {
		try {
			sessionFactory.getCurrentSession().update(socl2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public boolean socL2S2Truncate(Socl2s2 socl2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Socl2s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Socl2s2 socL2S2GetById(int id) {
		List<Socl2s2> list = sessionFactory.getCurrentSession().createQuery("FROM Socl2s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
