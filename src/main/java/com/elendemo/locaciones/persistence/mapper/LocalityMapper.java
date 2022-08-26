package com.elendemo.locaciones.persistence.mapper;

import com.elendemo.locaciones.domain.Locality;
import com.elendemo.locaciones.persistence.entity.Localidad;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProvinceMapper.class})
public interface LocalityMapper {
    @Mappings({
            @Mapping(source="idLocalidad",target="localityId"),
            @Mapping(source="localidad",target="locality"),
            @Mapping(source="provincia",target="province"),
    })
    Locality toLocality (Localidad localidad);
    List<Locality> toLocalities (List<Localidad> localidades);

    @InheritInverseConfiguration
    Localidad toLocalidad (Locality locality);
}
