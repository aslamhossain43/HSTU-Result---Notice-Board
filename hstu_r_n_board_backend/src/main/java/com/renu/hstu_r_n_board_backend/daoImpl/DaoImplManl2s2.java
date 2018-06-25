package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoManl2s2;
import com.renu.hstu_r_n_board_backend.dto.Manl1s1;
import com.renu.hstu_r_n_board_backend.dto.Manl2s2;

@Repository
@Transactional
public class DaoImplManl2s2 implements DaoManl2s2{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean manL2S2Add(Manl2s2 manl2s2) {
		try {
			sessionFactory.getCurrentSession().persist(manl2s2);
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}

	}

	@Override
	public List<Manl2s2> manL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Manl2s2", Manl2s2.class).getResultList();
	}

	@Override
	public boolean manL2S2Delete(int id) {
		try {
			Manl2s2 list = sessionFactory.getCurrentSession().load(Manl2s2.class, id);
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
	public boolean manL2S2Update(Manl2s2 manl2s2) {
		try {
			sessionFactory.getCurrentSession().update(manl2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean manL2S2Truncate(Manl2s2 manl2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Manl2s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Manl2s2 manL2S2GetById(int id) {
		List<Manl2s2> list = sessionFactory.getCurrentSession().createQuery("FROM Manl2s2 p where p.id=:id")
				.setParameter("id", id).list();
		return list.size() > 0 ? list.get(0) : null;
	}

}
