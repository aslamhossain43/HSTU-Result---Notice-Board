package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.DaoCsel1s2;
import com.renu.hstu_r_n_board_backend.dto.Csel1s2;

@Repository
@Transactional
public class DaoImplCsel1s2 implements DaoCsel1s2{

    @Autowired
    private SessionFactory sessionFactory;
	
	
	@Override
	public boolean cseL1S2Add(Csel1s2 csel1s2) {
try {
	sessionFactory.getCurrentSession().persist(csel1s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public List<Csel1s2> cseL1S2GetAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM Csel1s2", Csel1s2.class).getResultList();
		
	}

	@Override
	public boolean cseL1S2Delete(int id) {
		try {
			Csel1s2 list=sessionFactory.getCurrentSession().load(Csel1s2.class, id);
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
	public boolean cseL1S2Update(Csel1s2 csel1s2) {
try {
	sessionFactory.getCurrentSession().update(csel1s2);
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;

}
	
	}

	@Override
	public boolean cseL1S2Truncate(Csel1s2 csel1s2) {
try {
	sessionFactory.getCurrentSession().createQuery("TRUNCATE TABLE Csel1s2").executeUpdate();
	return true;
} catch (Exception e) {
e.printStackTrace();
return false;
}
	
	}

	@Override
	public Csel1s2 cseL1S2GetById(int id) {
		List<Csel1s2>list=sessionFactory.getCurrentSession().createQuery("FROM Csel1s2 p where p.id=:id").setParameter("id",id).list();
		return list.size()>0?list.get(0):null;
	}

}
