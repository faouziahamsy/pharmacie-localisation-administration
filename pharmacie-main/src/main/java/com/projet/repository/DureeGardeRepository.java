package com.projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.projet.entities.DureeGarde;
import com.projet.entities.DureeGardePk;
import com.projet.entities.Pharmacie;
import com.projet.entities.TypeGarde;

public interface DureeGardeRepository extends JpaRepository<DureeGarde, DureeGardePk> {
    DureeGarde findByPharmacie(Pharmacie pharmacie);
    @Query("select dg from DureeGarde dg, Garde g ,Pharmacie p WHERE dg.pharmacie=p and dg.garde=g and g.type=:type and p.id=:id ")
   List<DureeGarde> getByTypeForId(int id ,TypeGarde type);
    @Query("SELECT p FROM DureeGarde dg JOIN Pharmacie p ON (p.id=dg.pharmacie) WHERE dg.garde.id= :garde AND p.zone.nom= :zone " )
    List<Pharmacie> getPharmacieByGarde(String zone , int garde);
}
