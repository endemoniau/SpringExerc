package com.elendemo.locaciones.persistence;

import com.elendemo.locaciones.domain.Province;
import com.elendemo.locaciones.domain.repository.ProvinceRepository;
import com.elendemo.locaciones.persistence.crud.ProvinciaCrudRepository;
import com.elendemo.locaciones.persistence.entity.Provincia;
import com.elendemo.locaciones.persistence.mapper.ProvinceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProvinciaRepository implements ProvinceRepository {
    @Autowired
    private ProvinciaCrudRepository provinciaCrudRepository;
    @Autowired
    private ProvinceMapper mapper;

    @Override
    public List<Province> getAll(){
        List <Provincia> provincias= (List<Provincia>) provinciaCrudRepository.findAll();
        return mapper.toProvinces (provincias);
    }

    @Override
    public Optional<Province> getProvince(int provinceId) {
        return provinciaCrudRepository.findById(provinceId).map(provincia -> mapper.toProvince(provincia));
    }

    @Override
    public Province save(Province province) {
        Provincia provincia= mapper.toProvincia(province);
        return mapper.toProvince(provinciaCrudRepository.save(provincia));
    }
/*
    public Optional<Provincia> getById(int idProvincia){
        return provinciaCrudRepository.findById(idProvincia);
    }

    public Provincia save(Provincia provincia){
        return provinciaCrudRepository.save(provincia);
    }*/

    @Override
    public void delete (int provinceId)    {
        provinciaCrudRepository.deleteById(provinceId);
    }
}
