package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMatl1s1;
import com.renu.hstu_r_n_board_backend.dto.Matl1s1;

@Repository
@Transactional
public class DaoImplMatl1s1 implements DaoMatl1s1 {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean matL1S1Add(Matl1s1 matl1s1) {
		try {
			sessionFactory.getCurrentSession().persist(matl1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	@Override
	public List<Matl1s1> matL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Matl1s1", Matl1s1.class).getResultList();
	}

	@Override
	public boolean matL1S1Delete(int id) {
		try {
			Matl1s1 list = sessionFactory.getCurrentSession().load(Matl1s1.class, id);
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
	public boolean matL1S1Update(Matl1s1 matl1s1) {
		try {
			sessionFactory.getCurrentSession().update(matl1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean matL1S1Truncate(Matl1s1 matl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Matl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Matl1s1 matL1S1GetById(int id) {

		List<Matl1s1> list = sessionFactory.getCurrentSession().createQuery("FROM Matl1s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;

	}

}
