package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll3s2;
import com.renu.hstu_r_n_board_backend.dto.Engll3s1;
import com.renu.hstu_r_n_board_backend.dto.Engll3s2;

@Repository
@Transactional
public class DaoImplEngll3s2 implements DaoEngll3s2{
	 @Autowired
     private SessionFactory sessioFactory;
     
	@Override
	public boolean englL3S2Add(Engll3s2 engll3s2) {
		try {
			sessioFactory.getCurrentSession().persist(engll3s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll3s2> englL3S2GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll3s2", Engll3s2.class).getResultList();
	}

	@Override
	public boolean englL3S2Delete(int id) {
   try {
		Engll3s2 list=sessioFactory.getCurrentSession().load(Engll3s2.class,id);
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
	public boolean englL3S2Update(Engll3s2 engll3s2) {
	try {
		sessioFactory.getCurrentSession().update(engll3s2);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL3S2Truncate(Engll3s2 engll3s2) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll3s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll3s2 englL3S2GetById(int id) {
	List<Engll3s2>list=sessioFactory.getCurrentSession().createQuery("FROM Engll3s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}
}
