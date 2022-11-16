package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.Operateur;

public interface RepositoryOperateur  extends JpaRepository<Operateur,Long> {
}
