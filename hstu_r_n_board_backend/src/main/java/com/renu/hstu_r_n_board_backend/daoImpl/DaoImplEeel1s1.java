package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEeel1s1;
import com.renu.hstu_r_n_board_backend.dto.Eeel1s1;

@Repository
@Transactional
public class DaoImplEeel1s1 implements DaoEeel1s1{
@Autowired
private SessionFactory sessionFactory;

	@Override
	public boolean eeeL1S1Add(Eeel1s1 eeel1s1) {
try {
	sessionFactory.getCurrentSession().persist(eeel1s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Eeel1s1> eeeL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Eeel1s1", Eeel1s1.class).getResultList();
		
	}

	@Override
	public boolean eeeL1S1Delete(int id) {
try {
	Eeel1s1 list=sessionFactory.getCurrentSession().load(Eeel1s1.class, id);
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
	public boolean eeeL1S1Update(Eeel1s1 eeel1s1) {
	try {
		sessionFactory.getCurrentSession().update(eeel1s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean eeeL1S1Truncate(Eeel1s1 eeel1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Eeel1s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Eeel1s1 eeeL1S1GetById(int id) {
	List<Eeel1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Eeel1s1 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
	}

}
