package com.renu.hstu_r_n_board_backend.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.renu.hstu_r_n_board_backend.dao.NoticesDao;
import com.renu.hstu_r_n_board_backend.dto.Ag_Notices;
@Repository("noticesDao")
@Transactional
public class NoticesDaoImpl implements NoticesDao{
      @Autowired
      private SessionFactory sessionFactory;
	@Override
	public boolean addNotices(Ag_Notices notices) {
		
		try {
			sessionFactory.getCurrentSession().persist(notices);
			return true;
			
		}catch(Exception exception) {
		
		return false;
		}
	}

}
