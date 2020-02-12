package com.gestionimpot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Societe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String adresse;
	private Double nbrEmployes;
	private Double capital;
	@ManyToOne
	private TypeSociete typeSociete;
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/**
	 * @return the nbrEmployes
	 */
	public Double getNbrEmployes() {
		return nbrEmployes;
	}
	/**
	 * @param nbrEmployes the nbrEmployes to set
	 */
	public void setNbrEmployes(Double nbrEmployes) {
		this.nbrEmployes = nbrEmployes;
	}
	/**
	 * @return the capital
	 */
	public Double getCapital() {
		return capital;
	}
	/**
	 * @param capital the capital to set
	 */
	public void setCapital(Double capital) {
		this.capital = capital;
	}
	/**
	 * @return the typeSociete
	 */
	public TypeSociete getTypeSociete() {
		return typeSociete;
	}
	/**
	 * @param typeSociete the typeSociete to set
	 */
	public void setTypeSociete(TypeSociete typeSociete) {
		this.typeSociete = typeSociete;
	}

	
}
