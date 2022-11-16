package tn.esprit.projet1magasin.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur ;
    private String codeFournisseur;
    private String libelleFournisseur;


    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;
    @OneToMany(mappedBy = "fournisseur")
    Set<Facture>factureSet;
    @ManyToMany(mappedBy = "fournisseurSet")
    Set<SecteurActivite>secteurActivites;
    @OneToOne
    private DetailFournisseur detailFournisseur;
}
