package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll2s2;
import com.renu.hstu_r_n_board_backend.dto.Engll2s1;
import com.renu.hstu_r_n_board_backend.dto.Engll2s2;

@Repository
@Transactional
public class DaoImplEngll2s2 implements DaoEngll2s2{

	 @Autowired
     private SessionFactory sessioFactory;
     
	@Override
	public boolean englL2S2Add(Engll2s2 engll2s2) {
		try {
			sessioFactory.getCurrentSession().persist(engll2s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll2s2> englL2S2GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll2s2", Engll2s2.class).getResultList();
	}

	@Override
	public boolean englL2S2Delete(int id) {
   try {
		Engll2s2 list=sessioFactory.getCurrentSession().load(Engll2s2.class,id);
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
	public boolean englL2S2Update(Engll2s2 engll2s2) {
	try {
		sessioFactory.getCurrentSession().update(engll2s2);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL2S2Truncate(Engll2s2 engll2s2) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll2s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll2s2 englL2S2GetById(int id) {
	List<Engll2s2>list=sessioFactory.getCurrentSession().createQuery("FROM Engll2s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
