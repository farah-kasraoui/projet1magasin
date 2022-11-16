package tn.esprit.projet1magasin.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFournisseur;
    private Date dateDebutCollaboration;
    private String Adresse;
    private String matrice ;
    @OneToOne
    private Fournisseur fournisseur;
    @OneToOne(mappedBy = "detailFournisseur")
    private Fournisseur getFournisseur;
}
