package com.elendemo.locaciones.persistence.mapper;

import com.elendemo.locaciones.domain.Event;
import com.elendemo.locaciones.persistence.entity.Evento;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
    @Mappings({
            @Mapping(source="idEvento",target = "eventId"),
            @Mapping(source="fecha",target = "date"),
            @Mapping(source="evento",target = "event")
    }
    )
    Event toEvent (Evento evento);
    List<Event> toEvents (List<Evento> eventos);

    @InheritInverseConfiguration
    @Mapping(target="locaciones", ignore = true)
    Evento toEvento (Event event);
    List <Event> toEventos (List<Event> events);
}
