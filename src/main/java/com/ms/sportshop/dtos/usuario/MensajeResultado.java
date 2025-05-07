package com.ms.sportshop.dtos.usuario;

import lombok.Data;

@Data
public class MensajeResultado {
    private String mensaje;
    private UsuarioDto datos;

    public MensajeResultado(String mensaje, UsuarioDto datos) {
        this.mensaje = mensaje;
        this.datos = datos;
    }
}
