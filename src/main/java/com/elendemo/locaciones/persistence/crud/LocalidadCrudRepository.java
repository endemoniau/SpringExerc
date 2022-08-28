package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.persistence.entity.Localidad;
import com.elendemo.locaciones.persistence.entity.Provincia;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface LocalidadCrudRepository extends CrudRepository<Localidad,Integer> {
    List<Localidad> findByIdProvincia(int idProvincia);

}
