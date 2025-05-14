package com.ms.sportshop.servicios.usuario;

import com.ms.sportshop.dtos.usuario.TipoDocumentoDto;
import com.ms.sportshop.r2dbc.repositorios.usuario.implementacion.TipoDocumentoImplRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class TipoDocumentoServicio {

    private final TipoDocumentoImplRepositorio tipoDocumentoImplRepositorio;

    public Flux<TipoDocumentoDto> obtenerTodosLosTiposDocumento() {
        return tipoDocumentoImplRepositorio.obtenerTodosLosTiposDocumentos();
    }
}
