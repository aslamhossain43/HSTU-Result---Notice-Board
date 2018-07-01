package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl3s2;
import com.renu.hstu_r_n_board_backend.dto.Civl3s2;

@Repository
@Transactional
public class DaoImplCivl3s2 implements DaoCivl3s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean civL3S2Add(Civl3s2 civl3s2) {

		try {
			sessionFactory.getCurrentSession().persist(civl3s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public List<Civl3s2> civL3S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Civl3s2", Civl3s2.class).getResultList();
			
		}

		@Override
		public boolean civL3S2Delete(int id) {
			try {
				Civl3s2 list=sessionFactory.getCurrentSession().load(Civl3s2.class, id);
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
		public boolean civL3S2Update(Civl3s2 civl3s2) {
	try {
		sessionFactory.getCurrentSession().update(civl3s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public boolean civL3S2Truncate(Civl3s2 civl3s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl3s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Civl3s2 civL3S2GetById(int id) {
		List<Civl3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Civl3s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}

}
