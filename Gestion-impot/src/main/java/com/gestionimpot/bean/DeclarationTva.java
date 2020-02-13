package com.gestionimpot.bean;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )

@DiscriminatorColumn( name = "type" )
public class DeclarationTva {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double totalTva;
	@ManyToOne
	private Societe societe;
	private int annee;
	@OneToMany
	private List<FactureGain> factureGains;
	@OneToMany
	private List<FactureCharge> factureCharges;
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
	 * @return the totalTva
	 */
	public Double getTotalTva() {
		return totalTva;
	}
	/**
	 * @param totalTva the totalTva to set
	 */
	public void setTotalTva(Double totalTva) {
		this.totalTva = totalTva;
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
	 * @return the annee
	 */
	public int getAnnee() {
		return annee;
	}
	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	/**
	 * @return the factureGains
	 */
	public List<FactureGain> getFactureGains() {
		return factureGains;
	}
	/**
	 * @param factureGains the factureGains to set
	 */
	public void setFactureGains(List<FactureGain> factureGains) {
		this.factureGains = factureGains;
	}
	/**
	 * @return the factureCharges
	 */
	public List<FactureCharge> getFactureCharges() {
		return factureCharges;
	}
	/**
	 * @param factureCharges the factureCharges to set
	 */
	public void setFactureCharges(List<FactureCharge> factureCharges) {
		this.factureCharges = factureCharges;
	}

}
