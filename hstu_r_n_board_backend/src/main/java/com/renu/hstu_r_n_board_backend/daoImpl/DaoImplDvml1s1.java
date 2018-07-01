package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml1s1;
import com.renu.hstu_r_n_board_backend.dto.Dvml1s1;

@Repository
@Transactional
public class DaoImplDvml1s1 implements DaoDvml1s1{
      @Autowired
      private SessionFactory sessionFactory;
      
	@Override
	public boolean dvmL1S1Add(Dvml1s1 dvml1s1) {
try {
	sessionFactory.getCurrentSession().persist(dvml1s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml1s1> dvmL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml1s1", Dvml1s1.class).getResultList();
	}

	@Override
	public boolean dvmL1S1Delete(int id) {
      try {
		Dvml1s1 list=sessionFactory.getCurrentSession().load(Dvml1s1.class, id);
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
	public boolean dvmL1S1Update(Dvml1s1 dvml1s1) {
		try {
			sessionFactory.getCurrentSession().update(dvml1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL1S1Truncate(Dvml1s1 dvml1s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml1s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml1s1 dvmL1S1GetById(int id) {
	List<Dvml1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml1s1 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
