package com.codegym.repository;

import com.codegym.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findAllByName(String name);
}
