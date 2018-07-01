package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl2s2;
import com.renu.hstu_r_n_board_backend.dto.Civl2s2;

@Repository
@Transactional
public class DaoImplCivl2s2 implements DaoCivl2s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean civL2S2Add(Civl2s2 civl2s2) {

		try {
			sessionFactory.getCurrentSession().persist(civl2s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public List<Civl2s2> civL2S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Civl2s2", Civl2s2.class).getResultList();
			
		}

		@Override
		public boolean civL2S2Delete(int id) {
			try {
				Civl2s2 list=sessionFactory.getCurrentSession().load(Civl2s2.class, id);
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
		public boolean civL2S2Update(Civl2s2 civl2s2) {
	try {
		sessionFactory.getCurrentSession().update(civl2s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public boolean civL2S2Truncate(Civl2s2 civl2s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl2s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Civl2s2 civL2S2GetById(int id) {
		List<Civl2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Civl2s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}

}
