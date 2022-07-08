
package com.portfolio.DO.DTO;

import com.portfolio.DO.model.Educacion;
import com.portfolio.DO.model.Experiencia;
import com.portfolio.DO.model.Habilidades_blandas;
import com.portfolio.DO.model.Habilidades_duras;
import com.portfolio.DO.model.Persona;
import com.portfolio.DO.model.Proyectos;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DataDTO {
    
    private List<Persona> persona;
    private List<Educacion> educacion;
    private List<Experiencia> experiencia;
    private List<Habilidades_duras> habilidades_duras;
    private List<Habilidades_blandas> habilidades_blandas;
    private List<Proyectos> proyectos;
    
    
    public DataDTO(){};
    
    
}
