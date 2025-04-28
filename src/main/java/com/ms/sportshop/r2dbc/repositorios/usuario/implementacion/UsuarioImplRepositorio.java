package com.ms.sportshop.r2dbc.repositorios.usuario.implementacion;

import com.ms.sportshop.dtos.usuario.UsuarioDto;
import com.ms.sportshop.r2dbc.modelos.usuario.mapeo.UsuarioMapeo;
import com.ms.sportshop.r2dbc.repositorios.usuario.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@RequiredArgsConstructor
public class UsuarioImplRepositorio {
    private final UsuarioRepositorio usuarioRepositorio;

    public Flux<UsuarioDto> obternerTodo(){
        return usuarioRepositorio.consultarUsuarios()
                .map(UsuarioMapeo.INSTANCE::aEntidad);
    }

}
