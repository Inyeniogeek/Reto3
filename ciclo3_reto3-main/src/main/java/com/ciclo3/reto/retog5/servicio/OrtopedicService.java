package com.ciclo3.reto.retog5.servicio;

import com.ciclo3.reto.retog5.entidad.Ortopedic;
import com.ciclo3.reto.retog5.repositorio.OrtopedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class OrtopedicService {
    @Autowired
    private OrtopedicRepository repository;

    /** Peticion GET Mostrar datos
     */
    public List<Ortopedic> getOrtopedics(){
        return repository.findAll();
    }

    /** Peticion POST Guardar datos
     */
    public Ortopedic saveOrtopedic(Ortopedic ortopedic){
        return repository.save(ortopedic);
    }

}
