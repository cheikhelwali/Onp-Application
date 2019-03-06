package org.sid.web;
import org.sid.entities.Employer;

import java.util.List;
import org.sid.dao.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin("*")
public class EmployerRestService {

	@Autowired
	private EmployerRepository employerRepository;
	// Afficher tous les employes
	@RequestMapping(value="/Employees",method=RequestMethod.GET)
	public List<Employer> getEmployees(){
		return employerRepository.findAll();
	}
	// Chercher les employees
	@RequestMapping(value="/chercheremployee",method=RequestMethod.GET)
	public List<Employer> chercher2(@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="2") int size)
	{
		
		return (List<Employer>) employerRepository.chercher("%"+mc+"%", new PageRequest(page,size));
	}
	
	// Chercher les employees
	@RequestMapping(value="/chercheremploye",method=RequestMethod.GET)
	public List<Employer> chercher(@RequestParam(name="mc",defaultValue="") String mc,
		@RequestParam(name="page",defaultValue="0") int page,  @RequestParam(name="size",defaultValue="2") int size)
		{
			
			return employerRepository.chercher("%"+mc+"%", new PageRequest(page,size));
		}
	
	// Afficher un employer en specifiant son Matricule (identifiant)
	@RequestMapping(value="/Employe/{MatriculeEmp}",method=RequestMethod.GET)
	public Employer getEmploye(@PathVariable int MatriculeEmp)
	{
		
		return employerRepository.findOne(MatriculeEmp);
	}
	
	// Inserer un nouveau employer
	@RequestMapping(value="/Employe",method=RequestMethod.POST)
	public Employer save(@RequestBody Employer Emp)
	{
		return employerRepository.save(Emp);
	}
	
	// Supprimer un employer en specifiant son Matricule (identifiant)
	@RequestMapping(value="/Employe/{MatriculeEmp}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable int MatriculeEmp)
	{
		 employerRepository.delete(MatriculeEmp);
		 return true;
	}
	
	// Update un employe
	@RequestMapping(value="/Employe/{MatriculeEmp}",method=RequestMethod.PUT)
	public Employer update(@PathVariable int MatriculeEmp,@RequestBody Employer Emp)
	{
		Emp.setMatriculeEmp(MatriculeEmp);
		return employerRepository.save(Emp);
	}
}
