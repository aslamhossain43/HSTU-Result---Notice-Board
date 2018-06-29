package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMarl3s2;
import com.renu.hstu_r_n_board_backend.dto.Marl3s2;

@Repository
@Transactional
public class DaoImplMarl3s2 implements DaoMarl3s2{
	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean marL3S2Add(Marl3s2 marl3s2) {
			try {
				sessionFactory.getCurrentSession().persist(marl3s2);
				return true;
			} catch (Exception e) {
	         e.printStackTrace();
	         return false;
			
			}
		}

		@Override
		public List<Marl3s2> marL3S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Marl3s2", Marl3s2.class).getResultList();
			
		}

		@Override
		public boolean marL3S2Delete(int id) {
			try {
				Marl3s2 list=sessionFactory.getCurrentSession().load(Marl3s2.class, id);
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
		public boolean marL3S2Update(Marl3s2 marl3s2) {
			try {
				sessionFactory.getCurrentSession().update(marl3s2);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			
			}
		}

		@Override
		public boolean marL3S2Truncate(Marl3s2 marl3s2) {
	         try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Marl3s2").executeUpdate();
				return true;
			} catch (Exception e) {

			e.printStackTrace();
			return false;
			}
		
		}

		@Override
		public Marl3s2 marL3S2GetById(int id) {
			List<Marl3s2>list=sessionFactory.getCurrentSession().createQuery("FROM Marl3s2 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		}
		
}
