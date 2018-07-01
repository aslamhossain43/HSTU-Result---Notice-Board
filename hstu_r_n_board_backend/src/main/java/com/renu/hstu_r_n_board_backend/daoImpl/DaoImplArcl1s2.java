package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoArcl1s2;
import com.renu.hstu_r_n_board_backend.dto.Arcl1s2;

@Repository
@Transactional
public class DaoImplArcl1s2 implements DaoArcl1s2{

	 @Autowired
	  private SessionFactory sessionFactory;
	  
		@Override
		public boolean arcL1S2Add(Arcl1s2 arcl1s2) {
	try {
		sessionFactory.getCurrentSession().persist(arcl1s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public List<Arcl1s2> arcL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Arcl1s2", Arcl1s2.class).getResultList();
			
		}

		@Override
		public boolean arcL1S2Delete(int id) {
	try {
		Arcl1s2 list=sessionFactory.getCurrentSession().load(Arcl1s2.class, id);
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
		public boolean arcL1S2Update(Arcl1s2 arcl1s2) {
			try {
				sessionFactory.getCurrentSession().update(arcl1s2);
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public boolean arcL1S2Truncate(Arcl1s2 arcl1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Arcl1s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Arcl1s2 arcL1S2GetById(int id) {
	List<Arcl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Arcl1s2 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
		
		
		}


}
