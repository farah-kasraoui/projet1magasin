package tn.esprit.projet1magasin.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private Integer qte;
    private  Integer qtemin;
    private String libelleStock;
    @OneToMany(mappedBy = "stock")
    Set<Produit>produits;
}
