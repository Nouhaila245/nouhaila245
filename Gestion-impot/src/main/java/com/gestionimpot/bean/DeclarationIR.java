package com.gestionimpot.bean;

import javax.persistence.*;


@Entity
@DiscriminatorValue( value="IR" )
public class DeclarationIR extends DeclarationTva {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne
	private Employe employe;
	@ManyToOne
	private Societe societe;
	private Double salaire;
	private Double montantDeclaration;
	@ManyToOne
	private TauxDeIR tauxDeIR;
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
	 * @return the employe
	 */
	public Employe getEmploye() {
		return employe;
	}
	/**
	 * @param employe the employe to set
	 */
	public void setEmploye(Employe employe) {
		this.employe = employe;
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
	/**
	 * @return the montantDeclaration
	 */
	public Double getMontantDeclaration() {
		return montantDeclaration;
	}
	/**
	 * @param montantDeclaration the montantDeclaration to set
	 */
	public void setMontantDeclaration(Double montantDeclaration) {
		this.montantDeclaration = montantDeclaration;
	}
	/**
	 * @return the tauxDeIR
	 */
	public TauxDeIR getTauxDeIR() {
		return tauxDeIR;
	}
	/**
	 * @param tauxDeIR the tauxDeIR to set
	 */
	public void setTauxDeIR(TauxDeIR tauxDeIR) {
		this.tauxDeIR = tauxDeIR;
	}

	
	
}
