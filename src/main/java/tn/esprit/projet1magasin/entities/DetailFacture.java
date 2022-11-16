package tn.esprit.projet1magasin.entities;

import javax.persistence.*;

@Entity
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private Integer qteCommande;
    private Float prixtotalDetail;
    private Integer pourcentageRemise;
    private Float montantRemise;
    @ManyToOne
    private Facture facture;

}
