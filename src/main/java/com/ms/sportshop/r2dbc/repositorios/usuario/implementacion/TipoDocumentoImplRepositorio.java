package com.ms.sportshop.r2dbc.repositorios.usuario.implementacion;

import com.ms.sportshop.dtos.usuario.TipoDocumentoDto;
import com.ms.sportshop.r2dbc.modelos.usuario.mapeo.TipoDocumentoMapeo;
import com.ms.sportshop.r2dbc.repositorios.usuario.TipoDocumentoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@RequiredArgsConstructor
public class TipoDocumentoImplRepositorio {

    private final TipoDocumentoRepositorio tipoDocumentoRepositorio;

    public Flux<TipoDocumentoDto> obtenerTodosLosTiposDocumentos() {
        return tipoDocumentoRepositorio.findAll()
                .map(TipoDocumentoMapeo.INSTANCE::aEntidad);
    }
}
