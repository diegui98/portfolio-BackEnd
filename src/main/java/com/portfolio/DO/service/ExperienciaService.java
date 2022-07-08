
package com.portfolio.DO.service;

import com.portfolio.DO.model.Experiencia;
import com.portfolio.DO.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{

    @Autowired
    private ExperienciaRepository experRepo;
    
    @Override
    public void saveExperiencia(Experiencia exper) {

        experRepo.save(exper);
        
    }

    @Override
    public List<Experiencia> getExperienciaList() {

        List<Experiencia> experList = experRepo.findAll();
        return experList;
        
    }

    @Override
    public Experiencia findExperiencia(Long id) {

        Experiencia exper = experRepo.findById(id).orElse(null);
        return exper;
        
    }

    @Override
    public void deleteExperiencia(Long id) {

        experRepo.deleteById(id);
        
    }
    
}
