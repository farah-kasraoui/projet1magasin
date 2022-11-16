package tn.esprit.projet1magasin.services;

import tn.esprit.projet1magasin.entities.CategorieProduit;

import java.util.List;

public interface IServiceCategorieProduit {
    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit(CategorieProduit cp);

    CategorieProduit updateCategorieProduit(CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit(Long id);

    void removeCategorieProduit(Long id);
}
