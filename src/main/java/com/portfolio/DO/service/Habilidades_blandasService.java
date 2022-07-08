
package com.portfolio.DO.service;

import com.portfolio.DO.model.Habilidades_blandas;
import com.portfolio.DO.repository.Habilidades_blandasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Habilidades_blandasService implements IHabilidades_blandasService {
    
    @Autowired
    private Habilidades_blandasRepository hab_bRepo;

    @Override
    public void saveHabilidades_B(Habilidades_blandas hab_b) {
        
        hab_bRepo.save(hab_b);
        
    }

    @Override
    public List<Habilidades_blandas> getHabilidades_BList() {
        
        List<Habilidades_blandas> hab_bList = hab_bRepo.findAll();
        return hab_bList;
        
    }

    @Override
    public Habilidades_blandas findHabilidades_B(Long id) {
        
        Habilidades_blandas hab_b = hab_bRepo.findById(id).orElse(null);
        return hab_b;
        
    }

    @Override
    public void deleteHabilidades_B(Long id) {
        
        hab_bRepo.deleteById(id);
        
    }
    
}
