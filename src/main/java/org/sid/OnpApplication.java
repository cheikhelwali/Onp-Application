package org.sid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.DemandeCongeRepository;
import org.sid.dao.EmployerRepository;
import org.sid.dao.MaterielRepository;
import org.sid.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class OnpApplication implements CommandLineRunner {

    @Autowired
 	private EmployerRepository employerRepository; 
 	private DemandeCongeRepository demandecongerepository; 
 	private MaterielRepository Matrielrepository; 
    
	public static void main(String[] args) {
		SpringApplication.run(OnpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		employerRepository.findAll().forEach(
	               c->{ System.out.println(c.getNomEmp());});
	}
}
