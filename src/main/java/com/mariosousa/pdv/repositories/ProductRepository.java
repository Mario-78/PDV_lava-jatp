package com.mariosousa.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariosousa.pdv.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
