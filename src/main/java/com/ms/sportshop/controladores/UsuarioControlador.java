package com.ms.sportshop.controladores;

import com.ms.sportshop.dtos.usuario.MensajeResultado;
import com.ms.sportshop.dtos.usuario.UsuarioDto;
import com.ms.sportshop.servicios.usuario.UsuarioServicio;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class UsuarioControlador {

    private final UsuarioServicio usuarioServicio;

    @PostMapping("/usuario/guardar")
    public Mono<ResponseEntity<MensajeResultado>> guardarCliente(@RequestBody UsuarioDto usuarioDto){
        return usuarioServicio.guardarUsuario(usuarioDto);
    }

    @PostMapping("/usuario/ingresar")
    public Mono<ResponseEntity<MensajeResultado>> ingresarSesion(@RequestBody UsuarioDto usuarioDto){
        return usuarioServicio.ingresarSesion(usuarioDto.getCorreo(), usuarioDto.getContrasenia());
    }
}
