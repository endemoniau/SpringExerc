package com.elendemo.locaciones.persistence.crud;

import com.elendemo.locaciones.persistence.entity.Provincia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProvinciaCrudRepository extends CrudRepository<Provincia,Integer> {

}
