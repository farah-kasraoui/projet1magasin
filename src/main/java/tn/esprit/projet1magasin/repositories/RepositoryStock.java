package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.Stock;

public interface RepositoryStock extends JpaRepository<Stock,Long> {
}
