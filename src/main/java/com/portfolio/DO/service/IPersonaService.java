
package com.portfolio.DO.service;

import com.portfolio.DO.model.Persona;
import java.util.List;


public interface IPersonaService {
    
    public void savePersona(Persona perso);
    
    public List<Persona> getPersonaList();
    
    public Persona findPersona (Long id);
    
    public void deletePersona(Long id);
    
}
