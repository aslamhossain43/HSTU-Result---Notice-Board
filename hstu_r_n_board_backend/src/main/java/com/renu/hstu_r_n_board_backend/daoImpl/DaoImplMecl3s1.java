package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMecl3s1;
import com.renu.hstu_r_n_board_backend.dto.Mecl3s1;

@Repository
@Transactional
public class DaoImplMecl3s1 implements DaoMecl3s1{


	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean mecL3S1Add(Mecl3s1 mecl3s1) {

		try {
			sessionFactory.getCurrentSession().persist(mecl3s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public List<Mecl3s1> mecL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Mecl3s1", Mecl3s1.class).getResultList();
			
		}

		@Override
		public boolean mecL3S1Delete(int id) {
	try {
		Mecl3s1 list=sessionFactory.getCurrentSession().load(Mecl3s1.class, id);
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
		public boolean mecL3S1Update(Mecl3s1 mecl3s1) {
		try {
			sessionFactory.getCurrentSession().update(mecl3s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public boolean mecL3S1Truncate(Mecl3s1 mecl3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Mecl3s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Mecl3s1 mecL3S1GetById(int id) {
			List<Mecl3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Mecl3s1 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
