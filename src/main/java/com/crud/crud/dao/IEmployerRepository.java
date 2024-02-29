package com.crud.crud.dao;

import com.crud.crud.domain.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployerRepository extends JpaRepository<Employer,Long> {
}
