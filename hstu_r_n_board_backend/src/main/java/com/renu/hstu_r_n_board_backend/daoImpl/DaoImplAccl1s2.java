package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAccl1s2;
import com.renu.hstu_r_n_board_backend.dto.Accl1s2;
@Repository
@Transactional
public class DaoImplAccl1s2 implements DaoAccl1s2 {
	@Autowired
	private SessionFactory sessionFactory;
		@Override
		public boolean accL1S2Add(Accl1s2 accl1s2) {
			try {
				sessionFactory.getCurrentSession().persist(accl1s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public List<Accl1s2> accL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Accl1s2", Accl1s2.class).getResultList();
		}

		@Override
		public boolean accL1S2Delete(int id) {
			try {
				Accl1s2 list=sessionFactory.getCurrentSession().load(Accl1s2.class, id);
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
		public boolean accL1S2Update(Accl1s2 accl1s2) {
			try {
				sessionFactory.getCurrentSession().update(accl1s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public boolean accL1S2Truncate(Accl1s2 accl1s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Accl1s2").executeUpdate();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public Accl1s2 accL1S2GetById(int id) {
			List<Accl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Accl1s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}

}
