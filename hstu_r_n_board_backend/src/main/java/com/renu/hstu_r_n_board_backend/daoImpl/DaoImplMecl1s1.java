package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMecl1s1;
import com.renu.hstu_r_n_board_backend.dto.Mecl1s1;

@Repository
@Transactional
public class DaoImplMecl1s1 implements DaoMecl1s1{
@Autowired
private SessionFactory sessionFactory;

	@Override
	public boolean mecL1S1Add(Mecl1s1 mecl1s1) {

	try {
		sessionFactory.getCurrentSession().persist(mecl1s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	
	}
	}

	@Override
	public List<Mecl1s1> mecL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Mecl1s1", Mecl1s1.class).getResultList();
		
	}

	@Override
	public boolean mecL1S1Delete(int id) {
try {
	Mecl1s1 list=sessionFactory.getCurrentSession().load(Mecl1s1.class, id);
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
	public boolean mecL1S1Update(Mecl1s1 mecl1s1) {
	try {
		sessionFactory.getCurrentSession().update(mecl1s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	
	}
	}

	@Override
	public boolean mecL1S1Truncate(Mecl1s1 mecl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Mecl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Mecl1s1 mecL1S1GetById(int id) {
		List<Mecl1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Mecl1s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
