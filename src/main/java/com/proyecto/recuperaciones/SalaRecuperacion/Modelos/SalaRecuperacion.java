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
    @Column(name="id_sala")
    private long id;


    @Column(name="camas")
    private int camas;

    @Column(name="disponibles")
    private int disponibles;

    /*@Column(name="especialidad")
    private String especialidad;*/

    public SalaRecuperacion(){

    }

    public SalaRecuperacion(long id, int camas/*, String especialidad*/) {
        this.id = id;
        this.camas = camas;
        /*this.especialidad = especialidad;*/
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

    /*public String getEsp(){
        return this.especialidad;
    }

    public void setEsp(String especialidad){
        this.especialidad = especialidad;
    }*/
}