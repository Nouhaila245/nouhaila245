package com.gestionimpot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cin;
	private String nom;
	@ManyToOne
	private Societe societe;
	private Double prime;
	private Double salaire;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the cin
	 */
	public String getCin() {
		return cin;
	}
	/**
	 * @param cin the cin to set
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nomE the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the societe
	 */
	public Societe getSociete() {
		return societe;
	}
	/**
	 * @param societe the societe to set
	 */
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	/**
	 * @return the prime
	 */
	public Double getPrime() {
		return prime;
	}
	/**
	 * @param prime the prime to set
	 */
	public void setPrime(Double prime) {
		this.prime = prime;
	}
	/**
	 * @return the salaire
	 */
	public Double getSalaire() {
		return salaire;
	}
	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	

}
