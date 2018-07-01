package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl2s1;
import com.renu.hstu_r_n_board_backend.dto.Civl2s1;

@Repository
@Transactional
public class DaoImplCivl2s1 implements DaoCivl2s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean civL2S1Add(Civl2s1 civl2s1) {

		try {
			sessionFactory.getCurrentSession().persist(civl2s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public List<Civl2s1> civL2S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Civl2s1", Civl2s1.class).getResultList();
			
		}

		@Override
		public boolean civL2S1Delete(int id) {
			try {
				Civl2s1 list=sessionFactory.getCurrentSession().load(Civl2s1.class, id);
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
		public boolean civL2S1Update(Civl2s1 civl2s1) {
	try {
		sessionFactory.getCurrentSession().update(civl2s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public boolean civL2S1Truncate(Civl2s1 civl2s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl2s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Civl2s1 civL2S1GetById(int id) {
		List<Civl2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Civl2s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
	    
}
