package com.renu.hstu_r_n_board_backend.dao;

import java.util.List;

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

	// for adding only
	boolean addAgNotices(Ag_Notices ag_notices);

	boolean addCseNotices(Cse_Notices cse_notices);

	boolean addBbaNotices(Bba_Notices bba_notices);

	boolean addFisNotices(Fis_Notices fis_notices);

	boolean addDvmNotices(Dvm_Notices dvm_notices);

	boolean addEngNotices(Eng_Notices eng_notices);

	boolean addScNotices(Sc_Notices sc_notices);

	boolean addSocNotices(Soc_Notices soc_notices);

	// for getting all
	List<Ag_Notices> agGetAllNotices();

	List<Cse_Notices> cseGetAllNotices();

	List<Bba_Notices> bbaGetAllNotices();

	List<Fis_Notices> fisGetAllNotices();

	List<Dvm_Notices> dvmGetAllNotices();

	List<Eng_Notices> engGetAllNotices();

	List<Sc_Notices> scGetAllNotices();

	List<Soc_Notices> socGetAllNotices();

	// for updating by id

	boolean agNoticeUpadate(Ag_Notices ag_Notices);

	boolean cseNoticeUpadate(Cse_Notices cse_Notices);

	boolean bbaNoticeUpadate(Bba_Notices bba_Notices);

	boolean fisNoticeUpadate(Fis_Notices fis_Notices);

	boolean dvmNoticeUpadate(Dvm_Notices dvm_Notices);

	boolean engNoticeUpadate(Eng_Notices eng_Notices);

	boolean scNoticeUpadate(Sc_Notices sc_Notices);

	boolean socNoticeUpadate(Soc_Notices soc_Notices);

	// for deleting by id

	boolean agNoticeDelete(int id);

	boolean cseNoticeDelete(int id);

	boolean bbaNoticeDelete(int id);

	boolean fisNoticeDelete(int id);

	boolean dvmNoticeDelete(int id);

	boolean engNoticeDelete(int id);

	boolean scNoticeDelete(int id);

	boolean socNoticeDelete(int id);

}
