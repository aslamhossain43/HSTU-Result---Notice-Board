package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol4s2;
import com.renu.hstu_r_n_board_backend.dto.Ecol4s1;
import com.renu.hstu_r_n_board_backend.dto.Ecol4s2;

@Repository
@Transactional
public class DaoImplEcol4s2 implements DaoEcol4s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
     
	@Override
	public boolean ecoL4S2Add(Ecol4s2 ecol4s2) {
try {
	sessionFactory.getCurrentSession().persist(ecol4s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	}

	@Override
	public List<Ecol4s2> ecoL4S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol4s2", Ecol4s2.class).getResultList();
		
	}

	@Override
	public boolean ecoL4S2Delete(int id) {
		try {
			Ecol4s2 list=sessionFactory.getCurrentSession().load(Ecol4s2.class, id);
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
	public boolean ecoL4S2Update(Ecol4s2 ecol4s2) {
		try {
			sessionFactory.getCurrentSession().update(ecol4s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean ecoL4S2Truncate(Ecol4s2 ecol4s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol4s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Ecol4s2 ecoL4S2GetById(int id) {
		List<Ecol4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Ecol4s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
