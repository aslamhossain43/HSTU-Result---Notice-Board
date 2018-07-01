package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMecl3s2;
import com.renu.hstu_r_n_board_backend.dto.Mecl3s2;

@Repository
@Transactional
public class DaoImplMecl3s2 implements DaoMecl3s2{


	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean mecL3S2Add(Mecl3s2 mecl3s2) {

		try {
			sessionFactory.getCurrentSession().persist(mecl3s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public List<Mecl3s2> mecL3S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Mecl3s2", Mecl3s2.class).getResultList();
			
		}

		@Override
		public boolean mecL3S2Delete(int id) {
	try {
		Mecl3s2 list=sessionFactory.getCurrentSession().load(Mecl3s2.class, id);
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
		public boolean mecL3S2Update(Mecl3s2 mecl3s2) {
		try {
			sessionFactory.getCurrentSession().update(mecl3s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public boolean mecL3S2Truncate(Mecl3s2 mecl3s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Mecl3s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Mecl3s2 mecL3S2GetById(int id) {
			List<Mecl3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Mecl3s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
