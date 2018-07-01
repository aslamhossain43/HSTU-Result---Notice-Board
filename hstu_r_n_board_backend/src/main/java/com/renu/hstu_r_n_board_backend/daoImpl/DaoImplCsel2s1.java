package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel2s1;
import com.renu.hstu_r_n_board_backend.dto.Csel2s1;

@Repository
@Transactional
public class DaoImplCsel2s1 implements DaoCsel2s1{

	 @Autowired
     private SessionFactory sessionFactory;
	
	
	@Override
	public boolean cseL2S1Add(Csel2s1 csel2s1) {
try {
	sessionFactory.getCurrentSession().persist(csel2s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Csel2s1> cseL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Csel2s1", Csel2s1.class).getResultList();
		
	}

	@Override
	public boolean cseL2S1Delete(int id) {
		try {
			Csel2s1 list=sessionFactory.getCurrentSession().load(Csel2s1.class, id);
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
	public boolean cseL2S1Update(Csel2s1 csel2s1) {
try {
	sessionFactory.getCurrentSession().update(csel2s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public boolean cseL2S1Truncate(Csel2s1 csel2s1) {
try {
	sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel2s1").executeUpdate();
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public Csel2s1 cseL2S1GetById(int id) {
		List<Csel2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Csel2s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
