package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAccl4s2;
import com.renu.hstu_r_n_board_backend.dto.Accl4s2;

@Repository
@Transactional
public class DaoImplAccl4s2 implements DaoAccl4s2{

	@Autowired
private SessionFactory sessionFactory;
	@Override
	public boolean accL4S2Add(Accl4s2 accl4s2) {
		try {
			sessionFactory.getCurrentSession().persist(accl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Accl4s2> accL4S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Accl4s2", Accl4s2.class).getResultList();
	}

	@Override
	public boolean accL4S2Delete(int id) {
		try {
			Accl4s2 list=sessionFactory.getCurrentSession().load(Accl4s2.class, id);
			if (list!=null) {
				sessionFactory.getCurrentSession().delete(list);
				
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean accL4S2Update(Accl4s2 accl4s2) {
		try {
			sessionFactory.getCurrentSession().update(accl4s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean accL4S2Truncate(Accl4s2 accl4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Accl4s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Accl4s2 accL4S2GetById(int id) {
		List<Accl4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Accl4s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
