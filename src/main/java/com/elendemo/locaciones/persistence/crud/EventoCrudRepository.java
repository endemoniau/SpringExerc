package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.persistence.entity.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoCrudRepository extends CrudRepository<Evento,Integer> {

}
