package com.proyecto.recuperaciones.SalaRecuperacion.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salarecuperacion")
public class SalaRecuperacion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_sala")
    private long id;

    @Column(name="camas")
    private int camas;

    @Column(name="disponibles")
    private int disponibles;

    public SalaRecuperacion(){

    }

    public SalaRecuperacion(long id, int camas) {
        this.id = id;
        this.camas = camas;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id=id;
    }

    public int getCamas(){
        return this.camas;
    }

    public void setCamas(int camas){
        this.camas = camas;
    }

    public int getDisponibles(){
        return this.disponibles;
    }

    public void setDisponibles(int disponibles){
        this.disponibles = disponibles;
    }
}