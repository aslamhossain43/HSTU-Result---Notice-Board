package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoManl3s2;
import com.renu.hstu_r_n_board_backend.dto.Manl1s1;
import com.renu.hstu_r_n_board_backend.dto.Manl3s2;

@Repository
@Transactional
public class DaoImplManl3s2 implements DaoManl3s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean manL3S2Add(Manl3s2 manl3s2) {
		try {
			sessionFactory.getCurrentSession().persist(manl3s2);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Manl3s2> manL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Manl3s2", Manl3s2.class).getResultList();
	}

	@Override
	public boolean manL3S2Delete(int id) {
		try {
			Manl3s2 list = sessionFactory.getCurrentSession().load(Manl3s2.class, id);
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
	public boolean manL3S2Update(Manl3s2 manl3s2) {
		try {
			sessionFactory.getCurrentSession().update(manl3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean manL3S2Truncate(Manl3s2 manl3s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Manl3s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Manl3s2 manL3S2GetById(int id) {
		List<Manl3s2> list = sessionFactory.getCurrentSession().createQuery("FROM Manl3s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
