package com.ms.sportshop.r2dbc.repositorios.notificacion;

import com.ms.sportshop.r2dbc.modelos.notificacion.NotificacionTabla;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface NotificacionRepositorio extends R2dbcRepository<NotificacionTabla,Integer> {
}
