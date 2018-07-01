package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFool1s1;
import com.renu.hstu_r_n_board_backend.dto.Fool1s1;

@Repository
@Transactional
public class DaoImplFool1s1 implements DaoFool1s1{
      @Autowired
      private SessionFactory sessionFactory;
      
	@Override
	public boolean fooL1S1Add(Fool1s1 fool1s1) {
	try {
		sessionFactory.getCurrentSession().persist(fool1s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public List<Fool1s1> fooL1S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Fool1s1", Fool1s1.class).getResultList();
		
	}

	@Override
	public boolean fooL1S1Delete(int id) {
		try {
			Fool1s1 list=sessionFactory.getCurrentSession().load(Fool1s1.class, id);
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
	public boolean fooL1S1Update(Fool1s1 fool1s1) {
		try {
			sessionFactory.getCurrentSession().update(fool1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean fooL1S1Truncate(Fool1s1 fool1s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fool1s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Fool1s1 fooL1S1GetById(int id) {
	List<Fool1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Fool1s1 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
	}

}
