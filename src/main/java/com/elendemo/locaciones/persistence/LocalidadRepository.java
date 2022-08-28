package com.elendemo.locaciones.persistence;

import com.elendemo.locaciones.domain.Locality;
import com.elendemo.locaciones.domain.repository.LocalityRepository;
import com.elendemo.locaciones.persistence.crud.LocalidadCrudRepository;
import com.elendemo.locaciones.persistence.entity.Localidad;
import com.elendemo.locaciones.persistence.entity.Provincia;
import com.elendemo.locaciones.persistence.mapper.LocalityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LocalidadRepository implements LocalityRepository {
    @Autowired
    private LocalidadCrudRepository localidadCrudRepository;

    @Autowired
    private LocalityMapper mapper;
    public List<Locality> getAll(){
        List <Localidad> localidades= (List<Localidad>) localidadCrudRepository.findAll();
        return mapper.toLocalities (localidades);
    }

    @Override
    public Optional<Locality> getLocality(int localityId) {
        return localidadCrudRepository.findById(localityId).map(localidad -> mapper.toLocality(localidad));
    }

    @Override
    public Optional<List<Locality>> getByProvince(int provinceId) {
        List <Localidad> localidades= (List<Localidad>) localidadCrudRepository.findByIdProvincia(provinceId);
        return Optional.of(mapper.toLocalities(localidades));
    }

    @Override
    public Locality save(Locality locality) {
        Localidad localidad= mapper.toLocalidad(locality);
        return mapper.toLocality(localidadCrudRepository.save(localidad));
    }
/*
    public Optional<Localidad> getLocalidad(int idLocalidad){
        return localidadCrudRepository.findById(idLocalidad);
    }

    public List<Localidad> getLocalidadesByProvincia(int idProvincia){
        return localidadCrudRepository.findByIdProvincia(idProvincia);
    }

    public Localidad save (Localidad localidad){
        return localidadCrudRepository.save(localidad);
    }*/

    public void delete (int localityId){
        localidadCrudRepository.deleteById(localityId);
    }
}
