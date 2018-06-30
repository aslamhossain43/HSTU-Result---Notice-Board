package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoPhyl1s1;
import com.renu.hstu_r_n_board_backend.dto.Phyl1s1;

@Repository
@Transactional
public class DaoImplPhyl1s1 implements DaoPhyl1s1 {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean phyL1S1Add(Phyl1s1 phyl1s1) {
		try {
			sessionFactory.getCurrentSession().persist(phyl1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Phyl1s1> phyL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Phyl1s1", Phyl1s1.class).getResultList();

	}

	@Override
	public boolean phyL1S1Delete(int id) {
		try {
			Phyl1s1 list = sessionFactory.getCurrentSession().load(Phyl1s1.class, id);
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
	public boolean phyL1S1Update(Phyl1s1 phyl1s1) {
		try {
			sessionFactory.getCurrentSession().update(phyl1s1);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean phyL1S1Truncate(Phyl1s1 phyl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Phyl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Phyl1s1 phyL1S1GetById(int id) {
		List<Phyl1s1> list = sessionFactory.getCurrentSession().createQuery("FROM Phyl1s1 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
