package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoChel2s2;
import com.renu.hstu_r_n_board_backend.dto.Chel2s2;

@Repository
@Transactional
public class DaoImplChel2s2 implements DaoChel2s2{

    @Autowired
    private SessionFactory sessionFactory;
	@Override
	public boolean cheL2S2Add(Chel2s2 chel2s2) {
		try {
			sessionFactory.getCurrentSession().persist(chel2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Chel2s2> cheL2S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Chel2s2", Chel2s2.class).getResultList();
		
	}

	@Override
	public boolean cheL2S2Delete(int id) {
		try {
			Chel2s2 list=sessionFactory.getCurrentSession().load(Chel2s2.class, id);
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
	public boolean cheL2S2Update(Chel2s2 chel2s2) {
		try {
			sessionFactory.getCurrentSession().update(chel2s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean cheL2S2Truncate(Chel2s2 chel2s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Chel2s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Chel2s2 cheL2S2GetById(int id) {
		
			List<Chel2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Chel2s2 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		
	}
}
