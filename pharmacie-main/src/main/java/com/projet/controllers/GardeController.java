package com.projet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.entities.Garde;
import com.projet.repository.GardeRepository;
@RestController

@RequestMapping("gardes")
public class GardeController {
	@Autowired
	private GardeRepository gardeRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Garde garde){
		
	gardeRepository.save(garde);
	}
	
	@DeleteMapping("/delete{id}")
	public void delete(@PathVariable(required=true) String id) {
		Garde garde = gardeRepository.findById(Integer.parseInt(id));
		gardeRepository.delete(garde);
	}
	
	@GetMapping("/all")
	public List<Garde> findAll(){
		return gardeRepository.findAll();
		
		
	}
	
}
