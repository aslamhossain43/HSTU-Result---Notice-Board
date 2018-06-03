package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL4S1;
import com.renu.hstu_r_n_board_backend.dto.EceL3S1;
import com.renu.hstu_r_n_board_backend.dto.EceL4S1;

@Repository
@Transactional
public class DaoImplEceL4S1 implements DaoEceL4S1{

	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public boolean eceL4S1Add(EceL4S1 eceL4S1) {
		try {
			sessionFactory.getCurrentSession().persist(eceL4S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL4S1> eceL4S1GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL4S1", EceL4S1.class).getResultList();
	}

	@Override
	public boolean eceL4S1Update(EceL4S1 eceL4S1) {
		try {
			sessionFactory.getCurrentSession().update(eceL4S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL4S1Truncate(EceL4S1 eceL4S1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL4S1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL4S1 eceL4S1GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL4S1>list=sessionFactory.getCurrentSession().createQuery("FROM EceL4S1 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL4S1Delete(int id) {
		try {
			EceL4S1 list= sessionFactory.getCurrentSession().load(EceL4S1.class, id);
			if (list!=null) {
				sessionFactory.getCurrentSession().delete(list);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
