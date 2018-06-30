package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoStal1s1;
import com.renu.hstu_r_n_board_backend.dto.Stal1s1;

@Repository
@Transactional
public class DaoImplStal1s1 implements DaoStal1s1{
     @Autowired
     private SessionFactory sessionFactory;
     
	@Override
	public boolean staL1S1Add(Stal1s1 stal1s1) {
		try {
			sessionFactory.getCurrentSession().persist(stal1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Stal1s1> staL1S1GetAll() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Stal1s1", Stal1s1.class).getResultList();
		
	}

	@Override
	public boolean staL1S1Delete(int id) {
		try {
			Stal1s1 list=sessionFactory.getCurrentSession().load(Stal1s1.class, id);
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
	public boolean staL1S1Update(Stal1s1 stal1s1) {
		try {
			sessionFactory.getCurrentSession().update(stal1s1);
			return true;
		} catch (Exception e) {
      e.printStackTrace();
      return false;
		
		}
	}

	@Override
	public boolean staL1S1Truncate(Stal1s1 stal1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Stal1s1").executeUpdate();
			return true;
		} catch (Exception e) {
        e.printStackTrace();
        return false;
		
		}
	}

	@Override
	public Stal1s1 staL1S1GetById(int id) {
		List<Stal1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Stal1s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
