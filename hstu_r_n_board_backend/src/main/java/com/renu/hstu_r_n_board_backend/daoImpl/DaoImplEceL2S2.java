package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEceL2S2;
import com.renu.hstu_r_n_board_backend.dto.EceL2S2;

@Repository
@Transactional
public class DaoImplEceL2S2 implements DaoEceL2S2{
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public boolean eceL2S2Add(EceL2S2 eceL2S2) {
		try {
			sessionFactory.getCurrentSession().persist(eceL2S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<EceL2S2> eceL2S2GetAll() {
		//getting result and store in this class
		return sessionFactory.getCurrentSession().createQuery("FROM EceL2S2", EceL2S2.class).getResultList();
	}

	@Override
	public boolean eceL2S2Update(EceL2S2 eceL2S2) {
		try {
			sessionFactory.getCurrentSession().update(eceL2S2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean eceL2S2Truncate(EceL2S2 eceL2S2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE EceL2S2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public EceL2S2 eceL2S2GetById(int id) {
		//in setParameter first id refers the query id and next id is argument
		List<EceL2S2>list=sessionFactory.getCurrentSession().createQuery("FROM EceL2S2 p where p.id=:id").setParameter("id", id).list();
	
	return list.size()>0 ? list.get(0):null;
	}

	@Override
	public boolean eceL2S2Delete(int id) {
		try {
			EceL2S2 list= sessionFactory.getCurrentSession().load(EceL2S2.class, id);
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
