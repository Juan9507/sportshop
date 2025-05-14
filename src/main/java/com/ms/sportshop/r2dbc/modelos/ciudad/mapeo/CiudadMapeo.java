package com.ms.sportshop.r2dbc.modelos.ciudad.mapeo;

import com.ms.sportshop.dtos.ciudad.CiudadDto;
import com.ms.sportshop.r2dbc.modelos.ciudad.CiudadTabla;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CiudadMapeo {

    CiudadMapeo INSTANCE = Mappers.getMapper(CiudadMapeo.class);

    CiudadDto aEntidad(CiudadTabla tabla);

    CiudadTabla aTabla(CiudadDto entidad);
}
