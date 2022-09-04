package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.domain.Event;
import com.elendemo.locaciones.persistence.entity.Evento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface EventoCrudRepository extends CrudRepository<Evento,Integer> {

}
