package com.renu.hstu_r_n_board_backend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.ResultsDao;
import com.renu.hstu_r_n_board_backend.dto.Ag_Results;
import com.renu.hstu_r_n_board_backend.dto.Bba_Results;
import com.renu.hstu_r_n_board_backend.dto.Cse_Results;
import com.renu.hstu_r_n_board_backend.dto.Dvm_Results;
import com.renu.hstu_r_n_board_backend.dto.Eng_Results;
import com.renu.hstu_r_n_board_backend.dto.Fis_Results;
import com.renu.hstu_r_n_board_backend.dto.Sc_Results;
import com.renu.hstu_r_n_board_backend.dto.Soc_Results;
@Repository
@Transactional
public class ResultsDaoImpl implements ResultsDao{
    @Autowired
    private SessionFactory sessionFactory;
	
	
	
	@Override
	public boolean addAgResults(Ag_Results ag_results) {
		try {
			sessionFactory.getCurrentSession().persist(ag_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
		
	}



	@Override
	public boolean addCseResults(Cse_Results cse_results) {
		try {
			sessionFactory.getCurrentSession().persist(cse_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
	}



	@Override
	public boolean addBbaResults(Bba_Results bba_results) {
		try {
			sessionFactory.getCurrentSession().persist(bba_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
	}



	@Override
	public boolean addFisResults(Fis_Results fis_results) {
		try {
			sessionFactory.getCurrentSession().persist(fis_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
	}



	@Override
	public boolean addDvmResults(Dvm_Results dvm_results) {
		try {
			sessionFactory.getCurrentSession().persist(dvm_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
	}



	@Override
	public boolean addEngResults(Eng_Results eng_results) {
		try {
			sessionFactory.getCurrentSession().persist(eng_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
	}



	@Override
	public boolean addScResults(Sc_Results sc_results) {
		try {
			sessionFactory.getCurrentSession().persist(sc_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
	}



	@Override
	public boolean addSocResults(Soc_Results soc_results) {
		try {
			sessionFactory.getCurrentSession().persist(soc_results);
			return true;
			
		}catch(Exception exception) {
			return false;
		}
	}

}
