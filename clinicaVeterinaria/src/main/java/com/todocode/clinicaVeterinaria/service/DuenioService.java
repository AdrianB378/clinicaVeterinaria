
package com.todocode.clinicaVeterinaria.service;

import com.todocode.clinicaVeterinaria.model.Duenio;
import com.todocode.clinicaVeterinaria.repository.IDuenioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DuenioService implements IDuenioService {
    
    @Autowired
    private IDuenioRepository repoDuenio;

    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> listaDuenios = repoDuenio.findAll();
        return listaDuenios;
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        repoDuenio.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id_duenio) {
        repoDuenio.deleteById(id_duenio);
    }

    @Override
    public Duenio findDuenio(Long id_duenio) {
        return repoDuenio.findById(id_duenio).orElse(null);
    }

    @Override
    public void editDuenio(Duenio duenio) {
         this.saveDuenio(duenio);
    }

   

   

   

   
    
    
    
}
 

