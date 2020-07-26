package com.proyecto.recuperaciones.Equipamiento.Modelos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="equipamiento")
public class Equipamiento{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_equipo")
    private long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="id_sala")
    private long idSala;

    public Equipamiento(){

    }

    public Equipamiento(long id, String nombre, long idSala) {
        this.id = id;
        this.nombre = nombre;
        this.idSala = idSala;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdSala() {
        return idSala;
    }

    public void setIdSala(long idSala) {
        this.idSala = idSala;
    }

    

}