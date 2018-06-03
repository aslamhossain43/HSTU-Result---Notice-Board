package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL4S2;
import com.renu.hstu_r_n_board_backend.dto.EceL4S2;

@Repository
@Transactional
public class DaoImplEceL4S2 implements DaoEceL4S2{

	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public boolean eceL4S2Add(EceL4S2 eceL4S2) {
		try {
			sessionFactory.getCurrentSession().persist(eceL4S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL4S2> eceL4S2GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL4S2", EceL4S2.class).getResultList();
	}

	@Override
	public boolean eceL4S2Update(EceL4S2 eceL4S2) {
		try {
			sessionFactory.getCurrentSession().update(eceL4S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL4S2Truncate(EceL4S2 eceL4S2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL4S2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL4S2 eceL4S2GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL4S2>list=sessionFactory.getCurrentSession().createQuery("FROM EceL4S2 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL4S2Delete(int id) {
		try {
			EceL4S2 list= sessionFactory.getCurrentSession().load(EceL4S2.class, id);
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
