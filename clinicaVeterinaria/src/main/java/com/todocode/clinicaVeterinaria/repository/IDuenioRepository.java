
package com.todocode.clinicaVeterinaria.repository;

import com.todocode.clinicaVeterinaria.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository <Duenio, Long>{

   
    
}
