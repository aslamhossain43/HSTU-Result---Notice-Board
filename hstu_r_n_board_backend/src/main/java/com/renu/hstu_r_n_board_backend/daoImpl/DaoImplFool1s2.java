package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoFool1s2;
import com.renu.hstu_r_n_board_backend.dto.Fool1s2;

@Repository
@Transactional
public class DaoImplFool1s2 implements DaoFool1s2{

    @Autowired
    private SessionFactory sessionFactory;
    
	@Override
	public boolean fooL1S2Add(Fool1s2 fool1s2) {
	try {
		sessionFactory.getCurrentSession().persist(fool1s2);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public List<Fool1s2> fooL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Fool1s2", Fool1s2.class).getResultList();
		
	}

	@Override
	public boolean fooL1S2Delete(int id) {
		try {
			Fool1s2 list=sessionFactory.getCurrentSession().load(Fool1s2.class, id);
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
	public boolean fooL1S2Update(Fool1s2 fool1s2) {
		try {
			sessionFactory.getCurrentSession().update(fool1s2);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public boolean fooL1S2Truncate(Fool1s2 fool1s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Fool1s2").executeUpdate();
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public Fool1s2 fooL1S2GetById(int id) {
	List<Fool1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Fool1s2 p where p.id=:id").setParameter("id", id).list();
	return list.size()>0?list.get(0):null;
	}

}
