package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMatl1s2;
import com.renu.hstu_r_n_board_backend.dto.Matl1s1;
import com.renu.hstu_r_n_board_backend.dto.Matl1s2;

@Repository
@Transactional
public class DaoImplMatl1s2 implements DaoMatl1s2 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean matL1S2Add(Matl1s2 matl1s2) {
		try {
			sessionFactory.getCurrentSession().persist(matl1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	@Override
	public List<Matl1s2> matL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Matl1s2", Matl1s2.class).getResultList();
	}

	@Override
	public boolean matL1S2Delete(int id) {
		try {
			Matl1s2 list = sessionFactory.getCurrentSession().load(Matl1s2.class, id);
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
	public boolean matL1S2Update(Matl1s2 matl1s2) {
		try {
			sessionFactory.getCurrentSession().update(matl1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean matL1S2Truncate(Matl1s2 matl1s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Matl1s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Matl1s2 matL1S2GetById(int id) {

		List<Matl1s2> list = sessionFactory.getCurrentSession().createQuery("FROM Matl1s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;

	}

}
