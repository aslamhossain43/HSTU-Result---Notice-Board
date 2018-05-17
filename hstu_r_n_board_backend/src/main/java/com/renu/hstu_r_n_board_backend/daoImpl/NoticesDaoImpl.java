package com.renu.hstu_r_n_board_backend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.NoticesDao;
import com.renu.hstu_r_n_board_backend.dto.Ag_Notices;
import com.renu.hstu_r_n_board_backend.dto.Bba_Notices;
import com.renu.hstu_r_n_board_backend.dto.Cse_Notices;
import com.renu.hstu_r_n_board_backend.dto.Dvm_Notices;
import com.renu.hstu_r_n_board_backend.dto.Eng_Notices;
import com.renu.hstu_r_n_board_backend.dto.Fis_Notices;
import com.renu.hstu_r_n_board_backend.dto.Sc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Soc_Notices;
@Repository
@Transactional
public class NoticesDaoImpl implements NoticesDao{
      @Autowired
      private SessionFactory sessionFactory;

	@Override
	public boolean addAgNotices(Ag_Notices ag_notices) {
		try {
			sessionFactory.getCurrentSession().persist(ag_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

	@Override
	public boolean addCseNotices(Cse_Notices cse_notices) {
		try {
			sessionFactory.getCurrentSession().persist(cse_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

	@Override
	public boolean addBbaNotices(Bba_Notices bba_notices) {
		try {
			sessionFactory.getCurrentSession().persist(bba_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

	@Override
	public boolean addFisNotices(Fis_Notices fis_notices) {
		try {
			sessionFactory.getCurrentSession().persist(fis_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

	@Override
	public boolean addDvmNotices(Dvm_Notices dvm_notices) {
		try {
			sessionFactory.getCurrentSession().persist(dvm_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

	@Override
	public boolean addEngNotices(Eng_Notices eng_notices) {
		try {
			sessionFactory.getCurrentSession().persist(eng_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

	@Override
	public boolean addScNotices(Sc_Notices sc_notices) {
		try {
			sessionFactory.getCurrentSession().persist(sc_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

	@Override
	public boolean addSocNotices(Soc_Notices soc_notices) {
		try {
			sessionFactory.getCurrentSession().persist(soc_notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}
	

}
