package com.ciclo3.reto.retog5.controlador;

import com.ciclo3.reto.retog5.entidad.Ortopedic;
import com.ciclo3.reto.retog5.servicio.OrtopedicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/Ortopedic/")

public class ApiOrtopedic {
    @Autowired
    private OrtopedicService service;

    @GetMapping( "/all")
    public List<Ortopedic> findAllOrtopedics(){
        return service.getOrtopedics();
    }

    @PostMapping("/save")
    public ResponseEntity saveOrtopedic(@RequestBody Ortopedic ortopedic){
        service.saveOrtopedic(ortopedic);
        return  ResponseEntity.status(201).build();
    }

}
