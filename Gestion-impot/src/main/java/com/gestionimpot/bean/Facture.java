package com.gestionimpot.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity

public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	@ManyToOne
	protected Societe societe;
	protected Date dateFacturation;
	protected Date datePaiement;
	@ManyToOne
	protected DeclarationTva declarationTva;
	protected Double montantHt;
	protected Double montantTtc;
	protected Double tva;
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
	 * @return the dateFacturation
	 */
	public Date getDateFacturation() {
		return dateFacturation;
	}
	/**
	 * @param dateFacturation the dateFacturation to set
	 */
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	/**
	 * @return the datePaiement
	 */
	public Date getDatePaiement() {
		return datePaiement;
	}
	/**
	 * @param datePaiement the datePaiement to set
	 */
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	/**
	 * @return the declarationTva
	 */
	public DeclarationTva getDeclarationTva() {
		return declarationTva;
	}
	/**
	 * @param declarationTva the declarationTva to set
	 */
	public void setDeclarationTva(DeclarationTva declarationTva) {
		this.declarationTva = declarationTva;
	}
	/**
	 * @return the montantHt
	 */
	public Double getMontantHt() {
		return montantHt;
	}
	/**
	 * @param montantHt the montantHt to set
	 */
	public void setMontantHt(Double montantHt) {
		this.montantHt = montantHt;
	}
	/**
	 * @return the montantTtc
	 */
	public Double getMontantTtc() {
		return montantTtc;
	}
	/**
	 * @param montantTtc the montantTtc to set
	 */
	public void setMontantTtc(Double montantTtc) {
		this.montantTtc = montantTtc;
	}
	/**
	 * @return the tva
	 */
	public Double getTva() {
		return tva;
	}
	/**
	 * @param tva the tva to set
	 */
	public void setTva(Double tva) {
		this.tva = tva;
	}
	

	
}
