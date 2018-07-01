package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgl1s1;
import com.renu.hstu_r_n_board_backend.dto.Agl1s1;

@Repository
@Transactional
public class DaoImplAgl1s1 implements DaoAgl1s1{
@Autowired
private SessionFactory sessionFactory;

	@Override
	public boolean aglL1S1Add(Agl1s1 agl1s1) {
		try {
			sessionFactory.getCurrentSession().persist(agl1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Agl1s1> aglL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Agl1s1", Agl1s1.class).getResultList();
		
	}

	@Override
	public boolean aglL1S1Delete(int id) {
     try {
		Agl1s1 list=sessionFactory.getCurrentSession().load(Agl1s1.class, id);
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
	public boolean aglL1S1Update(Agl1s1 agl1s1) {
		try {
			sessionFactory.getCurrentSession().update(agl1s1);
			return true;
		} catch (Exception e) {
      e.printStackTrace();
      return false;
		}
	}

	@Override
	public boolean aglL1S1Truncate(Agl1s1 agl1s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agl1s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Agl1s1 aglL1S1GetById(int id) {
		List<Agl1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agl1s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
