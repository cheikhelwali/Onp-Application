package org.sid.web;

import java.util.List;

import org.sid.dao.DemandeCongeRepository;
import org.sid.entities.DemandeConge;
import org.sid.entities.Employer;
import org.springframework.beans.factory.annotation.Autowired;
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
public class DemandeCongeRestService {
	
	
	
	@Autowired
	private DemandeCongeRepository demandecongerepository;
	
	//Afficher tous les demandes
	@RequestMapping(value="/Demandes",method=RequestMethod.GET)
	public List<DemandeConge> getDemandes(){
		
		return demandecongerepository.findAll();
	}
	
	
	// Afficher une demande en specifiant (identifiant)
		@RequestMapping(value="/DemandeNum/{NumDemande}",method=RequestMethod.GET)
		public DemandeConge getEmploye(@PathVariable int NumDemande)
		{
			
			return demandecongerepository.findOne(NumDemande);
		}
		
		//afficher une demande en specifiant  Matricule d'employer(identifiant)
		@RequestMapping(value="/DemandeEmp",method=RequestMethod.GET)
		public List<DemandeConge> chercher2(@RequestParam(name="mc",defaultValue="") Integer mc)
		{
			
			return (List<DemandeConge>) demandecongerepository.chercher(mc);
		}
		
	
		
		
		//inserer une nouvelle demande
		@RequestMapping(value="/Demande",method=RequestMethod.POST)
		public DemandeConge save(@RequestBody DemandeConge DC)
		{
			return demandecongerepository.save(DC);
		}
		
		//je dois creer une methode pour supprimer la demande par employernum
		//supprimer une demande en specifiant son Matricule (identifiant)
		@RequestMapping(value="/Demande/{NumDemande}",method=RequestMethod.DELETE)
		public boolean delete(@PathVariable int NumDemande)
		{
			demandecongerepository.delete(NumDemande);
			 return true;
		}
		
		
		//update une demande
		@RequestMapping(value="/Demande/{NumDemande}",method=RequestMethod.PUT)
		public DemandeConge update(@PathVariable int NumDemande,@RequestBody DemandeConge dm)
		{
			dm.setNumDemande(NumDemande);
			return demandecongerepository.save(dm);
		}
		
		
		
		

}
