package com.proyecto.recuperaciones.CamaRecuperacion.Controladores;

import java.util.List;

import com.proyecto.recuperaciones.CamaRecuperacion.Modelos.CamaRecuperacion;
import com.proyecto.recuperaciones.CamaRecuperacion.Servicio.CamaRecuperacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class CamaRecuperacionController{
    @Autowired
    CamaRecuperacionService servicio;

    @GetMapping("/CamaRecup/Disponibles")
    public List<CamaRecuperacion> camasDisponibles(){
        return servicio.obtenerDisponibles();
    }

    @GetMapping("/CamaRecup")
    public List<CamaRecuperacion> camasporSala(@RequestParam(name = "sala") long idSala, @RequestParam(name = "disponible") boolean disponible){
        return servicio.obtenerCamas(idSala, disponible);
    }

    @PutMapping("/CamaRecup/{id}")
    public boolean actualizarCama(@PathVariable("id") long idCama, @RequestBody CamaRecuperacion cama){
        return servicio.actualizar(cama);
    }
}