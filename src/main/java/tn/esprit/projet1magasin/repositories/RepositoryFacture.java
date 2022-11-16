package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.Facture;

public interface RepositoryFacture  extends JpaRepository<Facture,Long> {
}
