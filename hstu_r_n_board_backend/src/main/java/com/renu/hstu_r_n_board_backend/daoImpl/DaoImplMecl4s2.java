package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMecl4s2;
import com.renu.hstu_r_n_board_backend.dto.Mecl4s2;

@Repository
@Transactional
public class DaoImplMecl4s2 implements DaoMecl4s2{


	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean mecL4S2Add(Mecl4s2 mecl4s2) {

		try {
			sessionFactory.getCurrentSession().persist(mecl4s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public List<Mecl4s2> mecL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Mecl4s2", Mecl4s2.class).getResultList();
			
		}

		@Override
		public boolean mecL4S2Delete(int id) {
	try {
		Mecl4s2 list=sessionFactory.getCurrentSession().load(Mecl4s2.class, id);
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
		public boolean mecL4S2Update(Mecl4s2 mecl4s2) {
		try {
			sessionFactory.getCurrentSession().update(mecl4s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public boolean mecL4S2Truncate(Mecl4s2 mecl4s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Mecl4s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Mecl4s2 mecL4S2GetById(int id) {
			List<Mecl4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Mecl4s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
