package com.elendemo.locaciones.domain.repository;

import com.elendemo.locaciones.domain.Locality;

import java.util.List;
import java.util.Optional;

public interface LocalityRepository {
    List<Locality> getAll();
    Optional<Locality> getLocality(int localityId);
    Optional<List<Locality>> getByProvince(int provinceId);
    Locality save (Locality locality);
    void delete (int localityId);
}
