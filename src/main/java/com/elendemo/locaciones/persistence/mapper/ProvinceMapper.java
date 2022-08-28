package com.elendemo.locaciones.persistence.mapper;

import com.elendemo.locaciones.domain.Province;
import com.elendemo.locaciones.persistence.entity.Provincia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper (componentModel = "spring")
public interface ProvinceMapper {
    @Mappings({
            @Mapping(source="idProvincia",target="provinceId"),
            @Mapping(source="provincia",target="province")
    })
    Province toProvince (Provincia provincia);
    List<Province> toProvinces (List<Provincia> provincias);

    @InheritInverseConfiguration
    @Mapping(target="localidades",ignore = true)
    Provincia toProvincia(Province province);
}
