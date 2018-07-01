package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMecl4s1;
import com.renu.hstu_r_n_board_backend.dto.Mecl4s1;

@Repository
@Transactional
public class DaoImplMecl4s1 implements DaoMecl4s1{


	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean mecL4S1Add(Mecl4s1 mecl4s1) {

		try {
			sessionFactory.getCurrentSession().persist(mecl4s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public List<Mecl4s1> mecL4S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Mecl4s1", Mecl4s1.class).getResultList();
			
		}

		@Override
		public boolean mecL4S1Delete(int id) {
	try {
		Mecl4s1 list=sessionFactory.getCurrentSession().load(Mecl4s1.class, id);
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
		public boolean mecL4S1Update(Mecl4s1 mecl4s1) {
		try {
			sessionFactory.getCurrentSession().update(mecl4s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public boolean mecL4S1Truncate(Mecl4s1 mecl4s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Mecl4s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Mecl4s1 mecL4S1GetById(int id) {
			List<Mecl4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Mecl4s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
