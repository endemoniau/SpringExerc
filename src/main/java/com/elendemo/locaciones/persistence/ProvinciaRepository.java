package com.elendemo.locaciones.persistence;

import com.elendemo.locaciones.persistence.crud.ProvinciaCrudRepository;
import com.elendemo.locaciones.persistence.entity.Provincia;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProvinciaRepository {
    private ProvinciaCrudRepository provinciaCrudRepository;

    public List<Provincia> getAll(){
        return (List<Provincia>) provinciaCrudRepository.findAll();
    }

    public Optional<Provincia> getById(int idProvincia){
        return provinciaCrudRepository.findById(idProvincia);
    }

    public Provincia save(Provincia provincia){
        return provinciaCrudRepository.save(provincia);
    }

    public void delete (int idProvincia)    {
        provinciaCrudRepository.deleteById(idProvincia);
    }
}
