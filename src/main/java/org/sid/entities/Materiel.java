package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Materiel {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
		private int IdMateriel;
		
	private String Nomemp;
	private String type;
	private String Serie;
	private String Etat;
	@ManyToOne
	@JoinColumn(name = "MatriculeEmp")
	private Employer employer;
	
	public int getIdMateriel() {
		return IdMateriel;
	}
	public void setIdMateriel(int idMateriel) {
		IdMateriel = idMateriel;
	}
	
	public Materiel(int idMateriel, String nomemp, String type, String serie, String etat, Employer employer) {
		super();
		IdMateriel = idMateriel;
		Nomemp = nomemp;
		this.type = type;
		Serie = serie;
		Etat = etat;
		this.employer = employer;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	public String getNomemp() {
		return Nomemp;
	}
	public void setNomemp(String nomemp) {
		Nomemp = nomemp;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSerie() {
		return Serie;
	}
	public void setSerie(String serie) {
		Serie = serie;
	}
	public String getEtat() {
		return Etat;
	}
	public void setEtat(String etat) {
		Etat = etat;
	}
	public Materiel(int idMateriel, String nomemp, String type, String serie, String etat) {
		super();
		IdMateriel = idMateriel;
		Nomemp = nomemp;
		this.type = type;
		Serie = serie;
		Etat = etat;
	}
	public Materiel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
