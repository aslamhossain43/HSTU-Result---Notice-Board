package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMecl1s2;
import com.renu.hstu_r_n_board_backend.dto.Mecl1s2;

@Repository
@Transactional
public class DaoImplMecl1s2 implements DaoMecl1s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean mecL1S2Add(Mecl1s2 mecl1s2) {

		try {
			sessionFactory.getCurrentSession().persist(mecl1s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public List<Mecl1s2> mecL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Mecl1s2", Mecl1s2.class).getResultList();
			
		}

		@Override
		public boolean mecL1S2Delete(int id) {
	try {
		Mecl1s2 list=sessionFactory.getCurrentSession().load(Mecl1s2.class, id);
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
		public boolean mecL1S2Update(Mecl1s2 mecl1s2) {
		try {
			sessionFactory.getCurrentSession().update(mecl1s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		
		}
		}

		@Override
		public boolean mecL1S2Truncate(Mecl1s2 mecl1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Mecl1s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Mecl1s2 mecL1S2GetById(int id) {
			List<Mecl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Mecl1s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}
}
