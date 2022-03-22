package com.mariosousa.pdv.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariosousa.pdv.domain.ClearService;
import com.mariosousa.pdv.repositories.ClearServiceRepository;
import com.mariosousa.pdv.services.exceptions.ObjectNotFoundException;

@Service
public class ClearServiceService {
	
	@Autowired
	private ClearServiceRepository repo;
	
	public ClearService find(Integer id) {
		
		Optional<ClearService> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! " + id + ", tipo: " + ClearService.class.getName()));
		
	}

}
