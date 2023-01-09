package com.projet.entities;


import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
@Entity
public class Pharmacie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	private String nom;
	private String adresse;
	private double latitude;
	private double longitude;
	@Lob @Column(columnDefinition = "MEDIUMBLOB")
	private String photo;
	@Enumerated(EnumType.STRING)
	 @Value("${enum.etat.default:EN_ATTENTE}")
	private Etat etat;
	
	@ManyToOne
	private Zone zone ;	
	public Pharmacie() {
		super();
	}
	public Pharmacie(String nom, String adresse, Double latitude, double longitude, Zone zone ) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	
		this.latitude = latitude;
		this.longitude = longitude;
		this.zone= zone ;
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public Zone getZone() {
		return zone;
	}
	public void setZone(Zone zone) {
		this.zone = zone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	
	
	
	
}
