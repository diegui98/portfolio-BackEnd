
package com.portfolio.DO.controller;

import com.portfolio.DO.DTO.DataDTO;
import com.portfolio.DO.model.Educacion;
import com.portfolio.DO.model.Experiencia;
import com.portfolio.DO.model.Habilidades_blandas;
import com.portfolio.DO.model.Habilidades_duras;
import com.portfolio.DO.model.Persona;
import com.portfolio.DO.model.Proyectos;
import com.portfolio.DO.service.IEducacionService;
import com.portfolio.DO.service.IExperienciaService;
import com.portfolio.DO.service.IHabilidades_blandasService;
import com.portfolio.DO.service.IHabilidades_durasService;
import com.portfolio.DO.service.IPersonaService;
import com.portfolio.DO.service.IProyectosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PortfolioController {
    
    @Autowired
    private IPersonaService interPerso;
    
    @Autowired
    private IEducacionService interEduca;
    
    @Autowired
    private IExperienciaService interExper;
    
    @Autowired
    private IHabilidades_blandasService interHab_B;
    
    @Autowired
    private IHabilidades_durasService interHab_D;
    
    @Autowired
    private IProyectosService interProye;
    
    @GetMapping("portfolio/persona")
    public List<Persona> getPersonaList(){
        
        return interPerso.getPersonaList();
    }
    
    @GetMapping("portfolio/persona/{id}")
    public Persona findPersona(@PathVariable Long id){
        
        return interPerso.findPersona(id);
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("portfolio/persona/crear")
    public String savePersona(@RequestBody Persona perso){
        
        interPerso.savePersona(perso);
        return "Se guardo una nueva persona";
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("portfolio/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
            @RequestParam String nombre,
            @RequestParam String titulo,
            @RequestParam String profile_photo,
            @RequestParam String background_name_and_tittle,
            @RequestParam String descripcion){
    Persona perso = interPerso.findPersona(id);
    perso.setNombre(nombre);
    perso.setTitulo(titulo);
    perso.setProfile_photo(profile_photo);
    perso.setBackground_name_and_tittle(background_name_and_tittle);
    perso.setDescripcion(descripcion);
    
    interPerso.savePersona(perso);
    return perso;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("portfolio/persona/acerca/editar/{id}")
    public Persona editPersonaAcerca(@PathVariable Long id,
            @RequestParam String descripcion){
    Persona perso = interPerso.findPersona(id);
    perso.setDescripcion(descripcion);
    
    interPerso.savePersona(perso);
    return perso;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("portfolio/persona/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        
        interPerso.deletePersona(id);
        return "Se borro una persona";
        
    }
    
    @GetMapping("portfolio/educacion")
    public List<Educacion> getEducacionList(){
        
        return interEduca.getEducacionList();
        
    }
    
    @GetMapping("portfolio/educacion/{id}")
    public Educacion findEducacion(@PathVariable Long id){
        
        return interEduca.findEducacion(id);
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("portfolio/educacion/crear")
    public String saveEducacion(@RequestBody Educacion educa){
     
        interEduca.saveEducacion(educa);
        return "Se guardo una nueva educacion";
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("portfolio/educacion/editar/{id}")
    public Educacion editEducacion(@PathVariable Long id,
            @RequestParam String escuela,
            @RequestParam String fecha_fin,
            @RequestParam String descripcion){
        Educacion educa = interEduca.findEducacion(id);
        educa.setEscuela(escuela);
        educa.setFecha_fin(fecha_fin);
        educa.setDescripcion(descripcion);
        
        interEduca.saveEducacion(educa);
        return educa;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("portfolio/educacion/borrar/{id}")
    public String deleteEducacion(@PathVariable Long id){
        
        interEduca.deleteEducacion(id);
        return "Se borro una educacion";
        
    }
    
    @GetMapping("portfolio/experiencia")
    public List<Experiencia> getExperienciaList(){
        
        return interExper.getExperienciaList();
        
    }
    
    @GetMapping("portfolio/experiencia/{id}")
    public Experiencia findExperiencia(@PathVariable Long id){
        
        return interExper.findExperiencia(id);
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("portfolio/experiencia/crear")
    public String saveExperiencia(@RequestBody Experiencia exper){
     
        interExper.saveExperiencia(exper);
        return "Se guardo una nueva experiencia";
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("portfolio/experiencia/editar/{id}")
    public Experiencia editExperiencia(@PathVariable Long id,
            @RequestParam String nombre,
            @RequestParam String fecha_fin,
            @RequestParam String descripcion){
        Experiencia exper = interExper.findExperiencia(id);
        exper.setNombre(nombre);
        exper.setFecha_fin(fecha_fin);
        exper.setDescripcion(descripcion);
        
        interExper.saveExperiencia(exper);
        return exper;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("portfolio/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        
        interExper.deleteExperiencia(id);
        return "Se borro una experiencia";
        
    }
    
    @GetMapping("portfolio/habilidades_blandas")
    public List<Habilidades_blandas> getHabilidades_BList(){
        
        return interHab_B.getHabilidades_BList();
        
    }
    
    @GetMapping("portfolio/habilidades_blandas/{id}")
    public Habilidades_blandas findHabilidades_B(@PathVariable Long id){
        
        return interHab_B.findHabilidades_B(id);
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("portfolio/habilidades_blandas/crear")
    public String saveHabilidades_B(@RequestBody Habilidades_blandas hab_b){
        
        interHab_B.saveHabilidades_B(hab_b);
        return "Se guardo una nueva habilidad blanda";
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("portfolio/habilidades_blandas/editar/{id}")
    public Habilidades_blandas editHabilidades_B(@PathVariable Long id,
            @RequestParam String nombre,
            @RequestParam String nivel,
            @RequestParam String stat_bar){
        
        Habilidades_blandas hab_b = interHab_B.findHabilidades_B(id);
        hab_b.setNombre(nombre);
        hab_b.setNivel(nivel);
        hab_b.setStat_bar(stat_bar);
        interHab_B.saveHabilidades_B(hab_b);
        return hab_b;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("portfolio/habilidades_blandas/borrar/{id}")
    public String deleteHabilidades_B(@PathVariable Long id){
        
        interHab_B.deleteHabilidades_B(id);
        return "Se borro una habilidad blanda";
        
    }
    
    @GetMapping("portfolio/habilidades_duras")
    public List<Habilidades_duras> getHabilidades_DList(){
        
        return interHab_D.getHabilidades_DList();
        
    }
    
    @GetMapping("portfolio/habilidades_duras/{id}")
    public Habilidades_duras findHabilidades_D(@PathVariable Long id){
        
        return interHab_D.findHabilidades_D(id);
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("portfolio/habilidades_duras/crear")
    public String saveHabilidades_D(@RequestBody Habilidades_duras hab_d){
        
        interHab_D.saveHabilidades_D(hab_d);
        return "Se guardo una nueva habilidad dura";
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("portfolio/habilidades_duras/editar/{id}")
    public Habilidades_duras editHabilidades_D(@PathVariable Long id,
            @RequestParam String nombre,
            @RequestParam String nivel,
            @RequestParam String stat_bar){
        
        Habilidades_duras hab_d = interHab_D.findHabilidades_D(id);
        hab_d.setNombre(nombre);
        hab_d.setNivel(nivel);
        hab_d.setStat_bar(stat_bar);
        interHab_D.saveHabilidades_D(hab_d);
        return hab_d;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("portfolio/habilidades_duras/borrar/{id}")
    public String deleteHabilidades_D(@PathVariable Long id){
        
        interHab_D.deleteHabilidades_D(id);
        return "Se borro una habilidad dura";
        
    }
    
    @GetMapping("portfolio/proyectos")
    public List<Proyectos> getProyectosList(){
        
        return interProye.getProyectosList();
        
    }
    
    @GetMapping("portfolio/proyectos/{id}")
    public Proyectos findProyectos(@PathVariable Long id){
        
        return interProye.findProyecto(id);
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("portfolio/proyectos/crear")
    public String crearProyectos(@RequestBody Proyectos proye){
        
        interProye.saveProyecto(proye);
        return "Se guardo un nuevo proyecto";
        
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("portfolio/proyectos/editar/{id}")
    public Proyectos editarProyectos(@PathVariable Long id,
            @RequestParam String nombre,
            @RequestParam String descripcion,
            @RequestParam String tecnologiasUsadas,
            @RequestParam String caracteristicasNotables){
        Proyectos proye = interProye.findProyecto(id);
        proye.setNombre(nombre);
        proye.setDescripcion(descripcion);
        proye.setTecnologiasUsadas(tecnologiasUsadas);
        proye.setCaracteristicasNotables(caracteristicasNotables);
        interProye.saveProyecto(proye);
        return proye;
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("portfolio/proyectos/borrar/{id}")
    public String deleteProyectos(@PathVariable Long id){
        
        interProye.deleteProyecto(id);
        return "Se borro un proyecto";
        
    }
    
    @GetMapping("portfolio/data")
    @ResponseBody
    public DataDTO getDataDTO(){
        
        DataDTO data = new DataDTO();
        data.setPersona(interPerso.getPersonaList());
        data.setEducacion(interEduca.getEducacionList());
        data.setExperiencia(interExper.getExperienciaList());
        data.setHabilidades_duras(interHab_D.getHabilidades_DList());
        data.setHabilidades_blandas(interHab_B.getHabilidades_BList());
        data.setProyectos(interProye.getProyectosList());
        return data;
        
    }
}

