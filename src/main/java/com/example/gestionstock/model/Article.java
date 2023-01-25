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
@Table(name = "article")
public class Article extends AbstractEntity{
    @Column(name = "codearticle")
    private String codeArticle;
    @Column(name = "description")
    private String description;
    @Column(name = "prixunitaireHT")
    private BigDecimal prixUnitaireHt;
    @Column(name = "taxetva")
    private BigDecimal taxeTva;
    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc;
    @Column(name = "photo")
    private String photo;
    @ManyToOne
    @JoinColumn(name = "idcategory")
    private Category category;
}
