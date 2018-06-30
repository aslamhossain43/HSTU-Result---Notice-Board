package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol2s1;
import com.renu.hstu_r_n_board_backend.dto.Ecol2s1;

@Repository
@Transactional
public class DaoImplEcol2s1 implements DaoEcol2s1{

	 @Autowired
     private SessionFactory sessionFactory;
     
     
	@Override
	public boolean ecoL2S1Add(Ecol2s1 ecol2s1) {
try {
	sessionFactory.getCurrentSession().persist(ecol2s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	}

	@Override
	public List<Ecol2s1> ecoL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol2s1", Ecol2s1.class).getResultList();
		
	}

	@Override
	public boolean ecoL2S1Delete(int id) {
		try {
			Ecol2s1 list=sessionFactory.getCurrentSession().load(Ecol2s1.class, id);
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
	public boolean ecoL2S1Update(Ecol2s1 ecol2s1) {
		try {
			sessionFactory.getCurrentSession().update(ecol2s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean ecoL2S1Truncate(Ecol2s1 ecol2s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol2s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Ecol2s1 ecoL2S1GetById(int id) {
		List<Ecol2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Ecol2s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
