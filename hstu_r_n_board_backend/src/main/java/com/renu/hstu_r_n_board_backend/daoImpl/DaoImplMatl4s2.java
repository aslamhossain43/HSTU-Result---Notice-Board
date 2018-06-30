package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMatl4s2;
import com.renu.hstu_r_n_board_backend.dto.Matl4s1;
import com.renu.hstu_r_n_board_backend.dto.Matl4s2;

@Repository
@Transactional
public class DaoImplMatl4s2 implements DaoMatl4s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean matL4S2Add(Matl4s2 matl4s2) {
		try {
			sessionFactory.getCurrentSession().persist(matl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	@Override
	public List<Matl4s2> matL4S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Matl4s2", Matl4s2.class).getResultList();
	}

	@Override
	public boolean matL4S2Delete(int id) {
		try {
			Matl4s2 list = sessionFactory.getCurrentSession().load(Matl4s2.class, id);
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
	public boolean matL4S2Update(Matl4s2 matl4s2) {
		try {
			sessionFactory.getCurrentSession().update(matl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean matL4S2Truncate(Matl4s2 matl4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Matl4s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Matl4s2 matL4S2GetById(int id) {

		List<Matl4s2> list = sessionFactory.getCurrentSession().createQuery("FROM Matl4s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;

	}
}
