package com.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projet.entities.Ville;

public interface VilleRepository extends JpaRepository<Ville, Integer> {
	Ville findById(int id);
	Ville findFirstByNomContains(String nom);
	Ville findByNom(String ville);
	
 
}
