package com.example.gestionstock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente;
    @Column(name = "quantite")
    private BigDecimal quantité;

}
