
package com.todocode.clinicaVeterinaria.controller;

import com.todocode.clinicaVeterinaria.dto.MascoDuenioDTO;
import com.todocode.clinicaVeterinaria.model.Mascota;
import com.todocode.clinicaVeterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServ;

    @GetMapping("/mascotas/traer")
    public List<Mascota> traerMascotas() {
        return mascoServ.getMascotas();
    }

    @PostMapping("/mascotas/crear")
    public String savePersona(@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);

        return "La mascota fue creada correctamente";
    }

    @DeleteMapping("/mascotas/borrar/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota) {
        mascoServ.deleteMascota(id_mascota);
        return "La mascota fue borrada correctamente";
    }
    
    @PutMapping("/mascotas/editar/{id}")
    public String editMascota(@PathVariable Long id,
                              @RequestParam Mascota masco) {
        mascoServ.editMascota(masco);
    
       
        return "La mascota fue editada correctamente";
        
        // @PutMapping("/curso/edit")
          //public String editCurso(@RequestBody Curso curso) {
          //cursoServ.editCurso(curso);
        //return "Curso editado correctamente";
        
    }
    
    @GetMapping("/mascotas/traer-caniches")
    public List<Mascota> traerCaniches() {
        return mascoServ.getCaniches();
    }
    
    @GetMapping ("mascotas/traer-duenios")
    public List<MascoDuenioDTO> traerMascoDuenios () {
        
        return mascoServ.getMascoDuenios();
    
    }

}
