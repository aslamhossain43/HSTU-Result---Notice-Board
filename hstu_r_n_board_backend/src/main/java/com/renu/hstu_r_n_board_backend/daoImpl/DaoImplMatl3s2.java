package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMatl3s2;
import com.renu.hstu_r_n_board_backend.dto.Matl3s1;
import com.renu.hstu_r_n_board_backend.dto.Matl3s2;

@Repository
@Transactional
public class DaoImplMatl3s2 implements DaoMatl3s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean matL3S2Add(Matl3s2 matl3s2) {
		try {
			sessionFactory.getCurrentSession().persist(matl3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	@Override
	public List<Matl3s2> matL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Matl3s2", Matl3s2.class).getResultList();
	}

	@Override
	public boolean matL3S2Delete(int id) {
		try {
			Matl3s2 list = sessionFactory.getCurrentSession().load(Matl3s2.class, id);
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
	public boolean matL3S2Update(Matl3s2 matl3s2) {
		try {
			sessionFactory.getCurrentSession().update(matl3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean matL3S2Truncate(Matl3s2 matl3s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Matl3s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Matl3s2 matL3S2GetById(int id) {

		List<Matl3s2> list = sessionFactory.getCurrentSession().createQuery("FROM Matl3s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;

	}

}
