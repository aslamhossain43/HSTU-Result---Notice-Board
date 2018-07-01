package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel3s1;
import com.renu.hstu_r_n_board_backend.dto.Csel3s1;

@Repository
@Transactional
public class DaoImplCsel3s1 implements DaoCsel3s1{

	 @Autowired
     private SessionFactory sessionFactory;
	
	
	@Override
	public boolean cseL3S1Add(Csel3s1 csel3s1) {
try {
	sessionFactory.getCurrentSession().persist(csel3s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Csel3s1> cseL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Csel3s1", Csel3s1.class).getResultList();
		
	}

	@Override
	public boolean cseL3S1Delete(int id) {
		try {
			Csel3s1 list=sessionFactory.getCurrentSession().load(Csel3s1.class, id);
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
	public boolean cseL3S1Update(Csel3s1 csel3s1) {
try {
	sessionFactory.getCurrentSession().update(csel3s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public boolean cseL3S1Truncate(Csel3s1 csel3s1) {
try {
	sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel3s1").executeUpdate();
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public Csel3s1 cseL3S1GetById(int id) {
		List<Csel3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Csel3s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
