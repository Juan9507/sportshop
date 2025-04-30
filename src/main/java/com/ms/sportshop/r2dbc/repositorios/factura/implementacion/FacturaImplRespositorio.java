package com.ms.sportshop.r2dbc.repositorios.factura.implementacion;

import com.ms.sportshop.dtos.factura.FacturaDto;
import com.ms.sportshop.r2dbc.modelos.factura.mapeo.FacturaMapeo;
import com.ms.sportshop.r2dbc.repositorios.factura.FacturaRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@RequiredArgsConstructor
public class FacturaImplRespositorio {

    private final FacturaRepositorio facturaRepositorio;

    public Flux<FacturaDto> obternerTodo(){
        return facturaRepositorio.findAll()
                .map(FacturaMapeo.INSTANCE::aEntidad);
    }
}
