package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.Fournisseur;

public interface RepositoryFournisseur  extends JpaRepository<Fournisseur,Long> {
}
