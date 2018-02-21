package dta.formation.mongodbspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dta.formation.mongodbspring.entites.Formation;
import dta.formation.mongodbspring.repository.FormationRepository;

@SpringBootApplication
public class MongodbSpringApplication implements CommandLineRunner{

	@Autowired
	private FormationRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(MongodbSpringApplication.class, args);
		
		
	}

	@Override
	public void run(String... arg0) throws Exception {
		repository.deleteAll();
		
		// save a couple of formations
		repository.save(new Formation("Big Data", 9));
		repository.save(new Formation("Big Data", 12));
		repository.save(new Formation("Java", 7));

		// fetch all formations
		System.out.println("Formations found with findAll():");
		System.out.println("-------------------------------");
		for (Formation form : repository.findAll()) {
			System.out.println(form);
		}
		System.out.println();

		// fetch an individual formation
		System.out.println("Formation found with name ('Big Data'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByNom("Big Data"));
		
		// count the big data formations
		System.out.println("Number of big data formations");
		System.out.println("--------------------------------");
		System.out.println(repository.countByNom("Big Data"));
	}
}
