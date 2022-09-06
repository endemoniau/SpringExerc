package com.elendemo.locaciones.persistence;

import com.elendemo.locaciones.domain.Lodgment;
import com.elendemo.locaciones.domain.repository.LodgmentRepository;
import com.elendemo.locaciones.persistence.crud.HospedajeCrudRepository;
import com.elendemo.locaciones.persistence.entity.Hospedaje;
import com.elendemo.locaciones.persistence.mapper.LodgmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class HospedajeRepository implements LodgmentRepository {
    @Autowired
    private HospedajeCrudRepository hospedajeCrudRepository;
    @Autowired
    private LodgmentMapper lodgmentMapper;

    @Override
    public List<Lodgment> getAll(){
        List<Hospedaje> hospedajes=(List<Hospedaje>) hospedajeCrudRepository.findAll();
        return lodgmentMapper.toLodgments(hospedajes);
    }

    @Override
    public Optional<Lodgment> getLodgment(int lodgmentId) {
        return hospedajeCrudRepository.findById(lodgmentId).map(hospedaje -> lodgmentMapper.toLodgment(hospedaje));
    }



    public Optional<List<Lodgment>> getAllSocialNetworks(){
        return hospedajeCrudRepository.findByRedSocialIsNotNull().map(hospedaje -> lodgmentMapper.toLodgments(hospedaje));
    }

    public Optional<List<Lodgment>> getAllEmails(){
        return hospedajeCrudRepository.findByCorreoIsNotNull().map(hospedaje -> lodgmentMapper.toLodgments(hospedaje));
    }

    @Override
    public Lodgment save(Lodgment lodgment) {
        Hospedaje hospedaje= lodgmentMapper.toHospedaje(lodgment);
        return lodgmentMapper.toLodgment(hospedajeCrudRepository.save(hospedaje));
    }

    @Override
    public void delete (int logdmentId){
        hospedajeCrudRepository.deleteById(logdmentId);
    }
}
