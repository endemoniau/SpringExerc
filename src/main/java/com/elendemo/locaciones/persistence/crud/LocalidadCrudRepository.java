package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.persistence.entity.Localidad;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface LocalidadCrudRepository extends CrudRepository<Localidad,Integer> {
    Optional<List<Localidad>> findByIdProvincia(int idProvincia);

}