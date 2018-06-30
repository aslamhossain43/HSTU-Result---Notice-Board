package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoPhyl2s1;
import com.renu.hstu_r_n_board_backend.dto.Phyl2s1;

@Repository
@Transactional
public class DaoImplPhyl2s1 implements DaoPhyl2s1{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean phyL2S1Add(Phyl2s1 phyl2s1) {
		try {
			sessionFactory.getCurrentSession().persist(phyl2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Phyl2s1> phyL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Phyl2s1", Phyl2s1.class).getResultList();

	}

	@Override
	public boolean phyL2S1Delete(int id) {
		try {
			Phyl2s1 list = sessionFactory.getCurrentSession().load(Phyl2s1.class, id);
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
	public boolean phyL2S1Update(Phyl2s1 phyl2s1) {
		try {
			sessionFactory.getCurrentSession().update(phyl2s1);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean phyL2S1Truncate(Phyl2s1 phyl2s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Phyl2s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Phyl2s1 phyL2S1GetById(int id) {
		List<Phyl2s1> list = sessionFactory.getCurrentSession().createQuery("FROM Phyl2s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
