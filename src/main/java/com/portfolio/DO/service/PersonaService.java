
package com.portfolio.DO.service;

import com.portfolio.DO.model.Persona;
import com.portfolio.DO.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository persoRepo;
    
    @Override
    public void savePersona(Persona perso) {
        
        persoRepo.save(perso);
        
    }

    @Override
    public List<Persona> getPersonaList() {
        
        List<Persona> personaList =  persoRepo.findAll();
        return personaList;
    }

    @Override
    public Persona findPersona(Long id) {
        
        Persona persona = persoRepo.findById(id).orElse(null);
        return persona;
        
    }

    @Override
    public void deletePersona(Long id) {
        
        persoRepo.deleteById(id);
        
    }
    
}
