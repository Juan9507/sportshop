package com.ms.sportshop.servicios.usuario;

import com.ms.sportshop.dtos.usuario.MensajeResultado;
import com.ms.sportshop.dtos.usuario.UsuarioDto;
import com.ms.sportshop.r2dbc.repositorios.usuario.implementacion.UsuarioImplRepositorio;
import com.ms.sportshop.utils.MensajeUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Clase dedicada para la logica de negocio que se le requiera hacer
 * a la información que se obtienen de la base de datos
 */
@Service
@RequiredArgsConstructor
@Log
public class UsuarioServicio {

    private final UsuarioImplRepositorio usuarioImplRepositorio;

    public Flux<UsuarioDto> obtenerTodos(){
        return usuarioImplRepositorio.obternerTodo()
                .doOnNext(usuarioDto -> log.info("Usuarios: " + usuarioDto));
    }

    /**
     * Guarda un nuevo usuario en el sistema después de validar su existencia previa.
     *
     * @param usuarioDto Objeto que contiene los datos del usuario a registrar
     * @return Mono<ResponseEntity<MensajeResultado>> con:
     *         - Mensaje de resultado de la operación
     *         - Objeto usuario cuando aplica
     *         - Código de estado HTTP apropiado
     */
    public Mono<ResponseEntity<MensajeResultado>> guardarUsuario(UsuarioDto usuarioDto){
        return usuarioImplRepositorio.obtenerUsuario(usuarioDto.getDocumento(), usuarioDto.getCorreo())
                .flatMap(usuario -> Mono.just(MensajeUtil.mensajeValidacion("El usuario ya existe por favor ingrese sesión", usuario)))
                .switchIfEmpty(
                   usuarioImplRepositorio.guardarUsuario(usuarioDto)
                            .map(usuarioGuardado -> MensajeUtil.mensajeValidacion("Usuario guardado exitosamente", null))
                            .defaultIfEmpty(MensajeUtil.mensajeValidacion("Usuario guardado exitosamente", null))
                            .onErrorResume(t -> Mono.just(MensajeUtil.mensajeValidacion("Error al guardar el usuario", null)))
                );
    }

    /**
     * Ingresar sesión en el sistema después de validar su existencia previa.
     *
     * @param correo correo del usuario que va a ingresar
     * @param contrasenia  del usuario que va a ingresar
     * @return Mono<ResponseEntity<MensajeResultado>> con:
     *         - nicio se sesión sastifactorio
     *         - Usuario o contraseña incorrectas
     *         - Código de estado HTTP apropiado
     */
    public Mono<ResponseEntity<MensajeResultado>> ingresarSesion(String correo, String contrasenia){
        return  usuarioImplRepositorio.iniciarSesion(correo, contrasenia)
                .flatMap(usuarioDto -> Mono.just(MensajeUtil.mensajeValidacion("Inicio se sesión satisfactoria", usuarioDto)))
                .defaultIfEmpty(MensajeUtil.mensajeValidacion("Usuario o contraseña incorrectas", null))
                .onErrorResume(t -> Mono.just(MensajeUtil.mensajeValidacion("Error al ingresar sesión:" + t.getMessage(), null)));
    }
}
