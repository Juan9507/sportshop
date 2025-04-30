package com.ms.sportshop.r2dbc.modelos.notificacion.mapeo;

import com.ms.sportshop.dtos.notificacion.NotificacionDto;
import com.ms.sportshop.r2dbc.modelos.notificacion.NotificacionTabla;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface NotificacionMapeo {

    NotificacionMapeo INSTANCE = Mappers.getMapper(NotificacionMapeo.class);

    NotificacionDto aEntidad(NotificacionTabla tabla);

    NotificacionTabla aTabla(NotificacionDto entidad);
}
