package com.elendemo.locaciones.domain.repository;

import com.elendemo.locaciones.domain.Province;

import java.util.List;
import java.util.Optional;

public interface ProvinceRepository {
    List<Province> getAll();
    Optional <Province> getProvince (int provinceId);
    Province save(Province province);
    void delete (int provinceId);
}
