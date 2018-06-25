package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAccl3s2;
import com.renu.hstu_r_n_board_backend.dto.Accl3s1;
import com.renu.hstu_r_n_board_backend.dto.Accl3s2;

@Repository
@Transactional
public class DaoImplAccl3s2 implements DaoAccl3s2{
	@Autowired
private SessionFactory sessionFactory;
	@Override
	public boolean accL3S2Add(Accl3s2 accl3s2) {
		try {
			sessionFactory.getCurrentSession().persist(accl3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Accl3s2> accL3S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Accl3s2", Accl3s2.class).getResultList();
	}

	@Override
	public boolean accL3S2Delete(int id) {
		try {
			Accl3s2 list=sessionFactory.getCurrentSession().load(Accl3s2.class, id);
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
	public boolean accL3S2Update(Accl3s2 accl3s2) {
		try {
			sessionFactory.getCurrentSession().update(accl3s2);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean accL3S2Truncate(Accl3s2 accl3s2) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Accl3s2").executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Accl3s2 accL3S2GetById(int id) {
		List<Accl3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Accl3s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}
}
