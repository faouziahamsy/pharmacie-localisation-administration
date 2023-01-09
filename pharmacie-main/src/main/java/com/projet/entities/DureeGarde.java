package com.projet.entities;

import java.util.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class DureeGarde {
	@EmbeddedId
private DureeGardePk pk = new DureeGardePk();

 public DureeGarde() {
		super();
	}
@Temporal(TemporalType.DATE)
private Date datefin;
 
 	@ManyToOne
	@JoinColumn(name = "pharmacie", insertable = false, updatable = false )
 	@MapsId("pharmacie")
	private Pharmacie pharmacie;
	@ManyToOne
	@JoinColumn(name = "garde", insertable = false, updatable = false)
	@MapsId("garde")
	private Garde garde;
public DureeGarde(DureeGardePk pk2, Date date, Date date2, Pharmacie pharmacie2, Garde garde2) {
	super();
}
public DureeGarde(Date datefin, Pharmacie pharmacie, Garde garde) {
	super();
	this.datefin = datefin;
	this.pharmacie = pharmacie;
	this.garde = garde;
}
public Date getDatefin() {
	return datefin;
}
public void setDatefin(Date datefin) {
	this.datefin = datefin;
	
}

public DureeGardePk getPk() {
	return pk;
}

public void setPk(DureeGardePk pk) {
	this.pk = pk;
}

public Pharmacie getPharmacie() {
	return pharmacie;
}

public void setPharmacie(Pharmacie pharmacie) {
	this.pharmacie = pharmacie;
}

public Garde getGarde() {
	return garde;
}

public void setGarde(Garde garde) {
	this.garde = garde;
}

}
