package tn.esprit.projet1magasin.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idFacture ;
    private Float montantRemise ;
    private Float montantFacture ;
    private Date dateCreationFacture;
    private Date dateDerniereModification;
    private Boolean archive;
    @OneToMany(mappedBy = "facture")
    Set<Reglement>reglements;

    @OneToMany(mappedBy ="facture")
    Set<DetailFacture>detailFactures;
    @ManyToOne
    private Fournisseur fournisseur;
}
