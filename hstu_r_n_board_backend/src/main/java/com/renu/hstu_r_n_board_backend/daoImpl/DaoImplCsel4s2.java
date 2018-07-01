package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel4s2;
import com.renu.hstu_r_n_board_backend.dto.Csel4s2;

@Repository
@Transactional
public class DaoImplCsel4s2 implements DaoCsel4s2{

	 @Autowired
	    private SessionFactory sessionFactory;
		
		
		@Override
		public boolean cseL4S2Add(Csel4s2 csel4s2) {
	try {
		sessionFactory.getCurrentSession().persist(csel4s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;

	}
		
		}

		@Override
		public List<Csel4s2> cseL4S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Csel4s2", Csel4s2.class).getResultList();
			
		}

		@Override
		public boolean cseL4S2Delete(int id) {
			try {
				Csel4s2 list=sessionFactory.getCurrentSession().load(Csel4s2.class, id);
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
		public boolean cseL4S2Update(Csel4s2 csel4s2) {
	try {
		sessionFactory.getCurrentSession().update(csel4s2);
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;

	}
		
		}

		@Override
		public boolean cseL4S2Truncate(Csel4s2 csel4s2) {
	try {
		sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel4s2").executeUpdate();
		return true;
	} catch (Exception e) {
	e.printStackTrace();
	return false;
	}
		
		}

		@Override
		public Csel4s2 cseL4S2GetById(int id) {
			List<Csel4s2>list=sessionFactory.getCurrentSession().createQuery("FROM Csel4s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
