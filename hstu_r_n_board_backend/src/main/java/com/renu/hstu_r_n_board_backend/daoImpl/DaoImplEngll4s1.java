package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll4s1;
import com.renu.hstu_r_n_board_backend.dto.Engll4s1;

@Repository
@Transactional
public class DaoImplEngll4s1 implements DaoEngll4s1{
	 @Autowired
     private SessionFactory sessioFactory;
     
	@Override
	public boolean englL4S1Add(Engll4s1 engll4s1) {
		try {
			sessioFactory.getCurrentSession().persist(engll4s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll4s1> englL4S1GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll4s1", Engll4s1.class).getResultList();
	}

	@Override
	public boolean englL4S1Delete(int id) {
   try {
		Engll4s1 list=sessioFactory.getCurrentSession().load(Engll4s1.class,id);
		if (list!=null) {
			sessioFactory.getCurrentSession().delete(list);
		}
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	
	}

	@Override
	public boolean englL4S1Update(Engll4s1 engll4s1) {
	try {
		sessioFactory.getCurrentSession().update(engll4s1);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL4S1Truncate(Engll4s1 engll4s1) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll4s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll4s1 englL4S1GetById(int id) {
	List<Engll4s1>list=sessioFactory.getCurrentSession().createQuery("FROM Engll4s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}
}
