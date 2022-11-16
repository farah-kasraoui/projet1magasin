package tn.esprit.projet1magasin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.projet1magasin.entities.CategorieProduit;
import tn.esprit.projet1magasin.repositories.RepositoryCategorieProduit;

import java.util.List;

@Service
public class ServiceCategorieProduit implements  IServiceCategorieProduit {
    @Autowired
    RepositoryCategorieProduit  categorieProduit;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieProduit.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieProduit.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        return categorieProduit.save(cp);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieProduit.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {
        categorieProduit.deleteById(id);

    }
}
