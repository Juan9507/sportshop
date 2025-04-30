package com.ms.sportshop.r2dbc.modelos.compra.mapeo;

import com.ms.sportshop.dtos.compra.CompraDto;
import com.ms.sportshop.r2dbc.modelos.compra.CompraTabla;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CompraMapeo {

    CompraMapeo INSTANCE = Mappers.getMapper(CompraMapeo.class);

    CompraDto aEntidad(CompraTabla tabla);

    CompraTabla aTabla(CompraDto entidad);
}
