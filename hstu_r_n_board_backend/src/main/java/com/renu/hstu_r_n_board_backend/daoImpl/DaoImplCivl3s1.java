package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl3s1;
import com.renu.hstu_r_n_board_backend.dto.Civl3s1;

@Repository
@Transactional
public class DaoImplCivl3s1 implements DaoCivl3s1{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean civL3S1Add(Civl3s1 civl3s1) {

		try {
			sessionFactory.getCurrentSession().persist(civl3s1);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public List<Civl3s1> civL3S1GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Civl3s1", Civl3s1.class).getResultList();
			
		}

		@Override
		public boolean civL3S1Delete(int id) {
			try {
				Civl3s1 list=sessionFactory.getCurrentSession().load(Civl3s1.class, id);
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
		public boolean civL3S1Update(Civl3s1 civl3s1) {
	try {
		sessionFactory.getCurrentSession().update(civl3s1);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public boolean civL3S1Truncate(Civl3s1 civl3s1) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl3s1").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Civl3s1 civL3S1GetById(int id) {
		List<Civl3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Civl3s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
