package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMarl1s2;
import com.renu.hstu_r_n_board_backend.dto.Marl1s2;
@Repository
@Transactional
public class DaoImplMarl1s2 implements DaoMarl1s2
{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean marL1S2Add(Marl1s2 marl1s2) {
			try {
				sessionFactory.getCurrentSession().persist(marl1s2);
				return true;
			} catch (Exception e) {
	         e.printStackTrace();
	         return false;
			
			}
		}

		@Override
		public List<Marl1s2> marL1S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Marl1s2", Marl1s2.class).getResultList();
			
		}

		@Override
		public boolean marL1S2Delete(int id) {
			try {
				Marl1s2 list=sessionFactory.getCurrentSession().load(Marl1s2.class, id);
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
		public boolean marL1S2Update(Marl1s2 marl1s2) {
			try {
				sessionFactory.getCurrentSession().update(marl1s2);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			
			}
		}

		@Override
		public boolean marL1S2Truncate(Marl1s2 marl1s2) {
	         try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Marl1s2").executeUpdate();
				return true;
			} catch (Exception e) {

			e.printStackTrace();
			return false;
			}
		
		}

		@Override
		public Marl1s2 marL1S2GetById(int id) {
			List<Marl1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Marl1s2 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		}


}
