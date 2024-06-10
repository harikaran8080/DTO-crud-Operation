package com.AgainDtoPractice.PracticeDto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AgainDtoPractice.PracticeDto1.entity.DistrictOfNames;

@Repository
public interface DistrictRepository  extends JpaRepository<DistrictOfNames, Integer>{

}
