package com.crud.crud.dao;

import com.crud.crud.domain.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
