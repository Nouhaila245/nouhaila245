package com.gestionimpot.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class TauxDeclarationIS  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private DeclarationIS declarationIS;
	private Date dateDebut;
	private Date dateFin;
	private Double montantMin;
	private Double montantMax;
	private Double pourcentageRetard;
	/**
	 * @return the declarationIS
	 */
	public DeclarationIS getDeclarationIS() {
		return declarationIS;
	}
	/**
	 * @param declarationIS the declarationIS to set
	 */
	public void setDeclarationIS(DeclarationIS declarationIS) {
		this.declarationIS = declarationIS;
	}
	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}
	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}
	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	/**
	 * @return the montantMin
	 */
	public Double getMontantMin() {
		return montantMin;
	}
	/**
	 * @param montantMin the montantMin to set
	 */
	public void setMontantMin(Double montantMin) {
		this.montantMin = montantMin;
	}
	/**
	 * @return the montantMax
	 */
	public Double getMontantMax() {
		return montantMax;
	}
	/**
	 * @param montantMax the montantMax to set
	 */
	public void setMontantMax(Double montantMax) {
		this.montantMax = montantMax;
	}
	/**
	 * @return the pourcentageRetard
	 */
	public Double getPourcentageRetard() {
		return pourcentageRetard;
	}
	/**
	 * @param pourcentageRetard the pourcentageRetard to set
	 */
	public void setPourcentageRetard(Double pourcentageRetard) {
		this.pourcentageRetard = pourcentageRetard;
	}

	
}
