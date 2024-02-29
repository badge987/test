package com.crud.crud.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne()
    @JoinColumn(name = "etablissement_id")
    private Etablissement etablissement;


    @ManyToOne
    @JoinColumn(name = "profil_id",nullable = false)
    private Profil profil;

    private String nom;
    private String prenom;
    private String cin;
    private String adresse;
    private String email;
    private String telephone;
    private String mobile;
    private boolean expertise;
}
