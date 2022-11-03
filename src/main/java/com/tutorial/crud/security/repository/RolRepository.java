package com.tutorial.crud.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.crud.security.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol,Integer>{
    Optional<Rol> findByRolNombre(String rolNombre);
}
