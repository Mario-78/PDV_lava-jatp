package com.mariosousa.pdv.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariosousa.pdv.domain.ClearService;
import com.mariosousa.pdv.repositories.ClearServiceRepository;

@Service
public class ClearServiceService {
	
	@Autowired
	private ClearServiceRepository repo;
	
	public ClearService find(Integer id) {
		
		Optional<ClearService> obj = repo.findById(id);
		
		return obj.orElse(null);
		
	}

}
