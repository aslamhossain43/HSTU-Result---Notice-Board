package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEngll1s2;
import com.renu.hstu_r_n_board_backend.dto.Engll1s1;
import com.renu.hstu_r_n_board_backend.dto.Engll1s2;

@Repository
@Transactional
public class DaoImplEngll1s2 implements DaoEngll1s2{

	 @Autowired
     private SessionFactory sessioFactory;
     
	@Override
	public boolean englL1S2Add(Engll1s2 engll1s2) {
		try {
			sessioFactory.getCurrentSession().persist(engll1s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Engll1s2> englL1S2GetAll() {
		return sessioFactory.getCurrentSession().createQuery("FROM Engll1s2", Engll1s2.class).getResultList();
	}

	@Override
	public boolean englL1S2Delete(int id) {
   try {
		Engll1s2 list=sessioFactory.getCurrentSession().load(Engll1s2.class,id);
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
	public boolean englL1S2Update(Engll1s2 engll1s2) {
	try {
		sessioFactory.getCurrentSession().update(engll1s2);
		return true;
		
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean englL1S2Truncate(Engll1s2 engll1s2) {
		try {
			sessioFactory.getCurrentSession().createQuery("TRUNCATE TABLE Engll1s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Engll1s2 englL1S2GetById(int id) {
	List<Engll1s2>list=sessioFactory.getCurrentSession().createQuery("FROM Engll1s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}


}
