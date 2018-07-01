package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel3s2;
import com.renu.hstu_r_n_board_backend.dto.Csel3s2;

@Repository
@Transactional
public class DaoImplCsel3s2 implements DaoCsel3s2{

	 @Autowired
     private SessionFactory sessionFactory;
	
	
	@Override
	public boolean cseL3S2Add(Csel3s2 csel3s2) {
try {
	sessionFactory.getCurrentSession().persist(csel3s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Csel3s2> cseL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Csel3s2", Csel3s2.class).getResultList();
		
	}

	@Override
	public boolean cseL3S2Delete(int id) {
		try {
			Csel3s2 list=sessionFactory.getCurrentSession().load(Csel3s2.class, id);
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
	public boolean cseL3S2Update(Csel3s2 csel3s2) {
try {
	sessionFactory.getCurrentSession().update(csel3s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public boolean cseL3S2Truncate(Csel3s2 csel3s2) {
try {
	sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel3s2").executeUpdate();
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public Csel3s2 cseL3S2GetById(int id) {
		List<Csel3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Csel3s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
