package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoManl4s2;
import com.renu.hstu_r_n_board_backend.dto.Manl4s2;

@Repository
@Transactional
public class DaoImplManl4s2 implements DaoManl4s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean manL4S2Add(Manl4s2 manl4s2) {
		try {
			sessionFactory.getCurrentSession().persist(manl4s2);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Manl4s2> manL4S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Manl4s2", Manl4s2.class).getResultList();
	}

	@Override
	public boolean manL4S2Delete(int id) {
		try {
			Manl4s2 list = sessionFactory.getCurrentSession().load(Manl4s2.class, id);
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
	public boolean manL4S2Update(Manl4s2 manl4s2) {
		try {
			sessionFactory.getCurrentSession().update(manl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean manL4S2Truncate(Manl4s2 manl4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Manl4s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Manl4s2 manL4S2GetById(int id) {
		List<Manl4s2> list = sessionFactory.getCurrentSession().createQuery("FROM Manl4s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
