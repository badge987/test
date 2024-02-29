package com.crud.crud.dao;

import com.crud.crud.domain.Profil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfilRepository extends JpaRepository<Profil,Long> {
}
