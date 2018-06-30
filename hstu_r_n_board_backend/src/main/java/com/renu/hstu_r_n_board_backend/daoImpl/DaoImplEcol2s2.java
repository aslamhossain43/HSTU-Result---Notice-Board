package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol2s2;
import com.renu.hstu_r_n_board_backend.dto.Ecol2s2;

@Repository
@Transactional
public class DaoImplEcol2s2 implements DaoEcol2s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
     
	@Override
	public boolean ecoL2S2Add(Ecol2s2 ecol2s2) {
try {
	sessionFactory.getCurrentSession().persist(ecol2s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	}

	@Override
	public List<Ecol2s2> ecoL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol2s2", Ecol2s2.class).getResultList();
		
	}

	@Override
	public boolean ecoL2S2Delete(int id) {
		try {
			Ecol2s2 list=sessionFactory.getCurrentSession().load(Ecol2s2.class, id);
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
	public boolean ecoL2S2Update(Ecol2s2 ecol2s2) {
		try {
			sessionFactory.getCurrentSession().update(ecol2s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean ecoL2S2Truncate(Ecol2s2 ecol2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol2s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Ecol2s2 ecoL2S2GetById(int id) {
		List<Ecol2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Ecol2s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}
}
