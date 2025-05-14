package com.ms.sportshop.servicios.ciudad;

import com.ms.sportshop.dtos.ciudad.CiudadDto;
import com.ms.sportshop.r2dbc.repositorios.ciudad.implementacion.CiudadImplRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class CiudadServicio {

    private final CiudadImplRepositorio ciudadImplRepositorio;

    /**
     * Obtiene todas las ciudades de la base de datos.
     *
     * @return Un flujo reactivo que emite todas las ciudades.
     */
    public Flux<CiudadDto> obtenerCiudades() {
        return ciudadImplRepositorio.obtenerCiudades();
    }
}
