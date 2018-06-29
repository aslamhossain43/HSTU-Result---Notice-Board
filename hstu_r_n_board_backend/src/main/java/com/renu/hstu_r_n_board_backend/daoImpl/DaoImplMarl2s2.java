package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoMarl2s2;
import com.renu.hstu_r_n_board_backend.dto.Marl2s2;

@Repository
@Transactional
public class DaoImplMarl2s2 implements DaoMarl2s2{

	@Autowired
	private SessionFactory sessionFactory;

		@Override
		public boolean marL2S2Add(Marl2s2 marl2s2) {
			try {
				sessionFactory.getCurrentSession().persist(marl2s2);
				return true;
			} catch (Exception e) {
	         e.printStackTrace();
	         return false;
			
			}
		}

		@Override
		public List<Marl2s2> marL2S2GetAll() {
			return sessionFactory.getCurrentSession().createQuery("FROM Marl2s2", Marl2s2.class).getResultList();
			
		}

		@Override
		public boolean marL2S2Delete(int id) {
			try {
				Marl2s2 list=sessionFactory.getCurrentSession().load(Marl2s2.class, id);
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
		public boolean marL2S2Update(Marl2s2 marl2s2) {
			try {
				sessionFactory.getCurrentSession().update(marl2s2);
				return true;
			} catch (Exception e) {
	      e.printStackTrace();
	      return false;
			
			}
		}

		@Override
		public boolean marL2S2Truncate(Marl2s2 marl2s2) {
	         try {
				sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Marl2s2").executeUpdate();
				return true;
			} catch (Exception e) {

			e.printStackTrace();
			return false;
			}
		
		}

		@Override
		public Marl2s2 marL2S2GetById(int id) {
			List<Marl2s2>list=sessionFactory.getCurrentSession().createQuery("FROM Marl2s2 p where p.id=:id").setParameter("id", id).list();
			return list.size()>0?list.get(0):null;
		}

}
