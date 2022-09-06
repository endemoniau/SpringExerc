package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.persistence.entity.Provincia;
import org.springframework.data.repository.CrudRepository;

public interface ProvinciaCrudRepository extends CrudRepository<Provincia,Integer> {

}
