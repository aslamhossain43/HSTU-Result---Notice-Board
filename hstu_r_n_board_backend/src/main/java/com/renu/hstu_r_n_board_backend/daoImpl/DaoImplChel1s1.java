package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoChel1s1;
import com.renu.hstu_r_n_board_backend.dto.Chel1s1;

@Repository
@Transactional
public class DaoImplChel1s1 implements DaoChel1s1{
       @Autowired
       private SessionFactory sessionFactory;
	@Override
	public boolean cheL1S1Add(Chel1s1 chel1s1) {
		try {
			sessionFactory.getCurrentSession().persist(chel1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Chel1s1> cheL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Chel1s1", Chel1s1.class).getResultList();
		
	}

	@Override
	public boolean cheL1S1Delete(int id) {
		try {
			Chel1s1 list=sessionFactory.getCurrentSession().load(Chel1s1.class, id);
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
	public boolean cheL1S1Update(Chel1s1 chel1s1) {
		try {
			sessionFactory.getCurrentSession().update(chel1s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean cheL1S1Truncate(Chel1s1 chel1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Chel1s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Chel1s1 cheL1S1GetById(int id) {
		
			List<Chel1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Chel1s1 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		
	}

}
