package org.sid.dao;

import java.util.List;

import org.sid.entities.Employer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployerRepository extends JpaRepository<Employer,Integer> {
	
    @Query("select emp from Employer emp where emp.NomEmp like :x")
	public List<Employer> chercher(@Param("x")String mc,Pageable pageable);

  /*  @Query("delete from employer where employer.matricule_emp like :x")
  	public void del(@Param("x")int mc);
	*/
    
    
    
    
    
    
    
    
}
