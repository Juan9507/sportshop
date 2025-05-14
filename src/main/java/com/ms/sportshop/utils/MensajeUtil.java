package com.ms.sportshop.utils;

import com.ms.sportshop.dtos.usuario.MensajeResultado;
import com.ms.sportshop.dtos.usuario.UsuarioDto;
import lombok.experimental.UtilityClass;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@UtilityClass
public class MensajeUtil {
    /**
     *
     * @param mensaje mesaje deseado a devolver
     * @param datos  objeto usuariodto con los datos devuelto por la consulta
     * @return Mono<ResponseEntity<MensajeResultado>> con:
     *         - el objeto que contiene el mensaje de repuesta
     */
    public ResponseEntity<MensajeResultado> mensajeValidacion(String mensaje, UsuarioDto datos){
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(new MensajeResultado(mensaje, datos));
    }
}
