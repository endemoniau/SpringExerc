package com.elendemo.locaciones.domain.service;

import com.elendemo.locaciones.domain.Province;
import com.elendemo.locaciones.domain.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService {
    @Autowired
    private ProvinceRepository provinceRepository;

    public List<Province> getAll(){
        return provinceRepository.getAll();
    }

    public Optional<Province> getProvince (int provinceId){
        return provinceRepository.getProvince(provinceId);
    }

    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    public boolean delete(int provinceId){
        return getProvince(provinceId).map(province -> {
            provinceRepository.delete(provinceId);
            return true;
        }).orElse(false);
    }
}
