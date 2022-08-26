package com.elendemo.locaciones.persistence;

import com.elendemo.locaciones.persistence.crud.LocalidadCrudRepository;
import com.elendemo.locaciones.persistence.entity.Localidad;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocalidadRepository {
    private LocalidadCrudRepository localidadCrudRepository;

    public List<Localidad> getAll(){
        return (List<Localidad>) localidadCrudRepository.findAll();
    }

    public Optional<Localidad> getById(int idLocalidad){
        return localidadCrudRepository.findById(idLocalidad);
    }

    public Optional<List<Localidad>> getLocalidadesByProvincia(int idProvincia){
        return localidadCrudRepository.findByIdProvincia(idProvincia);
    }

    public Localidad save (Localidad localidad){
        return localidadCrudRepository.save(localidad);
    }

    public void delete (int idLocalidad){
        localidadCrudRepository.deleteById(idLocalidad);
    }
}
