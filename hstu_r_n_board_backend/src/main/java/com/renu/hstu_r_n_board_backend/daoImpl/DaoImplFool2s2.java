package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFool2s2;
import com.renu.hstu_r_n_board_backend.dto.Fool2s2;

@Repository
@Transactional
public class DaoImplFool2s2 implements DaoFool2s2{


    @Autowired
    private SessionFactory sessionFactory;
    
	@Override
	public boolean fooL2S2Add(Fool2s2 fool2s2) {
	try {
		sessionFactory.getCurrentSession().persist(fool2s2);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public List<Fool2s2> fooL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Fool2s2", Fool2s2.class).getResultList();
		
	}

	@Override
	public boolean fooL2S2Delete(int id) {
		try {
			Fool2s2 list=sessionFactory.getCurrentSession().load(Fool2s2.class, id);
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
	public boolean fooL2S2Update(Fool2s2 fool2s2) {
		try {
			sessionFactory.getCurrentSession().update(fool2s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean fooL2S2Truncate(Fool2s2 fool2s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fool2s2").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Fool2s2 fooL2S2GetById(int id) {
	List<Fool2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Fool2s2 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
	}
}
