package com.renu.hstu_r_n_board_backend.dao;

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
boolean addAgResults(Ag_Results ag_results);

boolean addCseResults(Cse_Results cse_results);

boolean addBbaResults(Bba_Results bba_results);

boolean addFisResults(Fis_Results fis_results);

boolean addDvmResults(Dvm_Results dvm_results);

boolean addEngResults(Eng_Results eng_results);

boolean addScResults(Sc_Results sc_results);

boolean addSocResults(Soc_Results soc_results);









}
