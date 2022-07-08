
package com.portfolio.DO.service;

import com.portfolio.DO.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public void saveExperiencia(Experiencia exper);
    
    public List<Experiencia> getExperienciaList();
    
    public Experiencia findExperiencia (Long id);
    
    public void deleteExperiencia(Long id);
}
