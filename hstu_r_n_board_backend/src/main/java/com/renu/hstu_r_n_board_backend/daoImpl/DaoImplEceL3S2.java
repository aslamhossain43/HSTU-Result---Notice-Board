package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL3S2;
import com.renu.hstu_r_n_board_backend.dto.EceL3S2;

@Repository
@Transactional
public class DaoImplEceL3S2 implements DaoEceL3S2{


	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public boolean eceL3S2Add(EceL3S2 eceL3S2) {
		try {
			sessionFactory.getCurrentSession().persist(eceL3S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL3S2> eceL3S2GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL3S2", EceL3S2.class).getResultList();
	}

	@Override
	public boolean eceL3S2Update(EceL3S2 eceL3S2) {
		try {
			sessionFactory.getCurrentSession().update(eceL3S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL3S2Truncate(EceL3S2 eceL3S2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL3S2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL3S2 eceL3S2GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL3S2>list=sessionFactory.getCurrentSession().createQuery("FROM EceL3S2 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL3S2Delete(int id) {
		try {
			EceL3S2 list= sessionFactory.getCurrentSession().load(EceL3S2.class, id);
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
