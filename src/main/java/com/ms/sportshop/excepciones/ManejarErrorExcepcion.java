package com.ms.sportshop.excepciones;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ManejarErrorExcepcion extends RuntimeException{

    private String mensaje;

    private HttpStatus httpStatus;

    public ManejarErrorExcepcion(String mensaje, HttpStatus httpStatus) {
        super(mensaje);
        this.mensaje = mensaje;
        this.httpStatus = httpStatus;
    }
}
