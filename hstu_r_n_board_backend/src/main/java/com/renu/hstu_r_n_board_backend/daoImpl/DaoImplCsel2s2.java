package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel2s2;
import com.renu.hstu_r_n_board_backend.dto.Csel2s2;

@Repository
@Transactional
public class DaoImplCsel2s2 implements DaoCsel2s2{

	 @Autowired
     private SessionFactory sessionFactory;
	
	
	@Override
	public boolean cseL2S2Add(Csel2s2 csel2s2) {
try {
	sessionFactory.getCurrentSession().persist(csel2s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Csel2s2> cseL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Csel2s2", Csel2s2.class).getResultList();
		
	}

	@Override
	public boolean cseL2S2Delete(int id) {
		try {
			Csel2s2 list=sessionFactory.getCurrentSession().load(Csel2s2.class, id);
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
	public boolean cseL2S2Update(Csel2s2 csel2s2) {
try {
	sessionFactory.getCurrentSession().update(csel2s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public boolean cseL2S2Truncate(Csel2s2 csel2s2) {
try {
	sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel2s2").executeUpdate();
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public Csel2s2 cseL2S2GetById(int id) {
		List<Csel2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Csel2s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}
}
