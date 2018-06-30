package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol3s2;
import com.renu.hstu_r_n_board_backend.dto.Ecol3s2;

@Repository
@Transactional
public class DaoImplEcol3s2 implements DaoEcol3s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
     
	@Override
	public boolean ecoL3S2Add(Ecol3s2 ecol3s2) {
try {
	sessionFactory.getCurrentSession().persist(ecol3s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	}

	@Override
	public List<Ecol3s2> ecoL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol3s2", Ecol3s2.class).getResultList();
		
	}

	@Override
	public boolean ecoL3S2Delete(int id) {
		try {
			Ecol3s2 list=sessionFactory.getCurrentSession().load(Ecol3s2.class, id);
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
	public boolean ecoL3S2Update(Ecol3s2 ecol3s2) {
		try {
			sessionFactory.getCurrentSession().update(ecol3s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean ecoL3S2Truncate(Ecol3s2 ecol3s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol3s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Ecol3s2 ecoL3S2GetById(int id) {
		List<Ecol3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Ecol3s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
