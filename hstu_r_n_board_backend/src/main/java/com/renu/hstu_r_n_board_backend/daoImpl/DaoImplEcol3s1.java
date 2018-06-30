package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol3s1;
import com.renu.hstu_r_n_board_backend.dto.Ecol3s1;

@Repository
@Transactional
public class DaoImplEcol3s1 implements DaoEcol3s1{

	 @Autowired
     private SessionFactory sessionFactory;
     
     
	@Override
	public boolean ecoL3S1Add(Ecol3s1 ecol3s1) {
try {
	sessionFactory.getCurrentSession().persist(ecol3s1);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	}

	@Override
	public List<Ecol3s1> ecoL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol3s1", Ecol3s1.class).getResultList();
		
	}

	@Override
	public boolean ecoL3S1Delete(int id) {
		try {
			Ecol3s1 list=sessionFactory.getCurrentSession().load(Ecol3s1.class, id);
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
	public boolean ecoL3S1Update(Ecol3s1 ecol3s1) {
		try {
			sessionFactory.getCurrentSession().update(ecol3s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean ecoL3S1Truncate(Ecol3s1 ecol3s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol3s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Ecol3s1 ecoL3S1GetById(int id) {
		List<Ecol3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Ecol3s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}
}
