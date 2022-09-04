package com.elendemo.locaciones.web.controller;

import com.elendemo.locaciones.domain.Event;
import com.elendemo.locaciones.domain.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @GetMapping ("/all")
    public List<Event> getAll(){
        return eventService.getAll();
    }

    @GetMapping ("/{eventId}")
    public Optional<Event> getEvent(@PathVariable("eventId") int eventId){
        return eventService.getEvent(eventId);
    }

    @PostMapping("/save")
    public Event save (@RequestBody Event event){
        return eventService.save(event);
    }

    @DeleteMapping("/delete/{eventId}")
    public boolean delete (@PathVariable("eventId") int eventId){
        return eventService.delete(eventId);
    }
}
