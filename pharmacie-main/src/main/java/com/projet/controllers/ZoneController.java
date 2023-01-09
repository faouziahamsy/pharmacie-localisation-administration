package com.projet.controllers;

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

import com.projet.entities.DureeGarde;
import com.projet.entities.DureeGardePk;
import com.projet.entities.Garde;
import com.projet.entities.Pharmacie;
import com.projet.entities.Zone;
import com.projet.repository.DureeGardeRepository;
import com.projet.repository.GardeRepository;
import com.projet.repository.ZoneRepository;

@RestController
@RequestMapping("zones")
public class ZoneController {
	@Autowired
	private ZoneRepository zoneRepository;
	
	// @Autowired
	// private VilleRepository villeRepository;

	@PostMapping("/save")
	public void save(@RequestBody Zone zone) {
		// zone.setVille(villeRepository.findById(zone.getVille().getId()));
		zoneRepository.save(zone);

	}

	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable(required = true) String id) {
		Zone zone = zoneRepository.findById(Integer.parseInt(id));
		zoneRepository.delete(zone);
	}

	@GetMapping("/all")
	public List<Zone> findAll() {
		return zoneRepository.findAll();
	}
//return les pharmacies li kynin f whd zone 
	@GetMapping("/zone/{zone}")
	public Collection<Pharmacie> getPhByZone(@PathVariable(value = "zone") String zone) {
		Zone zone1 = zoneRepository.findByNomContains(zone);
		return zone1.getPharmacies();
	}
	

	@GetMapping("/count")
	public Map<String, Integer> count() {
		Map<String, Integer> map = new HashMap<>();
		for (Zone z : zoneRepository.findAll()) {
			map.put(z.getNom(), z.getPharmacies().size());
		}
		return map;
	}
}
