package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFool2s1;
import com.renu.hstu_r_n_board_backend.dto.Fool2s1;

@Repository
@Transactional
public class DaoImplFool2s1 implements DaoFool2s1{

    @Autowired
    private SessionFactory sessionFactory;
    
	@Override
	public boolean fooL2S1Add(Fool2s1 fool2s1) {
	try {
		sessionFactory.getCurrentSession().persist(fool2s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public List<Fool2s1> fooL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Fool2s1", Fool2s1.class).getResultList();
		
	}

	@Override
	public boolean fooL2S1Delete(int id) {
		try {
			Fool2s1 list=sessionFactory.getCurrentSession().load(Fool2s1.class, id);
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
	public boolean fooL2S1Update(Fool2s1 fool2s1) {
		try {
			sessionFactory.getCurrentSession().update(fool2s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean fooL2S1Truncate(Fool2s1 fool2s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fool2s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Fool2s1 fooL2S1GetById(int id) {
	List<Fool2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Fool2s1 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
	}
}
