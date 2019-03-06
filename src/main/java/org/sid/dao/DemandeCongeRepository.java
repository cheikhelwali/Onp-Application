package org.sid.dao;

import java.util.List;

import org.sid.entities.DemandeConge;
import org.sid.entities.Employer;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DemandeCongeRepository extends JpaRepository<DemandeConge,Integer>{
	
	   @Query("select dc from DemandeConge dc where dc.employer.MatriculeEmp like :x")
		public List<DemandeConge> chercher(@Param("x")Integer mc);

	   
	   
}
