package com.crud.crud.dao;

import com.crud.crud.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role,Long> {
}
