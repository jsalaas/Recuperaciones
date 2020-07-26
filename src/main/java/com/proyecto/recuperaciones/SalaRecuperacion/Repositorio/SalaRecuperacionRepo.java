package com.proyecto.recuperaciones.SalaRecuperacion.Repositorio;

import java.io.Serializable;
import java.util.Optional;
import java.util.List;

import com.proyecto.recuperaciones.SalaRecuperacion.Modelos.SalaRecuperacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRecuperacionRepo extends JpaRepository<SalaRecuperacion, Serializable>{
    public abstract List<SalaRecuperacion> findAll();
    public abstract List<SalaRecuperacion> findByDisponiblesGreaterThan(long disponibles);
}