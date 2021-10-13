package com.example.demo.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class produit {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idproduit;
	private String nomproduit;
	private Double prixproduit;
	private Date dateCreation;
	
	@ManyToOne
	private vendeur vendeur;
	
	
	public Long getIdproduit() {
		return idproduit;
	}
	public produit() {
		super();
	}
	
	public produit(Long idproduit, String nomproduit, Double prixproduit, Date dateCreation) {
		super();
		this.idproduit = idproduit;
		this.nomproduit = nomproduit;
		this.prixproduit = prixproduit;
		this.dateCreation = dateCreation;
	}
	public produit(String nomproduit, Double prixproduit, Date dateCreation) {
		super();
		this.nomproduit = nomproduit;
		this.prixproduit = prixproduit;
		this.dateCreation = dateCreation;
	}

	public void setIdproduit(Long idproduit) {
		this.idproduit = idproduit;
	}
	public String getNomproduit() {
		return nomproduit;
	}
	public void setNomproduit(String nomproduit) {
		this.nomproduit = nomproduit;
	}
	public Double getPrixproduit() {
		return prixproduit;
	}
	public void setPrixproduit(Double prixproduit) {
		this.prixproduit = prixproduit;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "produit [idproduit=" + idproduit + ", nomproduit=" + nomproduit + ", prixproduit=" + prixproduit
				+ ", dateCreation=" + dateCreation + "]";
	}
	public vendeur getVendeur() {
		return vendeur;
	}
	public void setVendeur(vendeur vendeur) {
		this.vendeur = vendeur;
	}
	
}