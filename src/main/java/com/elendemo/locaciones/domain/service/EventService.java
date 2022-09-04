package com.elendemo.locaciones.domain.service;

import com.elendemo.locaciones.domain.Event;
import com.elendemo.locaciones.domain.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAll(){
        return eventRepository.getAll();
    }

    public Optional<Event> getEvent(int eventId){
        return eventRepository.getEvent(eventId);
    }

    public Event save(Event event){
        return eventRepository.save(event);
    }

    public boolean delete (int eventId){
        return getEvent(eventId).map(event ->{
            eventRepository.delete(eventId);
            return true;
        }).orElse( false);
    }
}
