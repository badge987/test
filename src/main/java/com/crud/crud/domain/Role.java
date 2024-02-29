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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "role_profil",
            joinColumns = @JoinColumn(name ="role_id"),
            inverseJoinColumns = @JoinColumn(name="profil_id")
    )
    private List<Profil> profils;
    private String libelle;
    private String description;
    private int domaine=1;

}
