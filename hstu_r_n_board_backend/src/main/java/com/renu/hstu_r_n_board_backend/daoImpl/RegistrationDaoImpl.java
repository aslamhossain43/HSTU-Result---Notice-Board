package com.renu.hstu_r_n_board_backend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.RegistrationDao;
import com.renu.hstu_r_n_board_backend.dto.Registration;

@Repository("registrationDao")
@Transactional
public class RegistrationDaoImpl implements RegistrationDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addRegistration(Registration registration) {

		try {
			sessionFactory.getCurrentSession().persist(registration);
			return true;

		} catch (Exception e) {
			return false;

		}
	}

}
