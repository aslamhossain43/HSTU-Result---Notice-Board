package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl4s1;
import com.renu.hstu_r_n_board_backend.dto.Civl4s1;

@Repository
@Transactional
public class DaoImplCivl4s1 implements DaoCivl4s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean civL4S1Add(Civl4s1 civl4s1) {

		try {
			sessionFactory.getCurrentSession().persist(civl4s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public List<Civl4s1> civL4S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Civl4s1", Civl4s1.class).getResultList();
			
		}

		@Override
		public boolean civL4S1Delete(int id) {
			try {
				Civl4s1 list=sessionFactory.getCurrentSession().load(Civl4s1.class, id);
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
		public boolean civL4S1Update(Civl4s1 civl4s1) {
	try {
		sessionFactory.getCurrentSession().update(civl4s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public boolean civL4S1Truncate(Civl4s1 civl4s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl4s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Civl4s1 civL4S1GetById(int id) {
		List<Civl4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Civl4s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
