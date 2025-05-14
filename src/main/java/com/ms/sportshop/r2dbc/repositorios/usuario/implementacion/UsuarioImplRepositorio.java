package com.ms.sportshop.r2dbc.repositorios.usuario.implementacion;

import com.ms.sportshop.dtos.usuario.UsuarioDto;
import com.ms.sportshop.r2dbc.modelos.usuario.mapeo.UsuarioMapeo;
import com.ms.sportshop.r2dbc.repositorios.usuario.UsuarioRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class UsuarioImplRepositorio {

    private final UsuarioRepositorio usuarioRepositorio;

    public Flux<UsuarioDto> obternerTodo(){
        return usuarioRepositorio.consultarUsuarios()
                .map(UsuarioMapeo.INSTANCE::aEntidad);
    }

    public Mono<UsuarioDto> obtenerUsuario(int documento, String correo){
        return usuarioRepositorio.validarExistencia(documento, correo)
                .map(UsuarioMapeo.INSTANCE::aEntidad);
    }

    public Mono<UsuarioDto> iniciarSesion(String correo, String contrasenia){
        return usuarioRepositorio.iniciarSesion(correo, contrasenia)
                .map(UsuarioMapeo.INSTANCE::aEntidad);
    }

    public Mono<UsuarioDto> guardarUsuario(UsuarioDto usuarioDto){

        return Mono.just(usuarioDto)
                .map(UsuarioMapeo.INSTANCE::aTabla)
                .flatMap(usuarioTabla -> usuarioRepositorio.guardarUsuario(
                        usuarioTabla.getDocumento(),usuarioTabla.getBarrio(),
                        usuarioTabla.getApellido(), usuarioTabla.getContrasenia(),
                        usuarioTabla.getCorreo(), usuarioTabla.getTelefono(),
                        usuarioTabla.getNombre(), usuarioTabla.getDireccion(),
                        usuarioTabla.getEdad(), usuarioTabla.getTipoDocumento(),
                        usuarioTabla.getRol(), usuarioTabla.getCiudad(),
                        usuarioTabla.getPais()
                ))
                .map(UsuarioMapeo.INSTANCE::aEntidad);

    }

}
