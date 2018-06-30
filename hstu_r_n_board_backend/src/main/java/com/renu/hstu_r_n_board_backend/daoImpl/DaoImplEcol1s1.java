package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol1s1;
import com.renu.hstu_r_n_board_backend.dto.Ecol1s1;

@Repository
@Transactional
public class DaoImplEcol1s1 implements DaoEcol1s1 {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean ecoL1S1Add(Ecol1s1 ecol1s1) {
		try {
			sessionFactory.getCurrentSession().persist(ecol1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Ecol1s1> ecoL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol1s1", Ecol1s1.class).getResultList();

	}

	@Override
	public boolean ecoL1S1Delete(int id) {
		try {
			Ecol1s1 list = sessionFactory.getCurrentSession().load(Ecol1s1.class, id);
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
	public boolean ecoL1S1Update(Ecol1s1 ecol1s1) {
		try {
			sessionFactory.getCurrentSession().update(ecol1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean ecoL1S1Truncate(Ecol1s1 ecol1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol1s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;

		}
	}

	@Override
	public Ecol1s1 ecoL1S1GetById(int id) {
		List<Ecol1s1> list = sessionFactory.getCurrentSession().createQuery("FROM Ecol1s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
