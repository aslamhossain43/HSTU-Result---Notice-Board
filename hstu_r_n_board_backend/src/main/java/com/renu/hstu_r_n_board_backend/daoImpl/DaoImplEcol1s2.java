package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoEcol1s2;
import com.renu.hstu_r_n_board_backend.dto.Ecol1s2;

@Repository
@Transactional
public class DaoImplEcol1s2 implements DaoEcol1s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
     
	@Override
	public boolean ecoL1S2Add(Ecol1s2 ecol1s2) {
try {
	sessionFactory.getCurrentSession().persist(ecol1s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	}

	@Override
	public List<Ecol1s2> ecoL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Ecol1s2", Ecol1s2.class).getResultList();
		
	}

	@Override
	public boolean ecoL1S2Delete(int id) {
		try {
			Ecol1s2 list=sessionFactory.getCurrentSession().load(Ecol1s2.class, id);
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
	public boolean ecoL1S2Update(Ecol1s2 ecol1s2) {
		try {
			sessionFactory.getCurrentSession().update(ecol1s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean ecoL1S2Truncate(Ecol1s2 ecol1s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Ecol1s2").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		
		}
	}

	@Override
	public Ecol1s2 ecoL1S2GetById(int id) {
		List<Ecol1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Ecol1s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}


}
