package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl4s2;
import com.renu.hstu_r_n_board_backend.dto.Civl4s2;

@Repository
@Transactional
public class DaoImplCivl4s2 implements DaoCivl4s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean civL4S2Add(Civl4s2 civl4s2) {

		try {
			sessionFactory.getCurrentSession().persist(civl4s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public List<Civl4s2> civL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Civl4s2", Civl4s2.class).getResultList();
			
		}

		@Override
		public boolean civL4S2Delete(int id) {
			try {
				Civl4s2 list=sessionFactory.getCurrentSession().load(Civl4s2.class, id);
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
		public boolean civL4S2Update(Civl4s2 civl4s2) {
	try {
		sessionFactory.getCurrentSession().update(civl4s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public boolean civL4S2Truncate(Civl4s2 civl4s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl4s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Civl4s2 civL4S2GetById(int id) {
		List<Civl4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Civl4s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
}
