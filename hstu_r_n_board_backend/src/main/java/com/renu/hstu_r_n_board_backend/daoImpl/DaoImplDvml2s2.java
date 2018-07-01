package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoDvml2s2;
import com.renu.hstu_r_n_board_backend.dto.Dvml2s1;
import com.renu.hstu_r_n_board_backend.dto.Dvml2s2;

@Repository
@Transactional
public class DaoImplDvml2s2 implements DaoDvml2s2{

	 @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean dvmL2S2Add(Dvml2s2 dvml2s2) {
try {
	sessionFactory.getCurrentSession().persist(dvml2s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Dvml2s2> dvmL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Dvml2s2", Dvml2s2.class).getResultList();
	}

	@Override
	public boolean dvmL2S2Delete(int id) {
     try {
		Dvml2s2 list=sessionFactory.getCurrentSession().load(Dvml2s2.class, id);
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
	public boolean dvmL2S2Update(Dvml2s2 dvml2s2) {
		try {
			sessionFactory.getCurrentSession().update(dvml2s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean dvmL2S2Truncate(Dvml2s2 dvml2s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Dvml2s2").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Dvml2s2 dvmL2S2GetById(int id) {
	List<Dvml2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Dvml2s2 p where p.id=:id").setParameter("id",id).list();
	return list.size()>0?list.get(0):null;
	}

}
