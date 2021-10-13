package com.example.demo.service;
import com.example.demo.entites.produit;
import java.util.List;
public interface ProduitService {
produit saveProduit(produit p);
produit UpdateProduiP(produit p);
void DeleteProduit(produit p);

void DeleteProduitById(Long id); 
produit getProduit(Long id);
List<produit> getAllProduits();
}