package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMatl3s1;
import com.renu.hstu_r_n_board_backend.dto.Matl3s1;

@Repository
@Transactional
public class DaoImplMatl3s1 implements DaoMatl3s1 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean matL3S1Add(Matl3s1 matl3s1) {
		try {
			sessionFactory.getCurrentSession().persist(matl3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	@Override
	public List<Matl3s1> matL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Matl3s1", Matl3s1.class).getResultList();
	}

	@Override
	public boolean matL3S1Delete(int id) {
		try {
			Matl3s1 list = sessionFactory.getCurrentSession().load(Matl3s1.class, id);
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
	public boolean matL3S1Update(Matl3s1 matl3s1) {
		try {
			sessionFactory.getCurrentSession().update(matl3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean matL3S1Truncate(Matl3s1 matl3s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Matl3s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Matl3s1 matL3S1GetById(int id) {

		List<Matl3s1> list = sessionFactory.getCurrentSession().createQuery("FROM Matl3s1 p where p.id=:id").setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;

	}
}
