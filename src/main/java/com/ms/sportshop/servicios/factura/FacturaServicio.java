package com.ms.sportshop.servicios.factura;

import com.ms.sportshop.dtos.factura.FacturaDto;
import com.ms.sportshop.r2dbc.repositorios.factura.implementacion.FacturaImplRespositorio;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
@Log
public class FacturaServicio {
    private final FacturaImplRespositorio facturaImplRespositorio;

    public Flux<FacturaDto> obtenerTodos(){
        return facturaImplRespositorio.obternerTodo()
                .doOnNext(facturaDto -> log.info("Compras: " + facturaDto));
    }
}
