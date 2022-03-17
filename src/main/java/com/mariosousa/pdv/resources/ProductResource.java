package com.mariosousa.pdv.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public String find() {
		return "REST está funcionando!";
	}

}
