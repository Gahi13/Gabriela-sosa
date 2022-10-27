package com.portfolio.GS.repositorio;

import com.portfolio.GS.entidad.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfacePersonaRepo extends JpaRepository<Persona,Long>{
    
}
