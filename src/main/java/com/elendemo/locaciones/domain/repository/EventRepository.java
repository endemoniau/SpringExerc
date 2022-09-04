package com.elendemo.locaciones.domain.repository;

import com.elendemo.locaciones.domain.Event;

import java.util.List;
import java.util.Optional;

public interface EventRepository {
    List<Event> getAll();
    Optional <Event> getEvent(int eventId);
    Event save (Event event);
    void delete (int eventId);
}
