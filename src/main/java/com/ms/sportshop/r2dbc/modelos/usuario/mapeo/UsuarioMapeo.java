package com.ms.sportshop.r2dbc.modelos.usuario.mapeo;


import com.ms.sportshop.dtos.usuario.UsuarioDto;
import com.ms.sportshop.r2dbc.modelos.usuario.UsuarioTabla;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UsuarioMapeo {
    UsuarioMapeo INSTANCE = Mappers.getMapper(UsuarioMapeo.class);

    UsuarioDto aEntidad(UsuarioTabla tabla);

    UsuarioTabla aTabla(UsuarioDto entidad);
}
