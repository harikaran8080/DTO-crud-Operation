package com.AgainDtoPractice.PracticeDto1.service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.xml.stream.events.Namespace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgainDtoPractice.PracticeDto1.dto.DistrictOfNamesDto;
import com.AgainDtoPractice.PracticeDto1.entity.DistrictOfNames;
import com.AgainDtoPractice.PracticeDto1.repository.DistrictRepository;

@Service
public class DistrictService implements ServiceImplement {
	
	@Autowired
	private DistrictRepository districtRepository;

	@Override
	public DistrictOfNames post(DistrictOfNamesDto districtOfNamesDto) {
		DistrictOfNames districtOfNames=new DistrictOfNames();
		districtOfNames.setNo(districtOfNamesDto.getNo());
		districtOfNames.setDNames(districtOfNamesDto.getDNames());
		districtOfNames.setFamous(districtOfNamesDto.getFamous());
		return districtRepository.save(districtOfNames);
		
		
		
	}

	@Override
	public List<DistrictOfNames> postall(List<DistrictOfNames> districtOfNamesDto) {
		List<DistrictOfNames>districtOfNames=districtRepository.saveAll(districtOfNamesDto);
		return districtOfNames;
	}

	@Override
	public DistrictOfNames get(int no) {
		Optional<DistrictOfNames>optional=districtRepository.findById(no);
		DistrictOfNames districtOfNames=optional.get();
		DistrictOfNamesDto districtOfNamesDto=new DistrictOfNamesDto();
		districtOfNamesDto.setDNames(districtOfNames.getDNames());
		districtOfNamesDto.setFamous(districtOfNames.getFamous());
		districtOfNamesDto.setNo(districtOfNames.getNo());
		return districtRepository.save(districtOfNames);
		
		
	}

	@Override
	public List<DistrictOfNamesDto> getall() {
		List<DistrictOfNames> districtOfNames=districtRepository.findAll();
		List<DistrictOfNamesDto>districtOfNamesDtos=new ArrayList<>();
		for(DistrictOfNames names: districtOfNames) {
			DistrictOfNamesDto districtOfNamesDto=new DistrictOfNamesDto();
			districtOfNamesDto.setDNames(names.getDNames());
			districtOfNamesDto.setFamous(names.getFamous());
			districtOfNamesDto.setNo(names.getNo());
			districtOfNamesDtos.add(districtOfNamesDto);
			
		}
		return districtOfNamesDtos;
	}

	@Override
	public DistrictOfNames update(DistrictOfNamesDto districtOfNamesDto) {
		Optional<DistrictOfNames>optional=districtRepository.findById(districtOfNamesDto.getNo());
		DistrictOfNames districtOfNames=optional.get();
		districtOfNames.setDNames(districtOfNamesDto.getDNames());
		districtOfNames.setFamous(districtOfNamesDto.getFamous());
		districtOfNames.setNo(districtOfNamesDto.getNo());
		return districtRepository.save(districtOfNames);
		
		
	}

	@Override
	public String delete(int id) {
	   districtRepository.deleteById(id);
	   return "Successfully Deleted";
	}

	

	

}
