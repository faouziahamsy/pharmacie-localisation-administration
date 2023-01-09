
  package com.projet.controllers;
  
  import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.PostMapping; import
  org.springframework.web.bind.annotation.RequestBody; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RestController;
  
 import com.projet.entities.DureeGarde;
  import com.projet.entities.DureeGardePk; import com.projet.entities.Garde;
  import com.projet.entities.Pharmacie; import
  com.projet.repository.DureeGardeRepository; import
  com.projet.repository.GardeRepository; import
  com.projet.repository.PharmacieRepository;
  
  @RestController
  
  @RequestMapping("DureeGarde") public class DureeGardeController {
  
  @Autowired private DureeGardeRepository DureeGardeRepository;
  
  @Autowired private PharmacieRepository pharmacieRepository;
  
  @Autowired private GardeRepository gardeRepository;
  
  @GetMapping("/all") public List<DureeGarde> findAll() { return
  DureeGardeRepository.findAll(); }
  
  
  @PostMapping("/save") 
  public DureeGarde create(@RequestBody DureeGarde dureeGarde) {
	// DureeGardePk pk = new DureeGardePk(dureeGarde.getPharmacieId(),dureeGarde.getGardeId(), dureeGarde.getDateDebut()); 
	// Pharmacie pharmacie =pharmacieRepository.findById(dureeGarde.getPharmacieId()); 
	// Garde garde = gardeRepository.findById(dureeGarde.getGardeId()); System.out.println(pk);
	// DureeGarde pGarde = new DureeGarde(pk, dureeGarde.getDateDebut(),dureeGarde.getDateFin(), pharmacie, garde);

  return DureeGardeRepository.save(dureeGarde); }
  
  @PostMapping("/one") 
  public DureeGarde findId(@RequestBody DureeGardePk dureeGarde) { Optional<DureeGarde> 
  garde = DureeGardeRepository.findById(dureeGarde); 
  return garde.get(); 
  }
  }
 