package com.example.security_lab.repositories;

import com.example.security_lab.models.ERoles;
import com.example.security_lab.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolesRepository extends JpaRepository<Roles, Long> {
    Optional<Roles> findByName(ERoles name);
}
