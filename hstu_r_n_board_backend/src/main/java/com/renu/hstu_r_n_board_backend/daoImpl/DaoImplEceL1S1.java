package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S1;
import com.renu.hstu_r_n_board_backend.dto.EceL1S1;



@Repository
@Transactional
public class DaoImplEceL1S1 implements DaoEceL1S1{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	
	@Override
	public boolean eceL1S1Add(EceL1S1 eceL1S1) {
		try {
			sessionFactory.getCurrentSession().persist(eceL1S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL1S1> eceL1S1GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL1S1", EceL1S1.class).getResultList();
	}

	@Override
	public boolean eceL1S1Update(EceL1S1 eceL1S1) {
		try {
			sessionFactory.getCurrentSession().update(eceL1S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL1S1Truncate(EceL1S1 eceL1S1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL1S1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL1S1 eceL1S1GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL1S1>list=sessionFactory.getCurrentSession().createQuery("FROM EceL1S1 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL1S1Delete(int id) {
		try {
			EceL1S1 list= sessionFactory.getCurrentSession().load(EceL1S1.class, id);
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
