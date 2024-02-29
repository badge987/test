package com.crud.crud.dao;

import com.crud.crud.domain.Fonction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFonctionRepository extends JpaRepository<Fonction,Long> {
}
