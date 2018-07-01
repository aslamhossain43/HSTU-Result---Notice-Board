package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll4s2;
import com.renu.hstu_r_n_board_backend.dto.Engll4s2;

@Repository
@Transactional
public class DaoImplEngll4s2 implements DaoEngll4s2{
	 @Autowired
     private SessionFactory sessioFactory;
     
	@Override
	public boolean englL4S2Add(Engll4s2 engll4s2) {
		try {
			sessioFactory.getCurrentSession().persist(engll4s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll4s2> englL4S2GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll4s2", Engll4s2.class).getResultList();
	}

	@Override
	public boolean englL4S2Delete(int id) {
   try {
		Engll4s2 list=sessioFactory.getCurrentSession().load(Engll4s2.class,id);
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
	public boolean englL4S2Update(Engll4s2 engll4s2) {
	try {
		sessioFactory.getCurrentSession().update(engll4s2);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL4S2Truncate(Engll4s2 engll4s2) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll4s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll4s2 englL4S2GetById(int id) {
	List<Engll4s2>list=sessioFactory.getCurrentSession().createQuery("FROM Engll4s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}
}
