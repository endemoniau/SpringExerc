package com.elendemo.locaciones.persistence.mapper;

import com.elendemo.locaciones.domain.Lodgment;
import com.elendemo.locaciones.persistence.entity.Hospedaje;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LodgmentMapper {
    @Mappings({
            @Mapping(source="idHospedaje",target="lodgmentId"),
            @Mapping(source="telefono",target="phone"),
            @Mapping(source="correo",target="email"),
            @Mapping(source="coordenada",target="coordinate"),
            @Mapping(source="hospedaje",target="lodgment"),
            @Mapping(source="redSocial",target="socialNetwork"),
    })
    Lodgment toLodgment (Hospedaje hospedaje);
    List<Lodgment> toLodgments (List<Hospedaje> hospedajes);

    @InheritInverseConfiguration
    @Mapping(target="locaciones", ignore = true)
    Hospedaje toHospedaje (Lodgment lodgment);
}
