package com.elendemo.locaciones.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="localidades")

public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idLocalidad;

    private String localidad;

    @ManyToOne
    @JoinColumn(name="id_provincia", insertable = false, updatable = false)
    private Provincia provincia;

    @OneToMany(mappedBy = "localidad")
    private List<Locacion> locaciones;

    public Integer getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Provincia getIdProvincia() {
        return provincia;
    }

    public void setIdProvincia(Provincia idProvincia) {
        this.provincia = idProvincia;
    }

    public List<Locacion> getLocaciones() {
        return locaciones;
    }

    public void setLocaciones(List<Locacion> locaciones) {
        this.locaciones = locaciones;
    }
}
