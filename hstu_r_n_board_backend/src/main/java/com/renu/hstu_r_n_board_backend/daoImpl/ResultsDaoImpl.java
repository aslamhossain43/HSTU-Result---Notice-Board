package com.renu.hstu_r_n_board_backend.daoImpl;

import java.util.List;

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
	
	
	// for adding 
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

//getting all results

	@Override
	public List<Ag_Results> agGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Ag_Results", Ag_Results.class).getResultList();
	}



	@Override
	public List<Cse_Results> cseGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Cse_Results", Cse_Results.class).getResultList();
	}



	@Override
	public List<Bba_Results> bbaGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Bba_Results", Bba_Results.class).getResultList();
	}



	@Override
	public List<Fis_Results> fisGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Fis_Results", Fis_Results.class).getResultList();
	}



	@Override
	public List<Dvm_Results> dvmGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Dvm_Results", Dvm_Results.class).getResultList();
	}



	@Override
	public List<Eng_Results> engGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Eng_Results", Eng_Results.class).getResultList();
	}



	@Override
	public List<Sc_Results> scGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Sc_Results", Sc_Results.class).getResultList();
	}



	@Override
	public List<Soc_Results> socGetAllResults() {
		
		return sessionFactory.getCurrentSession().createQuery("FROM Soc_Results", Soc_Results.class).getResultList();
	}

//update 

	@Override
	public boolean agResultUpdate(Ag_Results ag_Results) {
		try {
			sessionFactory.getCurrentSession().update(ag_Results);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean cseResultUpdate(Cse_Results cse_Results) {
		try {
			sessionFactory.getCurrentSession().update(cse_Results);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean bbaResultUpdate(Bba_Results bba_Results) {
		try {
			sessionFactory.getCurrentSession().update(bba_Results);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean fisResultUpdate(Fis_Results fis_Results) {
		try {
			sessionFactory.getCurrentSession().update(fis_Results);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
	}



	@Override
	public boolean dvmResultUpdate(Dvm_Results dvm_Results) {
		try {
			sessionFactory.getCurrentSession().update(dvm_Results);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean engResultUpdate(Eng_Results eng_Results) {
		try {
			sessionFactory.getCurrentSession().update(eng_Results);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean scResultUpdate(Sc_Results sc_Results) {
		try {
			sessionFactory.getCurrentSession().update(sc_Results);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean socResultUpdate(Soc_Results soc_Results) {
		try {
			sessionFactory.getCurrentSession().update(soc_Results);
			return true;
			
		} catch (Exception e) {
		e.printStackTrace();
		return false;
		}
	}

//delete

	@Override
	public boolean agResultDelete(int id) {
		try {
			Ag_Results ag_Results=sessionFactory.getCurrentSession().load(Ag_Results.class, id);
			if(ag_Results!=null) {
				sessionFactory.getCurrentSession().delete(ag_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean cseResultDelete(int id) {
		try {
			Cse_Results cse_Results=sessionFactory.getCurrentSession().load(Cse_Results.class, id);
			if(cse_Results!=null) {
				sessionFactory.getCurrentSession().delete(cse_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean bbaResultDelete(int id) {
		try {
			Bba_Results bba_Results=sessionFactory.getCurrentSession().load(Bba_Results.class, id);
			if (bba_Results!=null) {
				sessionFactory.getCurrentSession().delete(bba_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean fisResultDelete(int id) {
		try {
			Fis_Results fis_Results=sessionFactory.getCurrentSession().load(Fis_Results.class, id);
			if (fis_Results!=null) {
				sessionFactory.getCurrentSession().delete(fis_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean dvmResultDelete(int id) {
		try {
			Dvm_Results dvm_Results=sessionFactory.getCurrentSession().load(Dvm_Results.class, id);
			if (dvm_Results!=null) {
				sessionFactory.getCurrentSession().delete(dvm_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return true;
		}
	}



	@Override
	public boolean engResultDelete(int id) {
		try {
			Eng_Results eng_Results=sessionFactory.getCurrentSession().load(Eng_Results.class,id);
			if (eng_Results!=null) {
				sessionFactory.getCurrentSession().delete(eng_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean scResultDelete(int id) {
		try {
			Sc_Results sc_Results=sessionFactory.getCurrentSession().load(Sc_Results.class, id);
			if (sc_Results!=null) {
				sessionFactory.getCurrentSession().delete(sc_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}



	@Override
	public boolean socResultDelete(int id) {
		try {
			Soc_Results soc_Results=sessionFactory.getCurrentSession().load(Soc_Results.class, id);
			if (soc_Results!=null) {
				sessionFactory.getCurrentSession().delete(soc_Results);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
