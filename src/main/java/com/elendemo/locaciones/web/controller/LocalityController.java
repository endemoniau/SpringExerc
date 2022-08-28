package com.elendemo.locaciones.web.controller;

import com.elendemo.locaciones.domain.Locality;
import com.elendemo.locaciones.domain.service.LocalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/localities")
public class LocalityController {
    @Autowired
    LocalityService localityService;

    @GetMapping("/all")
    public List<Locality> getAll(){
        return localityService.getAll();
    }

    @GetMapping("/{localityId}")
    public Optional<Locality> getLocality(@PathVariable("localityId") int localityId){
        return localityService.getLocality(localityId);
    }

    @GetMapping("/byprovince/{provinceId}")
    public Optional<List<Locality>> getByProvince(@PathVariable("provinceId") int provinceId){
        return localityService.getByProvince(provinceId);
    }

    @PostMapping("/save")
    public Locality save (@RequestBody Locality locality){
        return localityService.save(locality);
    }

    @DeleteMapping("/delete/{localityId}")
    public boolean delete (@PathVariable("provinceId") int localityId){
        return localityService.delete(localityId);
    }

}
