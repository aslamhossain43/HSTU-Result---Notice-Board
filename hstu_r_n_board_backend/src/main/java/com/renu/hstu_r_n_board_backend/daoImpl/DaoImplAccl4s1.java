package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAccl4s1;
import com.renu.hstu_r_n_board_backend.dto.Accl4s1;

@Repository
@Transactional
public class DaoImplAccl4s1 implements DaoAccl4s1{


	@Autowired
private SessionFactory sessionFactory;
	@Override
	public boolean accL4S1Add(Accl4s1 accl4s1) {
		try {
			sessionFactory.getCurrentSession().persist(accl4s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Accl4s1> accL4S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Accl4s1", Accl4s1.class).getResultList();
	}

	@Override
	public boolean accL4S1Delete(int id) {
		try {
			Accl4s1 list=sessionFactory.getCurrentSession().load(Accl4s1.class, id);
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
	public boolean accL4S1Update(Accl4s1 accl4s1) {
		try {
			sessionFactory.getCurrentSession().update(accl4s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean accL4S1Truncate(Accl4s1 accl4s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Accl4s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Accl4s1 accL4S1GetById(int id) {
		List<Accl4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Accl4s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
