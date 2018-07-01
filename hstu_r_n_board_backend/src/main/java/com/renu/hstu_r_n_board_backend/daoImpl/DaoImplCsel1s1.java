package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel1s1;
import com.renu.hstu_r_n_board_backend.dto.Csel1s1;

@Repository
@Transactional
public class DaoImplCsel1s1 implements DaoCsel1s1{
      @Autowired
      private SessionFactory sessionFactory;
	
	
	@Override
	public boolean cseL1S1Add(Csel1s1 csel1s1) {
try {
	sessionFactory.getCurrentSession().persist(csel1s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Csel1s1> cseL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Csel1s1", Csel1s1.class).getResultList();
		
	}

	@Override
	public boolean cseL1S1Delete(int id) {
		try {
			Csel1s1 list=sessionFactory.getCurrentSession().load(Csel1s1.class, id);
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
	public boolean cseL1S1Update(Csel1s1 csel1s1) {
try {
	sessionFactory.getCurrentSession().update(csel1s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public boolean cseL1S1Truncate(Csel1s1 csel1s1) {
try {
	sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel1s1").executeUpdate();
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public Csel1s1 cseL1S1GetById(int id) {
		List<Csel1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Csel1s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
