package org.sid.web;

import java.util.List;
import org.sid.dao.MaterielRepository;
import org.sid.entities.Materiel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class MaterielRestService {


	@Autowired
	private MaterielRepository Materielrepository;
	
	@RequestMapping(value="/Materiaux",method=RequestMethod.GET)
	public List<Materiel> getMateriel(){
		
		return Materielrepository.findAll();
	}
	
	
	//inserer une nouvelle demande
	@RequestMapping(value="/Materiel",method=RequestMethod.POST)
	public Materiel save(@RequestBody Materiel DC)
			{
				return Materielrepository.save(DC);
			}
			
	@RequestMapping(value="/Materiel/{idMateriel}",method=RequestMethod.DELETE)
	public boolean delete(@PathVariable int idMateriel)
	{
	Materielrepository.delete(idMateriel);
	return true;
	}
			
	
	// Update une demande
	@RequestMapping(value="/Materiel/{idMateriel}",method=RequestMethod.PUT)
	public Materiel update(@PathVariable int idMateriel,@RequestBody Materiel ma)
	{
	ma.setIdMateriel(idMateriel);
	return Materielrepository.save(ma);
	}

	// Afficher une demande en specifiant  Matricule d'employer(identifiant)
	@RequestMapping(value="/MaterielEmp",method=RequestMethod.GET)
	public List<Materiel> chercher2(@RequestParam(name="ma",defaultValue="") Integer mc)
	{
		return (List<Materiel>) Materielrepository.chercher(mc);
	}
			
			
}
