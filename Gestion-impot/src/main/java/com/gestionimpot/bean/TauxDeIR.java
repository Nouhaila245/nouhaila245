package com.gestionimpot.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TauxDeIR {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date dateDebut;
	private Date dateFin;
	private Double salaireMin;
	private Double salaireMax;
	private Double pourcentage;
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
	 * @return the salaireMin
	 */
	public Double getSalaireMin() {
		return salaireMin;
	}
	/**
	 * @param salaireMin the salaireMin to set
	 */
	public void setSalaireMin(Double salaireMin) {
		this.salaireMin = salaireMin;
	}
	/**
	 * @return the salaireMax
	 */
	public Double getSalaireMax() {
		return salaireMax;
	}
	/**
	 * @param salaireMax the salaireMax to set
	 */
	public void setSalaireMax(Double salaireMax) {
		this.salaireMax = salaireMax;
	}
	/**
	 * @return the pourcentage
	 */
	public Double getPourcentage() {
		return pourcentage;
	}
	/**
	 * @param pourcentage the pourcentage to set
	 */
	public void setPourcentage(Double pourcentage) {
		this.pourcentage = pourcentage;
	}

	
}
