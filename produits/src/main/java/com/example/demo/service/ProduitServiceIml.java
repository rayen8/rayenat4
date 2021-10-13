package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entites.produit;
import com.example.demo.repo.ProduitRepository;
 
@org.springframework.stereotype.Service
public class ProduitServiceIml implements ProduitService {
@Autowired
	ProduitRepository produitRepository;
	@Override
	public produit saveProduit(produit p) {
		// TODO Auto-generated method stub
		
		return produitRepository.save(p);
	}

	@Override
	public produit UpdateProduiP(produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);

	}

	@Override
	public void DeleteProduit(produit p) {
		// TODO Auto-generated method stub
	 produitRepository.delete(p);

	}

	@Override
	public void DeleteProduitById(Long id) {
		// TODO Auto-generated method stub
	 produitRepository.deleteById(id);

	}

	@Override
	public produit getProduit(Long id) {
		// TODO Auto-generated method stub
		return produitRepository.findById(id).get()
;
	}

	@Override
	public List<produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();

	}

}
