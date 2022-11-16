package tn.esprit.projet1magasin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet1magasin.entities.DetailFacture;

public interface RepositoryDetailFacture extends JpaRepository<DetailFacture,Long> {
}
