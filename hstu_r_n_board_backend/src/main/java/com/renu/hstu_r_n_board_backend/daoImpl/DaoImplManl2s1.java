package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoManl2s1;
import com.renu.hstu_r_n_board_backend.dto.Manl1s1;
import com.renu.hstu_r_n_board_backend.dto.Manl2s1;

@Repository
@Transactional
public class DaoImplManl2s1 implements DaoManl2s1{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean manL2S1Add(Manl2s1 manl2s1) {
		try {
			sessionFactory.getCurrentSession().persist(manl2s1);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Manl2s1> manL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Manl2s1", Manl2s1.class).getResultList();
	}

	@Override
	public boolean manL2S1Delete(int id) {
		try {
			Manl2s1 list = sessionFactory.getCurrentSession().load(Manl2s1.class, id);
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
	public boolean manL2S1Update(Manl2s1 manl2s1) {
		try {
			sessionFactory.getCurrentSession().update(manl2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean manL2S1Truncate(Manl2s1 manl2s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Manl2s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Manl2s1 manL2S1GetById(int id) {
		List<Manl2s1> list = sessionFactory.getCurrentSession().createQuery("FROM Manl2s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
