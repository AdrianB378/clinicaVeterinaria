
package com.todocode.clinicaVeterinaria.service;

import com.todocode.clinicaVeterinaria.model.Duenio;
import java.util.List;

public interface IDuenioService {
    //método para traer a todas las personas
    //lectura
    public List<Duenio> getDuenios();

    //alta
    public void saveDuenio(Duenio duenio);

    //baja
    public void deleteDuenio(Long id_duenio);

    //lectura de un solo objeto
    public Duenio findDuenio(Long id_duenio);

    //edición/modificación
    public void editDuenio (Duenio duenio);

   

   
}
 

