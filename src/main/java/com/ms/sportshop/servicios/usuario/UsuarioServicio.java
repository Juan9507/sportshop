package com.ms.sportshop.servicios.usuario;

import com.ms.sportshop.dtos.usuario.UsuarioDto;
import com.ms.sportshop.r2dbc.repositorios.usuario.implementacion.UsuarioImplRepositorio;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
/**
 * Clase dedicada para la logica de negocio que se le requiera hacer
 * a la información que se obtienen de la base de datos
 * **/
@Service
@RequiredArgsConstructor
@Log
public class UsuarioServicio {

    private final UsuarioImplRepositorio usuarioImplRepositorio;

    public Flux<UsuarioDto> obtenerTodos(){
        return usuarioImplRepositorio.obternerTodo()
                .doOnNext(usuarioDto -> log.info("Usuarios: " + usuarioDto));
    }
}
