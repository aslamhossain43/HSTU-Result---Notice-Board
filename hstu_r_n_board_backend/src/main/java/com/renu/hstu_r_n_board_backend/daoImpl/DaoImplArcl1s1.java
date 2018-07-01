package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoArcl1s1;
import com.renu.hstu_r_n_board_backend.dto.Arcl1s1;

@Repository
@Transactional
public class DaoImplArcl1s1 implements DaoArcl1s1{
  @Autowired
  private SessionFactory sessionFactory;
  
	@Override
	public boolean arcL1S1Add(Arcl1s1 arcl1s1) {
try {
	sessionFactory.getCurrentSession().persist(arcl1s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public List<Arcl1s1> arcL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Arcl1s1", Arcl1s1.class).getResultList();
		
	}

	@Override
	public boolean arcL1S1Delete(int id) {
try {
	Arcl1s1 list=sessionFactory.getCurrentSession().load(Arcl1s1.class, id);
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
	public boolean arcL1S1Update(Arcl1s1 arcl1s1) {
		try {
			sessionFactory.getCurrentSession().update(arcl1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean arcL1S1Truncate(Arcl1s1 arcl1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Arcl1s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Arcl1s1 arcL1S1GetById(int id) {
List<Arcl1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Arcl1s1 p where p.id=:id").setParameter("id", id).list();
return list.size()>0?list.get(0):null;
	
	
	}

}
