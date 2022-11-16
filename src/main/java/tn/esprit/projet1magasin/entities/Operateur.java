package tn.esprit.projet1magasin.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdOperateur;
    private String nom;
    private String prenom;
    private String password;
    @OneToMany
    Set<Facture>factures;
}
