package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoPhyl4s2;
import com.renu.hstu_r_n_board_backend.dto.Phyl4s2;

@Repository
@Transactional
public class DaoImplPhyl4s2 implements DaoPhyl4s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean phyL4S2Add(Phyl4s2 phyl4s2) {
		try {
			sessionFactory.getCurrentSession().persist(phyl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Phyl4s2> phyL4S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Phyl4s2", Phyl4s2.class).getResultList();

	}

	@Override
	public boolean phyL4S2Delete(int id) {
		try {
			Phyl4s2 list = sessionFactory.getCurrentSession().load(Phyl4s2.class, id);
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
	public boolean phyL4S2Update(Phyl4s2 phyl4s2) {
		try {
			sessionFactory.getCurrentSession().update(phyl4s2);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean phyL4S2Truncate(Phyl4s2 phyl4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Phyl4s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Phyl4s2 phyL4S2GetById(int id) {
		List<Phyl4s2> list = sessionFactory.getCurrentSession().createQuery("FROM Phyl4s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
