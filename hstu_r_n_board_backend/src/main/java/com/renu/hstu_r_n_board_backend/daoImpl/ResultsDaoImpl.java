package com.renu.hstu_r_n_board_backend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.ResultsDao;
import com.renu.hstu_r_n_board_backend.dto.Ag_Results;
@Repository("resultsDao")
@Transactional
public class ResultsDaoImpl implements ResultsDao{
    @Autowired
    private SessionFactory sessionFactory;
	
	
	
	@Override
	public boolean addResults(Ag_Results results) {
		try {
			sessionFactory.getCurrentSession().persist(results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
		
	}

}
