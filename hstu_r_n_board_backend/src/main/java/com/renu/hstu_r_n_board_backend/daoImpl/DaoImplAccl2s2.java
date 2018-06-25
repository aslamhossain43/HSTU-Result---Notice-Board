package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAccl2s2;
import com.renu.hstu_r_n_board_backend.dto.Accl2s1;
import com.renu.hstu_r_n_board_backend.dto.Accl2s2;

@Repository
@Transactional
public class DaoImplAccl2s2 implements DaoAccl2s2{
	@Autowired
	private SessionFactory sessionFactory;
		@Override
		public boolean accL2S2Add(Accl2s2 accl2s2) {
			try {
				sessionFactory.getCurrentSession().persist(accl2s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public List<Accl2s2> accL2S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Accl2s2", Accl2s2.class).getResultList();
		}

		@Override
		public boolean accL2S2Delete(int id) {
			try {
				Accl2s2 list=sessionFactory.getCurrentSession().load(Accl2s2.class, id);
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
		public boolean accL2S2Update(Accl2s2 accl2s2) {
			try {
				sessionFactory.getCurrentSession().update(accl2s2);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public boolean accL2S2Truncate(Accl2s2 accl2s2) {
			try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Accl2s2").executeUpdate();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}

		@Override
		public Accl2s2 accL2S2GetById(int id) {
			List<Accl2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Accl2s2 p where p.id=:id").setParameter("id",id).list();
			return list.size()>0?list.get(0):null;
		}



}
