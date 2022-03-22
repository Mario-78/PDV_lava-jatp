package com.mariosousa.pdv;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mariosousa.pdv.domain.ClearService;
import com.mariosousa.pdv.domain.Product;
import com.mariosousa.pdv.domain.Sale;
import com.mariosousa.pdv.repositories.ClearServiceRepository;
import com.mariosousa.pdv.repositories.ProductRepository;
import com.mariosousa.pdv.repositories.SaleRepository;

@SpringBootApplication
public class PdvLavaJatoApplication implements CommandLineRunner {
	
	private Date date = new Date();
	private Date date1 = new Date();
	@Autowired
	private  ClearServiceRepository repoServ;
	@Autowired
	private ProductRepository repoProd;
	@Autowired
	private SaleRepository repoSale;

	public static void main(String[] args) {
		SpringApplication.run(PdvLavaJatoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		ClearService serv1 = new ClearService(null, "lavagemsimples", 30.0);
		ClearService serv2 = new ClearService(null, "lavagem com sera", 35.0);
		
		Product prod1 = new Product(null, "refrigerante", 5.5);
		Product prod2 = new Product(null, "salgadinho", 2.5);
		
		Sale sale1 = new Sale(null, date);
		Sale sale2 = new Sale(null, date1);
		
		sale1.getProducts().addAll(Arrays.asList(prod1));
		sale2.getProducts().addAll(Arrays.asList(prod1, prod2));
		sale1.getServices().addAll(Arrays.asList(serv1, serv2));
		sale2.getServices().addAll(Arrays.asList(serv2));
		
		prod1.getSales().addAll(Arrays.asList(sale1, sale2));
		prod2.getSales().addAll(Arrays.asList(sale2));
		
		serv1.getSales().addAll(Arrays.asList(sale1));
		serv2.getSales().addAll(Arrays.asList(sale1, sale2));
		
		repoServ.saveAll(Arrays.asList(serv1, serv2));
		repoProd.saveAll(Arrays.asList(prod1, prod2));
		repoSale.saveAll(Arrays.asList(sale1, sale2));
		
	}

}
