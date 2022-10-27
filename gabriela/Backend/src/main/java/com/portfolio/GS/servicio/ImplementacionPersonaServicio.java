
package com.portfolio.GS.servicio;

import com.portfolio.GS.Interface.InterfacePersonaServicio;
import com.portfolio.GS.entidad.Persona;
import com.portfolio.GS.repositorio.InterfacePersonaRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementacionPersonaServicio implements InterfacePersonaServicio{
@Autowired InterfacePersonaRepo interPersonarepo;
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = interPersonarepo.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        interPersonarepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        interPersonarepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
       Persona persona= interPersonarepo.findById(id). orElse(null);
       return persona;
    }
    
}
