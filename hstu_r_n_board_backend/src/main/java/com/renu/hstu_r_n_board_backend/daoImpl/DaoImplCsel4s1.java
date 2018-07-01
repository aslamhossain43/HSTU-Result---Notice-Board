package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel4s1;
import com.renu.hstu_r_n_board_backend.dto.Csel4s1;

@Repository
@Transactional
public class DaoImplCsel4s1 implements DaoCsel4s1{

	 @Autowired
    private SessionFactory sessionFactory;
	
	
	@Override
	public boolean cseL4S1Add(Csel4s1 csel4s1) {
try {
	sessionFactory.getCurrentSession().persist(csel4s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Csel4s1> cseL4S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Csel4s1", Csel4s1.class).getResultList();
		
	}

	@Override
	public boolean cseL4S1Delete(int id) {
		try {
			Csel4s1 list=sessionFactory.getCurrentSession().load(Csel4s1.class, id);
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
	public boolean cseL4S1Update(Csel4s1 csel4s1) {
try {
	sessionFactory.getCurrentSession().update(csel4s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public boolean cseL4S1Truncate(Csel4s1 csel4s1) {
try {
	sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel4s1").executeUpdate();
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public Csel4s1 cseL4S1GetById(int id) {
		List<Csel4s1>list=sessionFactory.getCurrentSession().createQuery("FROM Csel4s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}
}
