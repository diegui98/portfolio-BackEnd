
package com.portfolio.DO.service;

import com.portfolio.DO.model.Educacion;
import com.portfolio.DO.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private EducacionRepository educaRepo;

    @Override
    public void saveEducacion(Educacion educa) {
        
        educaRepo.save(educa);
        
    }

    @Override
    public List<Educacion> getEducacionList() {
        
        List<Educacion> educaList = educaRepo.findAll();
        return educaList;
        
    }

    @Override
    public Educacion findEducacion(Long id) {
        
        Educacion educa = educaRepo.findById(id).orElse(null);
        return educa;
        
    }

    @Override
    public void deleteEducacion(Long id) {
        
        educaRepo.deleteById(id);
        
    }
    
}
