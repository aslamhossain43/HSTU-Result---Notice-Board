package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoPhyl2s2;
import com.renu.hstu_r_n_board_backend.dto.Phyl2s2;

@Repository
@Transactional
public class DaoImplPhyl2s2 implements DaoPhyl2s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean phyL2S2Add(Phyl2s2 phyl2s2) {
		try {
			sessionFactory.getCurrentSession().persist(phyl2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Phyl2s2> phyL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Phyl2s2", Phyl2s2.class).getResultList();

	}

	@Override
	public boolean phyL2S2Delete(int id) {
		try {
			Phyl2s2 list = sessionFactory.getCurrentSession().load(Phyl2s2.class, id);
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
	public boolean phyL2S2Update(Phyl2s2 phyl2s2) {
		try {
			sessionFactory.getCurrentSession().update(phyl2s2);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean phyL2S2Truncate(Phyl2s2 phyl2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Phyl2s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Phyl2s2 phyL2S2GetById(int id) {
		List<Phyl2s2> list = sessionFactory.getCurrentSession().createQuery("FROM Phyl2s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
