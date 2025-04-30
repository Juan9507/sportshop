package com.ms.sportshop.servicios.compra;

import com.ms.sportshop.dtos.compra.CompraDto;
import com.ms.sportshop.r2dbc.repositorios.compra.implementacion.CompraImplRespositorio;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
@Log
public class CompraServicio {
    private final CompraImplRespositorio compraImplRespositorio;

    public Flux<CompraDto> obtenerTodos(){
        return compraImplRespositorio.obternerTodo()
                .doOnNext(compraDto -> log.info("Compras: " + compraDto));
    }
}
