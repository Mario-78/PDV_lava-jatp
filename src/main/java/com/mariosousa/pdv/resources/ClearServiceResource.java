package com.mariosousa.pdv.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariosousa.pdv.domain.ClearService;
import com.mariosousa.pdv.services.ClearServiceService;


@RestController
@RequestMapping(value="/services")
public class ClearServiceResource {
	
	@Autowired
	private ClearServiceService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		ClearService obj = service.find(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
