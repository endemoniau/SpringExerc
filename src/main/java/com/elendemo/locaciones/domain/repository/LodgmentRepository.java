package com.elendemo.locaciones.domain.repository;

import com.elendemo.locaciones.domain.Lodgment;

import java.util.List;
import java.util.Optional;

public interface LodgmentRepository {
    List<Lodgment> getAll();
    Optional<Lodgment> getLodgment (int lodgmentId);
    Optional<List<Lodgment>> getAllSocialNetworks();
    Optional<List<Lodgment>> getAllEmails();
    Lodgment save(Lodgment lodgment);
    void delete (int lodgmentId);
}
