package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.CategorieProduit;

public interface RepositoryCategorieProduit extends JpaRepository<CategorieProduit,Long> {
}
