package com.gestionimpot.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class DeclarationIS {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double totalCharge;
	private Double totalGain;
	private Double montant;
	private Double montantPenalite;
	@ManyToOne
	private Societe societe;
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
	 * @return the totalCharge
	 */
	public Double getTotalCharge() {
		return totalCharge;
	}
	/**
	 * @param totalCharge the totalCharge to set
	 */
	public void setTotalCharge(Double totalCharge) {
		this.totalCharge = totalCharge;
	}
	/**
	 * @return the totalGain
	 */
	public Double getTotalGain() {
		return totalGain;
	}
	/**
	 * @param totalGain the totalGain to set
	 */
	public void setTotalGain(Double totalGain) {
		this.totalGain = totalGain;
	}
	/**
	 * @return the montant
	 */
	public Double getMontant() {
		return montant;
	}
	/**
	 * @param montant the montant to set
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	/**
	 * @return the montantPenalite
	 */
	public Double getMontantPenalite() {
		return montantPenalite;
	}
	/**
	 * @param montantPenalite the montantPenalite to set
	 */
	public void setMontantPenalite(Double montantPenalite) {
		this.montantPenalite = montantPenalite;
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

	
}
