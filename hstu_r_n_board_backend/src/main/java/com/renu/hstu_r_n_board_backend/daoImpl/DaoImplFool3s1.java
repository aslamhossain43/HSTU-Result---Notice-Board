package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFool3s1;
import com.renu.hstu_r_n_board_backend.dto.Fool3s1;

@Repository
@Transactional
public class DaoImplFool3s1 implements DaoFool3s1{


    @Autowired
    private SessionFactory sessionFactory;
    
	@Override
	public boolean fooL3S1Add(Fool3s1 fool3s1) {
	try {
		sessionFactory.getCurrentSession().persist(fool3s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public List<Fool3s1> fooL3S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Fool3s1", Fool3s1.class).getResultList();
		
	}

	@Override
	public boolean fooL3S1Delete(int id) {
		try {
			Fool3s1 list=sessionFactory.getCurrentSession().load(Fool3s1.class, id);
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
	public boolean fooL3S1Update(Fool3s1 fool3s1) {
		try {
			sessionFactory.getCurrentSession().update(fool3s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean fooL3S1Truncate(Fool3s1 fool3s1) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fool3s1").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Fool3s1 fooL3S1GetById(int id) {
	List<Fool3s1>list=sessionFactory.getCurrentSession().createQuery("FROM Fool3s1 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
	}
}
