package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll1s1;
import com.renu.hstu_r_n_board_backend.dto.Engll1s1;

@Repository
@Transactional
public class DaoImplEngll1s1 implements DaoEngll1s1{
       @Autowired
       private SessionFactory sessioFactory;
       
	@Override
	public boolean englL1S1Add(Engll1s1 engll1s1) {
		try {
			sessioFactory.getCurrentSession().persist(engll1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll1s1> englL1S1GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll1s1", Engll1s1.class).getResultList();
	}

	@Override
	public boolean englL1S1Delete(int id) {
     try {
		Engll1s1 list=sessioFactory.getCurrentSession().load(Engll1s1.class,id);
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
	public boolean englL1S1Update(Engll1s1 engll1s1) {
	try {
		sessioFactory.getCurrentSession().update(engll1s1);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL1S1Truncate(Engll1s1 engll1s1) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll1s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll1s1 englL1S1GetById(int id) {
	List<Engll1s1>list=sessioFactory.getCurrentSession().createQuery("FROM Engll1s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
