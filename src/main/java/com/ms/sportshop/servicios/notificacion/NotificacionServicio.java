package com.ms.sportshop.servicios.notificacion;

import com.ms.sportshop.dtos.notificacion.NotificacionDto;
import com.ms.sportshop.r2dbc.repositorios.notificacion.implementacion.NotificacionImplRepositorio;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
@Log
public class NotificacionServicio {

    private final NotificacionImplRepositorio notificacionImplRepositorio;

    public Flux<NotificacionDto> obtenerTodos(){
        return notificacionImplRepositorio.obternerTodo()
                .doOnNext(notificacionDto -> log.info("Notificacion: " + notificacionDto));
    }
}
