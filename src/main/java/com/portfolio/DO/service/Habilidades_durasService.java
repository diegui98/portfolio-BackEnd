
package com.portfolio.DO.service;

import com.portfolio.DO.model.Habilidades_duras;
import com.portfolio.DO.repository.Habilidades_durasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Habilidades_durasService implements IHabilidades_durasService {
    
    @Autowired
    private Habilidades_durasRepository hab_DRepo;

    @Override
    public void saveHabilidades_D(Habilidades_duras hab_d) {
        
        hab_DRepo.save(hab_d);
        
    }

    @Override
    public List<Habilidades_duras> getHabilidades_DList() {
        
        List<Habilidades_duras> hab_DList = hab_DRepo.findAll();
        return hab_DList;
        
    }

    @Override
    public Habilidades_duras findHabilidades_D(Long id) {
        
        Habilidades_duras hab_D = hab_DRepo.findById(id).orElse(null);
        return hab_D;
        
    }

    @Override
    public void deleteHabilidades_D(Long id) {
        
        hab_DRepo.deleteById(id);
        
    }
    
}
