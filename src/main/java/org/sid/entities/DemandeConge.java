package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DemandeConge implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private int NumDemande;
	
	@Temporal(TemporalType.DATE)
	private Date DateDebut;
	
	@Temporal(TemporalType.DATE)
	private Date DateFin;
	
	private String Etat;
	private String Destination;
	private String Commentaire;
	private String Motif;
	@ManyToOne
	@JoinColumn(name = "MatriculeEmp")
	private Employer employer;
	
	private String MatriculeResponsable;

	public int getNumDemande() {
		return NumDemande;
	}

	public void setNumDemande(int numDemande) {
		NumDemande = numDemande;
	}

	public Date getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		DateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public String getMotif() {
		return Motif;
	}

	public void setMotif(String motif) {
		Motif = motif;
	}

	public DemandeConge(int numDemande, Date dateDebut, Date dateFin, String etat, String destination,
			String commentaire, Employer employer, String matriculeResponsable, String motif) {
		super();
		NumDemande = numDemande;
		DateDebut = dateDebut;
		DateFin = dateFin;
		Etat = etat;
		Destination = destination;
		Commentaire = commentaire;
		this.employer = employer;
		Motif=motif;
		MatriculeResponsable = matriculeResponsable;
	}

	public String getCommentaire() {
		return Commentaire;
	}

	public void setCommentaire(String commentaire) {
		Commentaire = commentaire;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}


	public String getMatriculeResponsable() {
		return MatriculeResponsable;
	}

	public void setMatriculeResponsable(String matriculeResponsable) {
		MatriculeResponsable = matriculeResponsable;
	}



	public DemandeConge() {
		super();
	}
	
	
	
	
}
