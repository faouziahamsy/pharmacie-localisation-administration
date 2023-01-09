package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projet.entities.Zone;

public interface ZoneRepository extends JpaRepository<Zone, Integer>{
 Zone findById(int id);	
 
 Zone findByNomContains(String nom);
 
 
}
