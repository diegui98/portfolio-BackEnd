
package com.portfolio.DO.service;

import com.portfolio.DO.model.Proyectos;
import com.portfolio.DO.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {
    
    @Autowired
    private ProyectosRepository proyeRepo;

    @Override
    public void saveProyecto(Proyectos proye) {
        
        proyeRepo.save(proye);
        
    }

    @Override
    public List<Proyectos> getProyectosList() {
        
        List<Proyectos> proyeList = proyeRepo.findAll();
        return proyeList;
        
    }

    @Override
    public Proyectos findProyecto(Long id) {
        
        Proyectos proye = proyeRepo.findById(id).orElse(null);
        return proye;
        
    }

    @Override
    public void deleteProyecto(Long id) {
        
        proyeRepo.deleteById(id);
        
    }
    
}
