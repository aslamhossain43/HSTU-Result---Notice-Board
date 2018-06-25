package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoManl1s1;
import com.renu.hstu_r_n_board_backend.dto.Manl1s1;

@Repository
@Transactional
public class DaoImplManl1s1 implements DaoManl1s1 {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean manL1S1Add(Manl1s1 manl1s1) {
		try {
			sessionFactory.getCurrentSession().persist(manl1s1);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Manl1s1> manL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Manl1s1", Manl1s1.class).getResultList();
	}

	@Override
	public boolean manL1S1Delete(int id) {
		try {
			Manl1s1 list = sessionFactory.getCurrentSession().load(Manl1s1.class, id);
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
	public boolean manL1S1Update(Manl1s1 manl1s1) {
		try {
			sessionFactory.getCurrentSession().update(manl1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean manL1S1Truncate(Manl1s1 manl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Manl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Manl1s1 manL1S1GetById(int id) {
		List<Manl1s1> list = sessionFactory.getCurrentSession().createQuery("FROM Manl1s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
