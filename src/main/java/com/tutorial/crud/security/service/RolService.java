package com.tutorial.crud.security.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.crud.security.entity.Rol;
import com.tutorial.crud.security.enums.RolNombre;

@Service
@Transactional
public class RolService {
    
    @Autowired
    private RolService rolService;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolService.getByRolNombre(rolNombre);
    }
}
