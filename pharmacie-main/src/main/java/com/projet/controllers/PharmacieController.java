package com.projet.controllers;


import java.io.IOException;

import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.projet.entities.DureeGarde;
import com.projet.entities.DureeGardePk;
import com.projet.entities.Etat;
import com.projet.entities.Garde;
import com.projet.entities.Pharmacie;
import com.projet.entities.Zone;
import com.projet.repository.DureeGardeRepository;
import com.projet.repository.GardeRepository;
import com.projet.repository.PharmacieRepository;



@RestController
@RequestMapping("pharmacies")

public class PharmacieController {
	@Autowired
	private PharmacieRepository pharmacieRepository;
	@Autowired
	private DureeGardeRepository dureegardeRepository;
	
	@Autowired
	private GardeRepository gardeRepository;
	
	@PostMapping("/save")
	public void save(@RequestParam("image") MultipartFile image,
			@RequestParam("nom") String nom,
			@RequestParam("adresse") String adresse,
			@RequestParam("latitude") double latitude,
			@RequestParam("zoneid") int zoneid,
			@RequestParam("longitude") double longitude) {
		
		Pharmacie pharmacie = new Pharmacie();	
		pharmacie.setNom(nom);
		pharmacie.setAdresse(adresse);
		pharmacie.setLatitude(latitude);
		Zone zone = new Zone();
		zone.setId(zoneid);
		pharmacie.setZone(zone);
		pharmacie.setLongitude(longitude);
		pharmacie.setEtat(Etat.EN_ATTENTE);
			
		try {
			pharmacie.setPhoto(Base64.getEncoder().encodeToString(image.getBytes()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pharmacieRepository.save(pharmacie);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Pharmacie pharma = pharmacieRepository.findById(Integer.parseInt(id));
		pharmacieRepository.delete(pharma);
	}
	@GetMapping("/all")
	public List<Pharmacie> findAll() {
		return pharmacieRepository.findAll();
	}
	@GetMapping("/{zone}/{garde}") 
	public List <Pharmacie> getpharmacieBygarde(@PathVariable(value = "garde") int garde,@PathVariable(value = "zone") String zone){
		/*Garde g = gardeRepository.findById(garde);
		DureeGardePk dgpk
		DureeGarde d = dureegardeRepository.getById(g);*/
		return  dureegardeRepository.getPharmacieByGarde(zone,garde);
		
	}
	
	@GetMapping(value = "/count")
	public long countPharmacie() {
		return pharmacieRepository.count();
	}

}
