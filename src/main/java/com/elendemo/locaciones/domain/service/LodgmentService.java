package com.elendemo.locaciones.domain.service;

import com.elendemo.locaciones.domain.Lodgment;
import com.elendemo.locaciones.domain.repository.LodgmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LodgmentService {
    @Autowired
    private LodgmentRepository lodgmentRepository;

    public List<Lodgment> getAll(){
        return lodgmentRepository.getAll();
    }

    public Optional<Lodgment> getLodgment (int lodgmentId){
        return lodgmentRepository.getLodgment(lodgmentId);
    }

    public Optional<List<Lodgment>> getAllSocialNetworks(){
            return lodgmentRepository.getAllSocialNetworks();
    }

    public Optional<List<Lodgment>> getAllEmails(){
        return lodgmentRepository.getAllEmails();
    }

    public Lodgment save(Lodgment lodgment){
        return lodgmentRepository.save(lodgment);
    }

    public boolean delete (int lodgmentId){
        return getLodgment(lodgmentId).map(lodgment -> {
            lodgmentRepository.delete(lodgmentId);
            return true;
        }).orElse(false);
    }
}
