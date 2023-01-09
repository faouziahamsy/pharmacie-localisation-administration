package com.projet.controllers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.entities.Pharmacie;
import com.projet.entities.Ville;
import com.projet.entities.Zone;
import com.projet.repository.VilleRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("villes")

public class VilleController {
	@Autowired
	private VilleRepository villeRepository;

	@PostMapping("/save")
	
	public void save(@RequestBody Ville ville) {
		villeRepository.save(ville);

	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Ville ville = villeRepository.findById(Integer.parseInt(id));
		villeRepository.delete(ville);
	}

	@GetMapping("/all")
	  
	  
	public List<Ville> findAll() {
		return villeRepository.findAll();
	}

	@GetMapping("/ville/{ville}")
	public Collection<Pharmacie> getPharmacieByVille(@PathVariable(value = "ville") String ville) {
		Ville v = villeRepository.findFirstByNomContains(ville);
		Collection<Zone> zones = v.getZones();
		List<Pharmacie> pharmacieList = new ArrayList<>();
		for (Zone c : zones) {
			for (Pharmacie ph : c.getPharmacies()) {
				pharmacieList.add(ph);
				
			}
		}
		return pharmacieList;
	}
	@GetMapping("/zone/{ville}")
	public Collection<Zone> getZoneByVille(@PathVariable(required= true) String ville) {
		Ville v = villeRepository.findByNom(ville);
		Collection<Zone> zones = v.getZones();
		return zones;
	}
}
