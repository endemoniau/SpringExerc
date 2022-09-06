package com.elendemo.locaciones.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="localidades")

public class Localidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer idLocalidad;

    private String localidad;

    @Column(name="id_provincia")
    private Integer idProvincia;

    @ManyToOne
    @JoinColumn(name="id_provincia", insertable = false, updatable = false)
    private Provincia provincia;

/*    @OneToMany(mappedBy = "localidad")
    private List<Locacion> locaciones;*/

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

    public Integer getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(Integer idProvincia) {
        this.idProvincia = idProvincia;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

}
