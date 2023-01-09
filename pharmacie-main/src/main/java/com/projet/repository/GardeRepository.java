package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entities.Garde;
import com.projet.entities.TypeGarde;


public interface GardeRepository extends JpaRepository<Garde, Integer>{
	
  Garde findById(int id);
  
  Garde findByType(TypeGarde typeGarde);
  
  
}
