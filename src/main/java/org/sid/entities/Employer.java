package org.sid.entities;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;

@Entity
public class Employer implements Serializable  {
		
@Id @GeneratedValue(strategy=GenerationType.AUTO) 
private int MatriculeEmp;

private String NomEmp;
private String PrenomEmp;
private int Age;
private String Adresse;
private String Ville;
private long Tel;
private String Rib;
private String Striuationfamiliale;
private String Fonction;

@Temporal(TemporalType.DATE)
private Date DateRecrutement;

private int IdEnfant;
private int IdDiplome;
public int getMatriculeEmp() {
	return MatriculeEmp;
}
public void setMatriculeEmp(int matriculeEmp) {
	MatriculeEmp = matriculeEmp;
}
public String getNomEmp() {
	return NomEmp;
}
public void setNomEmp(String nomEmp) {
	NomEmp = nomEmp;
}
public String getPrenomEmp() {
	return PrenomEmp;
}
public void setPrenomEmp(String prenomEmp) {
	PrenomEmp = prenomEmp;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public String getVille() {
	return Ville;
}
public void setVille(String ville) {
	Ville = ville;
}
public long getTel() {
	return Tel;
}
public void setTel(long tel) {
	Tel = tel;
}
public String getRib() {
	return Rib;
}
public void setRib(String rib) {
	Rib = rib;
}
public String getStriuationfamiliale() {
	return Striuationfamiliale;
}
public void setStriuationfamiliale(String striuationfamiliale) {
	Striuationfamiliale = striuationfamiliale;
}
public String getFonction() {
	return Fonction;
}
public void setFonction(String fonction) {
	Fonction = fonction;
}
public Date getDateRecrutement() {
	return DateRecrutement;
}
public void setDateRecrutement(Date dateRecrutement) {
	DateRecrutement = dateRecrutement;
}
public int getIdEnfant() {
	return IdEnfant;
}
public void setIdEnfant(int idEnfant) {
	IdEnfant = idEnfant;
}
public int getIdDiplome() {
	return IdDiplome;
}
public void setIdDiplome(int idDiplome) {
	IdDiplome = idDiplome;
}
public Employer(int matriculeEmp, String nomEmp, String prenomEmp, int age,
		String adresse, String ville, long tel, String rib,
		String striuationfamiliale, String fonction, Date dateRecrutement,
		int idEnfant, int idDiplome) {
	super();
	this.MatriculeEmp = matriculeEmp;
	this.NomEmp = nomEmp;
	this.PrenomEmp = prenomEmp;
	this.Age = age;
	this.Adresse = adresse;
	this.Ville = ville;
	this.Tel = tel;
	this.Rib = rib;
	this.Striuationfamiliale = striuationfamiliale;
	this.Fonction = fonction;
	this.DateRecrutement = dateRecrutement;
	this.IdEnfant = idEnfant;
	this.IdDiplome = idDiplome;
}
public Employer() {
	super();
	// TODO Auto-generated constructor stub
}


	
}
