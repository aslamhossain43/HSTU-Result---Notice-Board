package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFisl1s1;
import com.renu.hstu_r_n_board_backend.dto.Fisl1s1;

@Repository
@Transactional
public class DaoImplFisl1s1 implements DaoFisl1s1{
  @Autowired
  private SessionFactory sessionFactory;
  
	@Override
	public boolean fisL1S1Add(Fisl1s1 fisl1s1) {
        try {
			sessionFactory.getCurrentSession().persist(fisl1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	
	}

	@Override
	public List<Fisl1s1> fisL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Fisl1s1", Fisl1s1.class).getResultList();
		
	}

	@Override
	public boolean fisL1S1Delete(int id) {
		try {
			Fisl1s1 list=sessionFactory.getCurrentSession().load(Fisl1s1.class, id);
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
	public boolean fisL1S1Update(Fisl1s1 fisl1s1) {
		try {
			sessionFactory.getCurrentSession().update(fisl1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean fisL1S1Truncate(Fisl1s1 fisl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fisl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Fisl1s1 fisL1S1GetById(int id) {
	List<Fisl1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Fisl1s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
