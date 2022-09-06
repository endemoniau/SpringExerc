package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.persistence.entity.Localidad;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface LocalidadCrudRepository extends CrudRepository<Localidad,Integer> {
    List<Localidad> findByIdProvincia(int idProvincia);

}
