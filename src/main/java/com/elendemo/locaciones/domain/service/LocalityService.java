package com.elendemo.locaciones.domain.service;

import com.elendemo.locaciones.domain.Locality;
import com.elendemo.locaciones.domain.repository.LocalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocalityService {
    @Autowired
    private LocalityRepository localityRepository;

    public List<Locality> getAll(){
        return localityRepository.getAll();
    }

    public Optional<Locality> getLocality(int localityId){
        return localityRepository.getLocality(localityId);
    }

    public Optional<List<Locality>> getByProvince(int provinceId){
        return localityRepository.getByProvince(provinceId);
    }

    public Locality save (Locality locality){
        return localityRepository.save(locality);
    }

    public boolean delete (int localityId){
        return getLocality(localityId).map(locality -> {
            localityRepository.delete(localityId);
            return true;
        }).orElse(false);
    }
}
