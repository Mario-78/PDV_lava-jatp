package com.mariosousa.pdv;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mariosousa.pdv.domain.ClearService;
import com.mariosousa.pdv.repositories.ClearServiceRepository;

@SpringBootApplication
public class PdvLavaJatoApplication implements CommandLineRunner {
	
	@Autowired
	private  ClearServiceRepository repoServ;

	public static void main(String[] args) {
		SpringApplication.run(PdvLavaJatoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ClearService serv1 = new ClearService(null, "lavagemsimples", 30.0);
		ClearService serv2 = new ClearService(null, "lavagem com sera", 35.0);
		
		repoServ.saveAll(Arrays.asList(serv1, serv2));
		
	}

}
