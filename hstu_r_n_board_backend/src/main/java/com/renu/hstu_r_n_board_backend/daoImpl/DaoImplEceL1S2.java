package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL1S2;
import com.renu.hstu_r_n_board_backend.dto.EceL1S2;
@Repository
@Transactional
public class DaoImplEceL1S2 implements DaoEceL1S2{

	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public boolean eceL1S2Add(EceL1S2 eceL1S2) {
		try {
			sessionFactory.getCurrentSession().persist(eceL1S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL1S2> eceL1S2GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL1S2", EceL1S2.class).getResultList();
	}

	@Override
	public boolean eceL1S2Update(EceL1S2 eceL1S2) {
		try {
			sessionFactory.getCurrentSession().update(eceL1S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL1S2Truncate(EceL1S2 eceL1S2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL1S2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL1S2 eceL1S2GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL1S2>list=sessionFactory.getCurrentSession().createQuery("FROM EceL1S2 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL1S2Delete(int id) {
		try {
			EceL1S2 list= sessionFactory.getCurrentSession().load(EceL1S2.class, id);
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
