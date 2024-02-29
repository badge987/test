package com.crud.crud.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Etablissement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "etablissement")
    private List<Utilisateur> utilisateurs;


    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;
    private String code;
    private String nom;
    private String description;


}
