package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAccl3s1;
import com.renu.hstu_r_n_board_backend.dto.Accl3s1;

@Repository
@Transactional
public class DaoImplAccl3s1 implements DaoAccl3s1{
	@Autowired
private SessionFactory sessionFactory;
	@Override
	public boolean accL3S1Add(Accl3s1 accl3s1) {
		try {
			sessionFactory.getCurrentSession().persist(accl3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Accl3s1> accL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Accl3s1", Accl3s1.class).getResultList();
	}

	@Override
	public boolean accL3S1Delete(int id) {
		try {
			Accl3s1 list=sessionFactory.getCurrentSession().load(Accl3s1.class, id);
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
	public boolean accL3S1Update(Accl3s1 accl3s1) {
		try {
			sessionFactory.getCurrentSession().update(accl3s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean accL3S1Truncate(Accl3s1 accl3s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Accl3s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Accl3s1 accL3S1GetById(int id) {
		List<Accl3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Accl3s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
