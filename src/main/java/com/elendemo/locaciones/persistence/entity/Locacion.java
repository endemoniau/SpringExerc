package com.elendemo.locaciones.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="locaciones")

public class Locacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idLocacion;

    private String coordenada;

    private String locacion;

    @ManyToOne
    @JoinColumn(name="id_evento",updatable = false,insertable = false)
    private Evento evento;

    @ManyToOne
    @JoinColumn(name="id_hospedaje",updatable = false,insertable = false)
    private Hospedaje hospedaje;

    @ManyToOne
    @JoinColumn(name="id_localidad",updatable = false,insertable = false)
    private Localidad localidad;

    public Integer getIdLocacion() {
        return idLocacion;
    }

    public void setIdLocacion(Integer idLocacion) {
        this.idLocacion = idLocacion;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }
}
