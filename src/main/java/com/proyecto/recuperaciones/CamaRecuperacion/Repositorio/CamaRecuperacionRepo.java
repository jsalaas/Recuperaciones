package com.proyecto.recuperaciones.CamaRecuperacion.Repositorio;

import java.io.Serializable;
import java.util.Optional;
import java.util.List;

import com.proyecto.recuperaciones.CamaRecuperacion.Modelos.CamaRecuperacion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamaRecuperacionRepo extends JpaRepository<CamaRecuperacion, Serializable>{
    public abstract List<CamaRecuperacion> findByDisponibleTrue();
    public abstract List<CamaRecuperacion> findByIdSalaAndDisponible(long idsala, boolean disponible);
}