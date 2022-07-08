
package com.portfolio.DO.service;

import com.portfolio.DO.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public void saveEducacion(Educacion educa);
    
    public List<Educacion> getEducacionList();
    
    public Educacion findEducacion (Long id);
    
    public void deleteEducacion(Long id);
}
