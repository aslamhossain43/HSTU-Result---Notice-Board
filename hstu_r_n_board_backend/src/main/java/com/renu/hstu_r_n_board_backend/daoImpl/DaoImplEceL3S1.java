package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL3S1;
import com.renu.hstu_r_n_board_backend.dto.EceL3S1;

@Repository
@Transactional
public class DaoImplEceL3S1 implements DaoEceL3S1{

	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public boolean eceL3S1Add(EceL3S1 eceL3S1) {
		try {
			sessionFactory.getCurrentSession().persist(eceL3S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL3S1> eceL3S1GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL3S1", EceL3S1.class).getResultList();
	}

	@Override
	public boolean eceL3S1Update(EceL3S1 eceL3S1) {
		try {
			sessionFactory.getCurrentSession().update(eceL3S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL3S1Truncate(EceL3S1 eceL3S1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL3S1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL3S1 eceL3S1GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL3S1>list=sessionFactory.getCurrentSession().createQuery("FROM EceL3S1 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL3S1Delete(int id) {
		try {
			EceL3S1 list= sessionFactory.getCurrentSession().load(EceL3S1.class, id);
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
