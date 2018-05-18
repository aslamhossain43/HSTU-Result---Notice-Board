package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

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
public class NoticesDaoImpl implements NoticesDao {
	@Autowired
	private SessionFactory sessionFactory;

	// add notices
	@Override
	public boolean addAgNotices(Ag_Notices ag_notices) {
		try {
			sessionFactory.getCurrentSession().persist(ag_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	@Override
	public boolean addCseNotices(Cse_Notices cse_notices) {
		try {
			sessionFactory.getCurrentSession().persist(cse_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	@Override
	public boolean addBbaNotices(Bba_Notices bba_notices) {
		try {
			sessionFactory.getCurrentSession().persist(bba_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	@Override
	public boolean addFisNotices(Fis_Notices fis_notices) {
		try {
			sessionFactory.getCurrentSession().persist(fis_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	@Override
	public boolean addDvmNotices(Dvm_Notices dvm_notices) {
		try {
			sessionFactory.getCurrentSession().persist(dvm_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	@Override
	public boolean addEngNotices(Eng_Notices eng_notices) {
		try {
			sessionFactory.getCurrentSession().persist(eng_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	@Override
	public boolean addScNotices(Sc_Notices sc_notices) {
		try {
			sessionFactory.getCurrentSession().persist(sc_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	@Override
	public boolean addSocNotices(Soc_Notices soc_notices) {
		try {
			sessionFactory.getCurrentSession().persist(soc_notices);
			return true;

		} catch (Exception exception) {

			return false;
		}
	}

	// getting all notices
	@Override
	public List<Ag_Notices> agGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Ag_Notices", Ag_Notices.class).getResultList();
	}

	@Override
	public List<Cse_Notices> cseGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Cse_Notices", Cse_Notices.class).getResultList();
	}

	@Override
	public List<Bba_Notices> bbaGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Bba_Notices", Bba_Notices.class).getResultList();
	}

	@Override
	public List<Fis_Notices> fisGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Fis_Notices", Fis_Notices.class).getResultList();
	}

	@Override
	public List<Dvm_Notices> dvmGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Dvm_Notices", Dvm_Notices.class).getResultList();
	}

	@Override
	public List<Eng_Notices> engGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Eng_Notices", Eng_Notices.class).getResultList();
	}

	@Override
	public List<Sc_Notices> scGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Sc_Notices", Sc_Notices.class).getResultList();
	}

	@Override
	public List<Soc_Notices> socGetAllNotices() {

		return sessionFactory.getCurrentSession().createQuery("FROM Soc_Notices", Soc_Notices.class).getResultList();
	}

	// update notices

	@Override
	public boolean agNoticeUpadate(Ag_Notices ag_Notices) {
		try {

			sessionFactory.getCurrentSession().update(ag_Notices);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean cseNoticeUpadate(Cse_Notices cse_Notices) {
		try {
			sessionFactory.getCurrentSession().update(cse_Notices);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean bbaNoticeUpadate(Bba_Notices bba_Notices) {
		try {
			sessionFactory.getCurrentSession().update(bba_Notices);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean fisNoticeUpadate(Fis_Notices fis_Notices) {
		try {

			sessionFactory.getCurrentSession().update(fis_Notices);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean dvmNoticeUpadate(Dvm_Notices dvm_Notices) {
		try {
			sessionFactory.getCurrentSession().update(dvm_Notices);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean engNoticeUpadate(Eng_Notices eng_Notices) {
		try {
			sessionFactory.getCurrentSession().update(eng_Notices);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean scNoticeUpadate(Sc_Notices sc_Notices) {
		try {
			sessionFactory.getCurrentSession().update(sc_Notices);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean socNoticeUpadate(Soc_Notices soc_Notices) {
		try {
			sessionFactory.getCurrentSession().update(soc_Notices);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	// delete notices
	@Override
	public boolean agNoticeDelete(int id) {
		try {
			Ag_Notices ag_Notices = sessionFactory.getCurrentSession().load(Ag_Notices.class, id);
			if (ag_Notices != null) {
				sessionFactory.getCurrentSession().delete(ag_Notices);

			}
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean cseNoticeDelete(int id) {
		try {
			Cse_Notices cse_Notices = sessionFactory.getCurrentSession().load(Cse_Notices.class, id);
			if (cse_Notices != null) {
				sessionFactory.getCurrentSession().delete(cse_Notices);
			}
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean bbaNoticeDelete(int id) {
		try {
			Bba_Notices bba_Notices = sessionFactory.getCurrentSession().load(Bba_Notices.class, id);
			if (bba_Notices != null) {
				sessionFactory.getCurrentSession().delete(bba_Notices);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean fisNoticeDelete(int id) {
		try {
			Fis_Notices fis_Notices = sessionFactory.getCurrentSession().load(Fis_Notices.class, id);
			if (fis_Notices != null) {
				sessionFactory.getCurrentSession().delete(fis_Notices);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean dvmNoticeDelete(int id) {
		try {
			Dvm_Notices dvm_Notices = sessionFactory.getCurrentSession().load(Dvm_Notices.class, id);
			if (dvm_Notices != null) {
				sessionFactory.getCurrentSession().delete(dvm_Notices);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean engNoticeDelete(int id) {
		try {
			Eng_Notices eng_Notices = sessionFactory.getCurrentSession().load(Eng_Notices.class, id);
			if (eng_Notices != null) {
				sessionFactory.getCurrentSession().delete(eng_Notices);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean scNoticeDelete(int id) {
		try {
			Sc_Notices sc_Notices = sessionFactory.getCurrentSession().load(Sc_Notices.class, id);
			if (sc_Notices != null) {
				sessionFactory.getCurrentSession().delete(sc_Notices);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean socNoticeDelete(int id) {
		try {
			Soc_Notices soc_Notices = sessionFactory.getCurrentSession().load(Soc_Notices.class, id);
			if (soc_Notices != null) {
				sessionFactory.getCurrentSession().delete(soc_Notices);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
