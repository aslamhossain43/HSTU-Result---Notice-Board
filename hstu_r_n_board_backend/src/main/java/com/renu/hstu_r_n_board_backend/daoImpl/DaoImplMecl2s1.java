package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMecl2s1;
import com.renu.hstu_r_n_board_backend.dto.Mecl2s1;

@Repository
@Transactional
public class DaoImplMecl2s1 implements DaoMecl2s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean mecL2S1Add(Mecl2s1 mecl2s1) {

		try {
			sessionFactory.getCurrentSession().persist(mecl2s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public List<Mecl2s1> mecL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Mecl2s1", Mecl2s1.class).getResultList();
			
		}

		@Override
		public boolean mecL2S1Delete(int id) {
	try {
		Mecl2s1 list=sessionFactory.getCurrentSession().load(Mecl2s1.class, id);
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
		public boolean mecL2S1Update(Mecl2s1 mecl2s1) {
		try {
			sessionFactory.getCurrentSession().update(mecl2s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public boolean mecL2S1Truncate(Mecl2s1 mecl2s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Mecl2s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Mecl2s1 mecL2S1GetById(int id) {
			List<Mecl2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Mecl2s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}
}
