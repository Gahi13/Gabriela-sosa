package com.portfolio.GS.Interface;

import com.portfolio.GS.entidad.Persona;
import java.util.List;


public interface InterfacePersonaServicio {
    //traer una lista persona
    public List<Persona>  getPersona();
    
    //guardar un onjeto de clase Persona
    public void savePersona(Persona persona);
    
    
   //eliminar un objeto de persona y lo busco por el id
    public void deletePersona(Long id);
    
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
