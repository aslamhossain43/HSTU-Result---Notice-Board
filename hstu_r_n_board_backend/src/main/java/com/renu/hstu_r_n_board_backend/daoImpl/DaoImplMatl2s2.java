package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMatl2s2;
import com.renu.hstu_r_n_board_backend.dto.Matl2s2;

@Repository
@Transactional
public class DaoImplMatl2s2 implements DaoMatl2s2{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean matL2S2Add(Matl2s2 matl2s2) {
		try {
			sessionFactory.getCurrentSession().persist(matl2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}

	}

	@Override
	public List<Matl2s2> matL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Matl2s2", Matl2s2.class).getResultList();
	}

	@Override
	public boolean matL2S2Delete(int id) {
		try {
			Matl2s2 list = sessionFactory.getCurrentSession().load(Matl2s2.class, id);
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
	public boolean matL2S2Update(Matl2s2 matl2s2) {
		try {
			sessionFactory.getCurrentSession().update(matl2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean matL2S2Truncate(Matl2s2 matl2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Matl2s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Matl2s2 matL2S2GetById(int id) {

		List<Matl2s2> list = sessionFactory.getCurrentSession().createQuery("FROM Matl2s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;

	}
	
}
