package com.AgainDtoPractice.PracticeDto1.service;

import java.util.List;
import java.util.Optional;

import com.AgainDtoPractice.PracticeDto1.dto.DistrictOfNamesDto;
import com.AgainDtoPractice.PracticeDto1.entity.DistrictOfNames;

public interface ServiceImplement {

	DistrictOfNames post(DistrictOfNamesDto districtOfNamesDto);

	List<DistrictOfNames> postall(List<DistrictOfNames> districtOfNamesDto);

	DistrictOfNames get(int no);

	List<DistrictOfNamesDto> getall();

	DistrictOfNames update(DistrictOfNamesDto districtOfNamesDto);

	String delete(int id);

	

	

	

}
