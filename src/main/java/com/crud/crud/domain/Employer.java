package com.crud.crud.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "fonction_id")
    private Fonction fonction;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "employer")
    private List<Etablissement> etablissements;
    private String nom;
    private String prenom;
    private Date dateNaissance;
}
