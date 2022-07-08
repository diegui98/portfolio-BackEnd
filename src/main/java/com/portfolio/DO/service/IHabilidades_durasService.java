
package com.portfolio.DO.service;

import com.portfolio.DO.model.Habilidades_duras;
import java.util.List;


public interface IHabilidades_durasService {
    
    public void saveHabilidades_D(Habilidades_duras hab_d);
    
    public List<Habilidades_duras> getHabilidades_DList();
    
    public Habilidades_duras findHabilidades_D (Long id);
    
    public void deleteHabilidades_D(Long id);
}
