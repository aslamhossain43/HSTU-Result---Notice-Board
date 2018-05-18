package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ag_Results;
import com.renu.hstu_r_n_board_backend.dto.Bba_Results;
import com.renu.hstu_r_n_board_backend.dto.Cse_Results;
import com.renu.hstu_r_n_board_backend.dto.Dvm_Results;
import com.renu.hstu_r_n_board_backend.dto.Eng_Results;
import com.renu.hstu_r_n_board_backend.dto.Fis_Results;
import com.renu.hstu_r_n_board_backend.dto.Sc_Results;
import com.renu.hstu_r_n_board_backend.dto.Soc_Results;
@Service
public interface ResultsDao {
	
	//for adding
boolean addAgResults(Ag_Results ag_results);

boolean addCseResults(Cse_Results cse_results);

boolean addBbaResults(Bba_Results bba_results);

boolean addFisResults(Fis_Results fis_results);

boolean addDvmResults(Dvm_Results dvm_results);

boolean addEngResults(Eng_Results eng_results);

boolean addScResults(Sc_Results sc_results);

boolean addSocResults(Soc_Results soc_results);


//Get all

List<Ag_Results>agGetAllResults();

List<Cse_Results>cseGetAllResults();

List<Bba_Results>bbaGetAllResults();

List<Fis_Results>fisGetAllResults();

List<Dvm_Results>dvmGetAllResults();

List<Eng_Results>engGetAllResults();

List<Sc_Results>scGetAllResults();

List<Soc_Results>socGetAllResults();


//update

boolean agResultUpdate(Ag_Results ag_Results);

boolean cseResultUpdate(Cse_Results cse_Results);

boolean bbaResultUpdate(Bba_Results bba_Results);

boolean fisResultUpdate(Fis_Results fis_Results);

boolean dvmResultUpdate(Dvm_Results dvm_Results);

boolean engResultUpdate(Eng_Results eng_Results);

boolean scResultUpdate(Sc_Results sc_Results);

boolean socResultUpdate(Soc_Results soc_Results);

//delete


boolean agResultDelete(int id);

boolean cseResultDelete(int id);

boolean bbaResultDelete(int id);

boolean fisResultDelete(int id);

boolean dvmResultDelete(int id);

boolean engResultDelete(int id);

boolean scResultDelete(int id);

boolean socResultDelete(int id);



}
