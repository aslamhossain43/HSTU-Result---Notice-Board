package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll3s1;
import com.renu.hstu_r_n_board_backend.dto.Engll3s1;

@Repository
@Transactional
public class DaoImplEngll3s1 implements DaoEngll3s1{

	 @Autowired
     private SessionFactory sessioFactory;
     
	@Override
	public boolean englL3S1Add(Engll3s1 engll3s1) {
		try {
			sessioFactory.getCurrentSession().persist(engll3s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll3s1> englL3S1GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll3s1", Engll3s1.class).getResultList();
	}

	@Override
	public boolean englL3S1Delete(int id) {
   try {
		Engll3s1 list=sessioFactory.getCurrentSession().load(Engll3s1.class,id);
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
	public boolean englL3S1Update(Engll3s1 engll3s1) {
	try {
		sessioFactory.getCurrentSession().update(engll3s1);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL3S1Truncate(Engll3s1 engll3s1) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll3s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll3s1 englL3S1GetById(int id) {
	List<Engll3s1>list=sessioFactory.getCurrentSession().createQuery("FROM Engll3s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
