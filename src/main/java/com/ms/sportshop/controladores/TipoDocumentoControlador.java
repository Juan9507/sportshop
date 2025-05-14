package com.ms.sportshop.controladores;

import com.ms.sportshop.dtos.usuario.TipoDocumentoDto;
import com.ms.sportshop.servicios.usuario.TipoDocumentoServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class TipoDocumentoControlador {

    private final TipoDocumentoServicio tipoDocumentoServicio;

    @GetMapping("/tipos-documento")
    public Flux<TipoDocumentoDto> obtenerTiposDocumento() {
        return tipoDocumentoServicio.obtenerTodosLosTiposDocumento();
    }
}
