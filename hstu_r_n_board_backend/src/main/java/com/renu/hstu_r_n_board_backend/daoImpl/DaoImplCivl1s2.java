package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl1s2;
import com.renu.hstu_r_n_board_backend.dto.Civl1s2;

@Repository
@Transactional
public class DaoImplCivl1s2 implements DaoCivl1s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean civL1S2Add(Civl1s2 civl1s2) {

		try {
			sessionFactory.getCurrentSession().persist(civl1s2);
			return true;
		} catch (Exception e) {
	e.printStackTrace();
	return false;
		}
		}

		@Override
		public List<Civl1s2> civL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Civl1s2", Civl1s2.class).getResultList();
			
		}

		@Override
		public boolean civL1S2Delete(int id) {
			try {
				Civl1s2 list=sessionFactory.getCurrentSession().load(Civl1s2.class, id);
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
		public boolean civL1S2Update(Civl1s2 civl1s2) {
	try {
		sessionFactory.getCurrentSession().update(civl1s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public boolean civL1S2Truncate(Civl1s2 civl1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl1s2").executeUpdate();
				return true;
			} catch (Exception e) {
	e.printStackTrace();
	return false;
			}
		}

		@Override
		public Civl1s2 civL1S2GetById(int id) {
		List<Civl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Civl1s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
		}
	    
		
		
	

}
