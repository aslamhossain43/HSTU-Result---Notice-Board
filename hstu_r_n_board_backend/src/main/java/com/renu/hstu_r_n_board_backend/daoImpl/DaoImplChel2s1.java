package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoChel2s1;
import com.renu.hstu_r_n_board_backend.dto.Chel2s1;

@Repository
@Transactional
public class DaoImplChel2s1 implements DaoChel2s1{

    @Autowired
    private SessionFactory sessionFactory;
	@Override
	public boolean cheL2S1Add(Chel2s1 chel2s1) {
		try {
			sessionFactory.getCurrentSession().persist(chel2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Chel2s1> cheL2S1GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Chel2s1", Chel2s1.class).getResultList();
		
	}

	@Override
	public boolean cheL2S1Delete(int id) {
		try {
			Chel2s1 list=sessionFactory.getCurrentSession().load(Chel2s1.class, id);
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
	public boolean cheL2S1Update(Chel2s1 chel2s1) {
		try {
			sessionFactory.getCurrentSession().update(chel2s1);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean cheL2S1Truncate(Chel2s1 chel2s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Chel2s1").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Chel2s1 cheL2S1GetById(int id) {
		
			List<Chel2s1>list=sessionFactory.getCurrentSession().createQuery("FROM Chel2s1 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		
	}
}
