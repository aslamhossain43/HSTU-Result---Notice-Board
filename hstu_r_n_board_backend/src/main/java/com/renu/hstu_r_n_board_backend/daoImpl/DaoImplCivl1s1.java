package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCivl1s1;
import com.renu.hstu_r_n_board_backend.dto.Civl1s1;

@Repository
@Transactional
public class DaoImplCivl1s1 implements DaoCivl1s1{
@Autowired
private SessionFactory sessionFactory;

	@Override
	public boolean civL1S1Add(Civl1s1 civl1s1) {

	try {
		sessionFactory.getCurrentSession().persist(civl1s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public List<Civl1s1> civL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Civl1s1", Civl1s1.class).getResultList();
		
	}

	@Override
	public boolean civL1S1Delete(int id) {
		try {
			Civl1s1 list=sessionFactory.getCurrentSession().load(Civl1s1.class, id);
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
	public boolean civL1S1Update(Civl1s1 civl1s1) {
try {
	sessionFactory.getCurrentSession().update(civl1s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public boolean civL1S1Truncate(Civl1s1 civl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Civl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Civl1s1 civL1S1GetById(int id) {
	List<Civl1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Civl1s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}
    
}
