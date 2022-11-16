package tn.esprit.projet1magasin.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcategorieProduit;
    private String codeProduit;
    private String libellecategorieProduit;
    @OneToMany(mappedBy = "categorieProduit")
    Set<Produit>produitSet;
}
