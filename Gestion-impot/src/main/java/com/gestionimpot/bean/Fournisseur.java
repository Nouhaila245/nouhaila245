package com.gestionimpot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournisseur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String cin;
	private String nom;
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
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
