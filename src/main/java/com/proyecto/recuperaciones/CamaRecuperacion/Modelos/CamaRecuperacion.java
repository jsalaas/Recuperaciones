package com.proyecto.recuperaciones.CamaRecuperacion.Modelos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CamaRecuperacion")
public class CamaRecuperacion{
    @Id
    @Column(name="id_cama")
    private long id;


    @Column(name="id_sala")
    private long idSala;

    @Column(name="disponible")
    private boolean disponible;

    @Column(name="id_paciente")
    private long idPaciente;

    @Column(name="fechauso")
    private Date fecha;

    public CamaRecuperacion(){

    }

    public CamaRecuperacion(long id, long idSala, boolean disponible, long idPaciente, Date fecha) {
        this.id = id;
        this.idSala = idSala;
        this.disponible = disponible;
        this.idPaciente = idPaciente;
        this.fecha = fecha;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getIdSala(){
        return this.idSala;
    }

    public void setIdSala(long idSala){
        this.idSala = idSala;
    }

    public boolean getDisp(){
        return this.disponible;
    }

    public void setDisp(boolean disponible){
        this.disponible= disponible;
    }

    public long getIdPaciente(){
        return this.idPaciente;
    }

    public void setIdPaciente(long idPaciente){
        this.idPaciente = idPaciente;
    }

    public Date getFechaUso(){
        return this.fecha;
    }

    public void setFechaUso(Date fecha){
        this.fecha = fecha;
    }
}