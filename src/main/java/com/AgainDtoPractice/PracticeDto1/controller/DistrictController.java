package com.AgainDtoPractice.PracticeDto1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgainDtoPractice.PracticeDto1.dto.DistrictOfNamesDto;
import com.AgainDtoPractice.PracticeDto1.entity.DistrictOfNames;
import com.AgainDtoPractice.PracticeDto1.service.ServiceImplement;

@RestController
@RequestMapping("/district/api")
public class DistrictController {
	
	@Autowired
	private ServiceImplement implement;
	
	
	@PostMapping("/post")
	public DistrictOfNames post(@RequestBody DistrictOfNamesDto districtOfNamesDto) {
	return implement.post(districtOfNamesDto);
	
	}
	
	@PostMapping("postall")
	public List<DistrictOfNames>postall(@RequestBody List<DistrictOfNames> districtOfNamesDto){
		return implement.postall(districtOfNamesDto);
	}
	
	@GetMapping("/get/{no}")
	public DistrictOfNames get(@PathVariable int no) {
		return implement.get(no);
	}
	
	@GetMapping("/getall")
	public List<DistrictOfNamesDto>getall(){
		return implement.getall();
		
	}
	
	@PutMapping("/update")
	public DistrictOfNames update(@RequestBody DistrictOfNamesDto districtOfNamesDto) {
		return implement.update(districtOfNamesDto);
	}
	
	@DeleteMapping("/Delete/{id}")
	public String delete(@PathVariable int id) {
		return implement.delete(id);
	}
	
	

}
