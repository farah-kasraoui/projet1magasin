package tn.esprit.projet1magasin.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit ;
    private String codeProduit;
    private String libelleProduit;
    private Float prix ;
    private Date datecreation;
    private Date datedernieremodification ;
    @ManyToOne
    private Stock stock;
    @ManyToOne
    private CategorieProduit categorieProduit;

}
