package com.projet.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Embeddable
public class DureeGardePk implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int pharmacie;
private int garde;
@Temporal(TemporalType.DATE)
private Date datedebut  ;
public DureeGardePk() {
	super();
}
public DureeGardePk(int pharmacie, int garde, Date datedebut) {
	super();
	this.pharmacie = pharmacie;
	this.garde = garde;
	this.datedebut = datedebut;
}

public int getPharmacie() {
	return pharmacie;
}
public void setPharmacie(int pharmacie) {
	this.pharmacie = pharmacie;
}
public int getGarde() {
	return garde;
}
public void setGarde(int garde) {
	this.garde = garde;
}
public Date getDatedebut() {
	return datedebut;
}
public void setDatedebut(Date datedebut) {
	this.datedebut = datedebut;
}
@Override
public int hashCode() {
	return Objects.hash(datedebut, pharmacie, garde);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	DureeGardePk other = (DureeGardePk) obj;
	return Objects.equals(datedebut, other.datedebut) && pharmacie == other.pharmacie && garde == other.garde;
}
	
	
}
