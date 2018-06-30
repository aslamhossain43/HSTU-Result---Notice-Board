package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoPhyl1s2;
import com.renu.hstu_r_n_board_backend.dto.Phyl1s2;

@Repository
@Transactional
public class DaoImplPhyl1s2 implements DaoPhyl1s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean phyL1S2Add(Phyl1s2 phyl1s2) {
		try {
			sessionFactory.getCurrentSession().persist(phyl1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Phyl1s2> phyL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Phyl1s2", Phyl1s2.class).getResultList();

	}

	@Override
	public boolean phyL1S2Delete(int id) {
		try {
			Phyl1s2 list = sessionFactory.getCurrentSession().load(Phyl1s2.class, id);
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
	public boolean phyL1S2Update(Phyl1s2 phyl1s2) {
		try {
			sessionFactory.getCurrentSession().update(phyl1s2);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean phyL1S2Truncate(Phyl1s2 phyl1s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Phyl1s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Phyl1s2 phyL1S2GetById(int id) {
		List<Phyl1s2> list = sessionFactory.getCurrentSession().createQuery("FROM Phyl1s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}
}
