package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.Produit;

public interface RepositoryProduit  extends JpaRepository<Produit,Long> {
}
