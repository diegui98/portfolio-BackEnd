
package com.portfolio.DO.service;

import com.portfolio.DO.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public void saveProyecto(Proyectos proye);
    
    public List<Proyectos> getProyectosList();
    
    public Proyectos findProyecto (Long id);
    
    public void deleteProyecto(Long id);
    
}
