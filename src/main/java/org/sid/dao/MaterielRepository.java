package org.sid.dao;

import java.util.List;

import org.sid.entities.DemandeConge;
import org.sid.entities.Materiel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MaterielRepository extends JpaRepository<Materiel,Integer>{
	


	   @Query("select ma from Materiel ma where ma.employer.MatriculeEmp like :x")
		public List<Materiel> chercher(@Param("x")Integer mc);
	   
	   
}
