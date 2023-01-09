package com.projet.entities;

import java.util.Collection;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;



@Entity

public class Ville {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	
	@OneToMany(mappedBy = "ville",fetch=FetchType.EAGER)
	
	private Collection<Zone> zones;
	
	public Ville() {
		super();
	}

	public Ville(String nom, Collection<Zone> zones) {
		super();
		this.nom = nom;
		this.zones = zones;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
@JsonIgnore
	public Collection<Zone> getZones() {
		return zones;
	}
 @JsonSetter
	public void setVilles(Collection<Zone> zones) {
		this.zones = zones;
	}

}
