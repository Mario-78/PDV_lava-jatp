package com.mariosousa.pdv.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mariosousa.pdv.domain.ClearService;

@Repository
public interface ClearServiceRepository extends JpaRepository<ClearService, Integer>{

}
