package com.elendemo.locaciones.persistence;

import com.elendemo.locaciones.domain.Event;
import com.elendemo.locaciones.domain.repository.EventRepository;
import com.elendemo.locaciones.persistence.crud.EventoCrudRepository;
import com.elendemo.locaciones.persistence.entity.Evento;
import com.elendemo.locaciones.persistence.mapper.EventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EventoRepository implements EventRepository {
    @Autowired
    private EventoCrudRepository eventoCrudRepository;
    @Autowired
    private EventMapper eventMapper;

    @Override
    public List<Event> getAll(){
        List<Evento> eventos= (List<Evento>) eventoCrudRepository.findAll();
        return eventMapper.toEvents(eventos);
    }

    @Override
    public Optional<Event> getEvent(int eventId) {
        return eventoCrudRepository.findById(eventId).map(evento -> eventMapper.toEvent(evento));
    }

    @Override
    public Event save(Event event) {
        Evento evento= eventMapper.toEvento(event);
        return eventMapper.toEvent(eventoCrudRepository.save(evento));
    }

    @Override
    public void delete(int idEvento){
        eventoCrudRepository.deleteById(idEvento);
    }
}
