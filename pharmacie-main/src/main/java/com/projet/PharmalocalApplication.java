package com.projet;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class PharmalocalApplication {
	public static void main(String[] args) {
		SpringApplication.run(PharmalocalApplication.class, args);
	}
	
	/*
	 * @Bean CommandLineRunner start(PharmacieRepository
	 * pharmacieRepository,VilleRepository villeRepository,GardeRepository
	 * gardeRepository) { return args -> { Stream.of("Najd","hay salam","Massira")
	 * .forEach(name ->{ Pharmacie pharmacie = new Pharmacie();
	 * pharmacie.setNom(name); pharmacie.setAdresse(name);
	 * pharmacieRepository.save(pharmacie); });
	 * Stream.of("Eljadida","Casablanca","Rabat") .forEach(name ->{ Ville ville= new
	 * Ville(); ville.setNom(name); villeRepository.save(ville); }); //Garde garde
	 * =new Garde(8, TypeGarde.GardeJour); Garde g = new Garde(); //
	 * g.setType(TypeGarde.GardeJour); //garde.setType(TypeGarde.GardeJour);
	 * gardeRepository.save(g);
	 * 
	 * 
	 * }; }
	 */
	 
}
