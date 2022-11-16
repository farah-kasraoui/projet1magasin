package tn.esprit.projet1magasin.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdReglement;
    private Float montantPaye;
    private Float montantRestant;
    private boolean payee;
    private Date dateReglement;
    @ManyToOne
    private Facture facture;
}
