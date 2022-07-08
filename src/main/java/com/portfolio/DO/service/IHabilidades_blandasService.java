
package com.portfolio.DO.service;

import com.portfolio.DO.model.Habilidades_blandas;
import java.util.List;


public interface IHabilidades_blandasService {
    
    public void saveHabilidades_B(Habilidades_blandas hab_b);
    
    public List<Habilidades_blandas> getHabilidades_BList();
    
    public Habilidades_blandas findHabilidades_B (Long id);
    
    public void deleteHabilidades_B(Long id);
    
}
