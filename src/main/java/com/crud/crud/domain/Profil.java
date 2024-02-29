package com.crud.crud.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "profils")

    private List<Role> roles;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "profil")
    private List<Utilisateur> utilisateurs;
    private String libelle;
    private String description;
}
