package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.DetailFournisseur;

public interface RepositoryDetailFournisseur extends JpaRepository<DetailFournisseur,Long> {
}
