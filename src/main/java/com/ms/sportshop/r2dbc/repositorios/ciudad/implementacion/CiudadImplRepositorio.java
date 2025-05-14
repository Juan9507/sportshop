package com.ms.sportshop.r2dbc.repositorios.ciudad.implementacion;

import com.ms.sportshop.dtos.ciudad.CiudadDto;
import com.ms.sportshop.r2dbc.modelos.ciudad.mapeo.CiudadMapeo;
import com.ms.sportshop.r2dbc.repositorios.ciudad.CiudadRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@RequiredArgsConstructor
public class CiudadImplRepositorio {

    private final CiudadRepositorio ciudadRepositorio;

    public Flux<CiudadDto> obtenerCiudades(){
        return ciudadRepositorio.findAll()
                .map(CiudadMapeo.INSTANCE::aEntidad);
    }
}
