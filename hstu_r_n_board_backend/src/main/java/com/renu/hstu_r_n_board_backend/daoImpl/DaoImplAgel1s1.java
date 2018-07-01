package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoAgel1s1;
import com.renu.hstu_r_n_board_backend.dto.Agel1s1;

@Repository
@Transactional
public class DaoImplAgel1s1 implements DaoAgel1s1{
      @Autowired
      private SessionFactory sessionFactory;
      
	@Override
	public boolean ageL1S1Add(Agel1s1 agel1s1) {
		try {
			sessionFactory.getCurrentSession().persist(agel1s1);
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public List<Agel1s1> ageL1S1GetAll() {

		return sessionFactory.getCurrentSession().createQuery("FROM Agel1s1", Agel1s1.class).getResultList();
		
	}

	@Override
	public boolean ageL1S1Delete(int id) {
		try {
			Agel1s1 list=sessionFactory.getCurrentSession().load(Agel1s1.class, id);
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
	public boolean ageL1S1Update(Agel1s1 agel1s1) {
	try {
		sessionFactory.getCurrentSession().update(agel1s1);
		return true;
	} catch (Exception e) {
e.printStackTrace();
return false;
	}
	}

	@Override
	public boolean ageL1S1Truncate(Agel1s1 agel1s1) {
		try {
			sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Agel1s1").executeUpdate();
			return true;
		} catch (Exception e) {
e.printStackTrace();
return false;
		}
	}

	@Override
	public Agel1s1 ageL1S1GetById(int id) {
		List<Agel1s1>list=sessionFactory.getCurrentSession().createQuery("FROM Agel1s1 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
