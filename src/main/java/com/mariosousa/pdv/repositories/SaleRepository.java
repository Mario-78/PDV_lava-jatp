package com.mariosousa.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariosousa.pdv.domain.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
