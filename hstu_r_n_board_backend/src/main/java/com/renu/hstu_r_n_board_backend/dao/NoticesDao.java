package com.renu.hstu_r_n_board_backend.dao;

import org.springframework.stereotype.Service;

import com.renu.hstu_r_n_board_backend.dto.Ag_Notices;
import com.renu.hstu_r_n_board_backend.dto.Bba_Notices;
import com.renu.hstu_r_n_board_backend.dto.Cse_Notices;
import com.renu.hstu_r_n_board_backend.dto.Dvm_Notices;
import com.renu.hstu_r_n_board_backend.dto.Eng_Notices;
import com.renu.hstu_r_n_board_backend.dto.Fis_Notices;
import com.renu.hstu_r_n_board_backend.dto.Sc_Notices;
import com.renu.hstu_r_n_board_backend.dto.Soc_Notices;
@Service
public interface NoticesDao {
boolean addAgNotices(Ag_Notices ag_notices);

boolean addCseNotices(Cse_Notices cse_notices);

boolean addBbaNotices(Bba_Notices bba_notices);

boolean addFisNotices(Fis_Notices fis_notices);

boolean addDvmNotices(Dvm_Notices dvm_notices);

boolean addEngNotices(Eng_Notices eng_notices);

boolean addScNotices(Sc_Notices sc_notices);

boolean addSocNotices(Soc_Notices soc_notices);



}
