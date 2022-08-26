package com.elendemo.locaciones.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="hospedajes")

public class Hospedaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idHospedaje;

    private String telefono;

    private String correo;

    private String coordenada;

    private String hospedaje;

    private String redSocial;

    @OneToMany(mappedBy = "hospedaje")
    private List<Locacion> locaciones;

    public List<Locacion> getLocaciones() {
        return locaciones;
    }

    public void setLocaciones(List<Locacion> locaciones) {
        this.locaciones = locaciones;
    }

    public Integer getIdHospedaje() {
        return idHospedaje;
    }

    public void setIdHospedaje(Integer idHospedaje) {
        this.idHospedaje = idHospedaje;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCoordenada() {
        return coordenada;
    }

    public void setCoordenada(String coordenada) {
        this.coordenada = coordenada;
    }

    public String getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(String hospedaje) {
        this.hospedaje = hospedaje;
    }

    public String getRedSocial() {
        return redSocial;
    }

    public void setRedSocial(String redSocial) {
        this.redSocial = redSocial;
    }
}
