package com.ms.sportshop.r2dbc.modelos.usuario.mapeo;

import com.ms.sportshop.dtos.usuario.TipoDocumentoDto;
import com.ms.sportshop.r2dbc.modelos.usuario.TipoDocumentoTabla;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TipoDocumentoMapeo {
    TipoDocumentoMapeo INSTANCE = Mappers.getMapper(TipoDocumentoMapeo.class);

    TipoDocumentoDto aEntidad(TipoDocumentoTabla tabla);

    TipoDocumentoTabla aTabla(TipoDocumentoDto entidad);
}
