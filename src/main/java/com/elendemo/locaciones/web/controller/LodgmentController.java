package com.elendemo.locaciones.web.controller;

import com.elendemo.locaciones.domain.Lodgment;
import com.elendemo.locaciones.domain.service.LodgmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lodgments")
public class LodgmentController {
    @Autowired
    private LodgmentService lodgmentService;

    @GetMapping("/all")
    public List<Lodgment> getAll(){
        return lodgmentService.getAll();
    }

    @GetMapping("/{lodgmentId}")
    public Optional<Lodgment> getLodgment (@PathVariable("lodgmentId") int lodgmentId){
        return lodgmentService.getLodgment(lodgmentId);
    }

    @GetMapping("/networks")
    public Optional<List<Lodgment>> getAllSocialNetworks(){
        return lodgmentService.getAllSocialNetworks();
    }

    @GetMapping("/emails")
    public Optional<List<Lodgment>> getAllEmails(){
        return lodgmentService.getAllEmails();
    }

    @PostMapping("/save")
    public Lodgment save(@RequestBody Lodgment lodgment){
        return lodgmentService.save(lodgment);
    }

    @DeleteMapping("/delete/{lodgmentId}")
    public boolean delete (@PathVariable("lodgmentId") int lodgmentId){
        return lodgmentService.delete(lodgmentId);
    }
}
