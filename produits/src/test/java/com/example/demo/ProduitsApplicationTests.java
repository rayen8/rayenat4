package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;
import java.util.Locale.Category;

import com.example.demo.entites.produit;
import com.example.demo.entites.vendeur;
import com.example.demo.repo.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository ProduitRepository;
	
	@Test
	public void testCreateProduit() {
	produit prod = new produit("PC lenovo",1500.500,new Date(0));
	ProduitRepository.save(prod);
	}
@Test 
public void testFindProduit () {
	produit p= ProduitRepository.findById(5L).get();
System.out.println(p);}
	

	public void testUpdateProduit () {
		produit p= ProduitRepository.findById(2L).get();
	System.out.println(p);
	p.setPrixproduit(2000.0);
	ProduitRepository.save(p);
	}
	
	public void testDeleteProduit () {
		 ProduitRepository.deleteById(3L);
	
	}
	
	public void testFindAllProduit () {
		List<produit> prods=ProduitRepository.findAll();
		for (produit p:prods)
			System.out.println(p);
	}
	
		@Test
		public void testFindProduitByNom() {
			List<produit> Lp=ProduitRepository.findByNomproduit("PC Asus");
			for (produit p:Lp)
				System.out.println(p);
		}
		@Test
		public void testFindProduitByNomContains() {
			List<produit> Lp=ProduitRepository.findByNomproduitContains("l");
			for (produit p:Lp)
				System.out.println(p);
		}
		/*@Test
		public void testFindProduitByNomPrix() {
			List<produit> Lp=ProduitRepository.findByNomPrixproduit("PC Asus",1500.0);
			for (produit p:Lp)
				System.out.println(p);
		}*/
		
		@Test
		public void testFindByVendeur() {
			vendeur vend=new vendeur();
			vend.setIdvendeur(111L);
			List<produit> Lp=ProduitRepository.findByVendeur(vend);
			for (produit p:Lp)
				System.out.println(p);
		}
		@Test
		public void testFindByVendeurIdvendeur() {
			
			List<produit> Lp=ProduitRepository.findByVendeurIdvendeur(111L);
			for (produit p:Lp)
				System.out.println(p);
		}
		
		@Test
		public void testfindByOrderByNomproduitAsc() {
			
			List<produit> Lp = ProduitRepository.findByOrderByNomproduitAsc();
			for (produit p:Lp)
				System.out.println(p);
		}
}
