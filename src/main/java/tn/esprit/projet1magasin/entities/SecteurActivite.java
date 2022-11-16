package tn.esprit.projet1magasin.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;

    @ManyToMany
    Set<Fournisseur>fournisseurSet;
}
