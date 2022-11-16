package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.Reglement;

public interface RepositoryReglement extends JpaRepository<Reglement,Long> {
}
