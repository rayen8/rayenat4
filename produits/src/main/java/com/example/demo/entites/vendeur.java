package com.example.demo.entites;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;
@Data
//@NoArgsConstructor
@AllArgsConstructor
@Entity
public class vendeur {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)

	private Long idvendeur;
	private String nomvendeur;
	private long telvendeur;
	
	
	
	public vendeur(Long idvendeur, String nomvendeur, long telvendeur) {
		super();
		this.idvendeur = idvendeur;
		this.nomvendeur = nomvendeur;
		this.telvendeur = telvendeur;
	}
	@OneToMany(mappedBy="vendeur")
private 	List<produit> produits;
	
	public vendeur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getIdvendeur() {
		return idvendeur;
	}
	public void setIdvendeur(Long idvendeur) {
		this.idvendeur = idvendeur;
	}
	public String getNomvendeur() {
		return nomvendeur;
	}
	public void setNomvendeur(String nomvendeur) {
		this.nomvendeur = nomvendeur;
	}
	public long getTelvendeur() {
		return telvendeur;
	}
	public void setTelvendeur(long telvendeur) {
		this.telvendeur = telvendeur;
	}


	public List<produit> getProduits() {
		return produits;
	}


	public void setProduits(List<produit> produits) {
		this.produits = produits;
	}

}
