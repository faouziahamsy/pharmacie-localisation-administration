package com.projet.repository;


import org.springframework.data.jpa.repository.JpaRepository;


import com.projet.entities.Pharmacie;

import com.projet.entities.Zone;

public interface PharmacieRepository extends JpaRepository<Pharmacie, Integer>{

	Pharmacie findById(int id);
	Pharmacie findByNom(String nom);
	Pharmacie findByZone(Zone zone);
	

}
 