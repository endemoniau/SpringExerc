package com.elendemo.locaciones.persistence.entity;

import jdk.jfr.Event;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idEvento;

    private LocalDateTime fecha;

    private String evento;

    @OneToMany(mappedBy = "evento")
    private List<Locacion> locaciones;

    public List<Locacion> getLocaciones() {
        return locaciones;
    }

    public void setLocaciones(List<Locacion> locaciones) {
        this.locaciones = locaciones;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
