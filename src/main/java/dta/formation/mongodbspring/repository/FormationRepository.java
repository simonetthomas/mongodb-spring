package dta.formation.mongodbspring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dta.formation.mongodbspring.entites.Formation;

public interface FormationRepository extends MongoRepository<Formation, String> {
	
	 public Formation findByNom(String nom);
	 long countByNom(String nom);
}
