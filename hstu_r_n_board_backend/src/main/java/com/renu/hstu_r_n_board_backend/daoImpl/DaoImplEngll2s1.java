package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll2s1;
import com.renu.hstu_r_n_board_backend.dto.Engll1s1;
import com.renu.hstu_r_n_board_backend.dto.Engll2s1;

@Repository
@Transactional
public class DaoImplEngll2s1 implements DaoEngll2s1{

	 @Autowired
     private SessionFactory sessioFactory;
     
	@Override
	public boolean englL2S1Add(Engll2s1 engll2s1) {
		try {
			sessioFactory.getCurrentSession().persist(engll2s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll2s1> englL2S1GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll2s1", Engll2s1.class).getResultList();
	}

	@Override
	public boolean englL2S1Delete(int id) {
   try {
		Engll2s1 list=sessioFactory.getCurrentSession().load(Engll2s1.class,id);
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
	public boolean englL2S1Update(Engll2s1 engll2s1) {
	try {
		sessioFactory.getCurrentSession().update(engll2s1);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL2S1Truncate(Engll2s1 engll2s1) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll2s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll2s1 englL2S1GetById(int id) {
	List<Engll2s1>list=sessioFactory.getCurrentSession().createQuery("FROM Engll2s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}


}
