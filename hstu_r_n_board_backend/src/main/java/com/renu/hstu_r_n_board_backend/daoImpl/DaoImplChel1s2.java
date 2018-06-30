package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoChel1s2;
import com.renu.hstu_r_n_board_backend.dto.Chel1s2;

@Repository
@Transactional
public class DaoImplChel1s2 implements DaoChel1s2{

    @Autowired
    private SessionFactory sessionFactory;
	@Override
	public boolean cheL1S2Add(Chel1s2 chel1s2) {
		try {
			sessionFactory.getCurrentSession().persist(chel1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Chel1s2> cheL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Chel1s2", Chel1s2.class).getResultList();
		
	}

	@Override
	public boolean cheL1S2Delete(int id) {
		try {
			Chel1s2 list=sessionFactory.getCurrentSession().load(Chel1s2.class, id);
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
	public boolean cheL1S2Update(Chel1s2 chel1s2) {
		try {
			sessionFactory.getCurrentSession().update(chel1s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean cheL1S2Truncate(Chel1s2 chel1s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Chel1s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Chel1s2 cheL1S2GetById(int id) {
		
			List<Chel1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Chel1s2 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		
	}
}
