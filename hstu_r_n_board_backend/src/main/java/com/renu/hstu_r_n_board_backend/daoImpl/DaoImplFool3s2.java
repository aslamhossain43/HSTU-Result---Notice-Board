package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFool3s2;
import com.renu.hstu_r_n_board_backend.dto.Fool3s2;

@Repository
@Transactional
public class DaoImplFool3s2 implements DaoFool3s2{


    @Autowired
    private SessionFactory sessionFactory;
    
	@Override
	public boolean fooL3S2Add(Fool3s2 fool3s2) {
	try {
		sessionFactory.getCurrentSession().persist(fool3s2);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public List<Fool3s2> fooL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Fool3s2", Fool3s2.class).getResultList();
		
	}

	@Override
	public boolean fooL3S2Delete(int id) {
		try {
			Fool3s2 list=sessionFactory.getCurrentSession().load(Fool3s2.class, id);
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
	public boolean fooL3S2Update(Fool3s2 fool3s2) {
		try {
			sessionFactory.getCurrentSession().update(fool3s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean fooL3S2Truncate(Fool3s2 fool3s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fool3s2").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Fool3s2 fooL3S2GetById(int id) {
	List<Fool3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Fool3s2 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
	}

}
