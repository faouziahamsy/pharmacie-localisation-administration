package com.projet.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Garde {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Enumerated(EnumType.STRING)
private TypeGarde type;
public Garde() {
	
	super();
}
public Garde( TypeGarde type) {
	super();

	this.type = type;
}

public Garde(int id, TypeGarde type) {
	super();
	this.id = id;
	this.type = type;
}


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}


public TypeGarde getType() {
	return type;
}
public void setType(TypeGarde type) {
	this.type = type;
}

}
