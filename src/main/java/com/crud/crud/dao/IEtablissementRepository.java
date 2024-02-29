package com.crud.crud.dao;

import com.crud.crud.domain.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtablissementRepository extends JpaRepository<Etablissement,Long> {
}
