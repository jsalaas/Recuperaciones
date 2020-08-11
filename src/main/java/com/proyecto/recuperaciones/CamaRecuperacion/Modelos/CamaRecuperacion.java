package com.proyecto.recuperaciones.CamaRecuperacion.Modelos;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table(name="camarecuperacion")
public class CamaRecuperacion{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cama")
    private long id;

    @Column(name="id_sala")
    private long idSala;

    @Column(name="disponible", columnDefinition = "boolean default true")
    private boolean disponible = true;

    @Column(name="id_paciente")
    private Integer idPaciente;

    @Column(name="id_perMedico")
    private Integer idPerMedico;

    @Column(name="fechauso")
    private Date fecha;

    public CamaRecuperacion(){

    }

    public CamaRecuperacion(long id, long idSala, boolean disponible, Integer idPaciente, Integer idPerMedico, Date fecha) {
        this.id = id;
        this.idSala = idSala;
        this.disponible = disponible;
        this.idPaciente = idPaciente;
        this,idPerMedico = idPerMedico;
        this.fecha = fecha;
    }

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id = id;
    }

    public long getIdSala(){
        return idSala;
    }

    public void setIdSala(long idSala){
        this.idSala = idSala;
    }

    public boolean getDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible= disponible;
    }

    public Integer getIdPaciente(){
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente){
        this.idPaciente = idPaciente;
    }

    public void getIdPerMedico(){
        return idPerMedico;
    }

    public void setIdPerMedico(Integer idPerMedico){
        this.idPerMedico = idPerMedico
    }

    public Date getFechaUso(){
        return fecha;
    }

    public void setFechaUso(Date fecha){
        this.fecha = fecha;
    }
}