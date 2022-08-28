package com.elendemo.locaciones.web.controller;

import com.elendemo.locaciones.domain.Province;
import com.elendemo.locaciones.domain.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/provinces")
public class ProvinceController {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/all")
    public List<Province> getAll(){
        return provinceService.getAll();
    }

    @GetMapping("/{provinceId}")
    public Optional<Province> getProvince (@PathVariable("provinceId") int provinceId){
        return provinceService.getProvince(provinceId);
    }

    @PostMapping("/save")
    public Province save(@RequestBody Province province) {
        return provinceService.save(province);
    }

    @DeleteMapping("/delete/{provinceId}")
    public boolean delete (@PathVariable("provinceId") int provinceId){
        return provinceService.delete(provinceId);
    }
}
