package com.example.demo.repo;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entites.produit;
import com.example.demo.entites.vendeur;

public interface ProduitRepository extends JpaRepository<produit, Long> {

	List<produit> findByNomproduit (String nom);
	List<produit> findByNomproduitContains (String nom);
	
	/*@Query
	("select p from produit p where p.nomproduit like %?1 and p.prixproduit like% > ?2")
	List<produit> findByNomPrixproduit (String nom, Double i);
	@Query
	("select p from produit p where p.nomproduit like %:nom and p.prixproduit like% > :prix")
	List<produit> findByNomPrixproduit (@Param("nom") String nom, @Param("prix") Double i);*/
	
	@Query
	("select p from produit p where p.vendeur=1")
	
	List<produit> findByVendeur(vendeur vend);
	
	List<produit> findByVendeurIdvendeur(long id);
	
	List<produit> findByOrderByNomproduitAsc();
	
	
}