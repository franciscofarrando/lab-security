package com.example.security_lab.repositories;

import com.example.security_lab.models.ERole;
import com.example.security_lab.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
