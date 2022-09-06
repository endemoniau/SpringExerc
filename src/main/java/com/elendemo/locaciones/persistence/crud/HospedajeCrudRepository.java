package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.persistence.entity.Hospedaje;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface HospedajeCrudRepository extends CrudRepository <Hospedaje,Integer> {
     Optional<List<Hospedaje>> findByRedSocialIsNotNull();

     Optional<List<Hospedaje>> findByCorreoIsNotNull();
}
