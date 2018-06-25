package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoManl3s1;
import com.renu.hstu_r_n_board_backend.dto.Manl1s1;
import com.renu.hstu_r_n_board_backend.dto.Manl3s1;

@Repository
@Transactional

public class DaoImplManl3s1 implements DaoManl3s1{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean manL3S1Add(Manl3s1 manl3s1) {
		try {
			sessionFactory.getCurrentSession().persist(manl3s1);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Manl3s1> manL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Manl3s1", Manl3s1.class).getResultList();
	}

	@Override
	public boolean manL3S1Delete(int id) {
		try {
			Manl3s1 list = sessionFactory.getCurrentSession().load(Manl3s1.class, id);
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
	public boolean manL3S1Update(Manl3s1 manl3s1) {
		try {
			sessionFactory.getCurrentSession().update(manl3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean manL3S1Truncate(Manl3s1 manl3s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Manl3s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Manl3s1 manL3S1GetById(int id) {
		List<Manl3s1> list = sessionFactory.getCurrentSession().createQuery("FROM Manl3s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
