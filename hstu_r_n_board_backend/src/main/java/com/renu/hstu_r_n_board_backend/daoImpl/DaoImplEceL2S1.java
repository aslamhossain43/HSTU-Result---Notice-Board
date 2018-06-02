package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL2S1;
import com.renu.hstu_r_n_board_backend.dto.EceL2S1;

@Repository
@Transactional
public class DaoImplEceL2S1 implements DaoEceL2S1{
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public boolean eceL2S1Add(EceL2S1 eceL2S1) {
		try {
			sessionFactory.getCurrentSession().persist(eceL2S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL2S1> eceL2S1GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL2S1", EceL2S1.class).getResultList();
	}

	@Override
	public boolean eceL2S1Update(EceL2S1 eceL2S1) {
		try {
			sessionFactory.getCurrentSession().update(eceL2S1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL2S1Truncate(EceL2S1 eceL2S1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL2S1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL2S1 eceL2S1GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL2S1>list=sessionFactory.getCurrentSession().createQuery("FROM EceL2S1 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL2S1Delete(int id) {
		try {
			EceL2S1 list= sessionFactory.getCurrentSession().load(EceL2S1.class, id);
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
