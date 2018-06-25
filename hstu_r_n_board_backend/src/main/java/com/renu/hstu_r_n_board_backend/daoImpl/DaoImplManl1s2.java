package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoManl1s2;
import com.renu.hstu_r_n_board_backend.dto.Manl1s2;

@Repository
@Transactional
public class DaoImplManl1s2 implements DaoManl1s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean manL1S2Add(Manl1s2 manl1s2) {
		try {
			sessionFactory.getCurrentSession().persist(manl1s2);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Manl1s2> manL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Manl1s2", Manl1s2.class).getResultList();
	}

	@Override
	public boolean manL1S2Delete(int id) {
		try {
			Manl1s2 list = sessionFactory.getCurrentSession().load(Manl1s2.class, id);
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
	public boolean manL1S2Update(Manl1s2 manl1s2) {
		try {
			sessionFactory.getCurrentSession().update(manl1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean manL1S2Truncate(Manl1s2 manl1s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Manl1s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Manl1s2 manL1S2GetById(int id) {
		List<Manl1s2> list = sessionFactory.getCurrentSession().createQuery("FROM Manl1s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

	
}
