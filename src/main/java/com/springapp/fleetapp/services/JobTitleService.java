package com.springapp.fleetapp.services;

import java.util.List;
import java.util.Optional;

import com.springapp.fleetapp.models.JobTitle;
import com.springapp.fleetapp.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobTitleService {

	@Autowired
	private JobTitleRepository jobTitleRepository;
	
	//Get All JobTitles
	public List<JobTitle> findAll(){
		return jobTitleRepository.findAll();
	}	
	
	//Get JobTitle By Id
	public Optional<JobTitle> findById(int id) {
		return jobTitleRepository.findById(id);
	}	
	
	//Delete JobTitle
	public void delete(int id) {
		jobTitleRepository.deleteById(id);
	}
	
	//Update JobTitle
	public void save(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}
}
