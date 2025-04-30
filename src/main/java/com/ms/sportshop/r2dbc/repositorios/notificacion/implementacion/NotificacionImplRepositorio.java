package com.ms.sportshop.r2dbc.repositorios.notificacion.implementacion;

import com.ms.sportshop.dtos.notificacion.NotificacionDto;
import com.ms.sportshop.r2dbc.modelos.notificacion.mapeo.NotificacionMapeo;
import com.ms.sportshop.r2dbc.repositorios.notificacion.NotificacionRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@RequiredArgsConstructor
public class NotificacionImplRepositorio {
    private final NotificacionRepositorio notificacionRepositorio;

    public Flux<NotificacionDto> obternerTodo(){
        return notificacionRepositorio.findAll()
                .map(NotificacionMapeo.INSTANCE::aEntidad);
    }
}
