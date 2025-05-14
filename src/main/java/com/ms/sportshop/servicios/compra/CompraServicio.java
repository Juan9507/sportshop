package com.ms.sportshop.servicios.compra;

import com.ms.sportshop.dtos.compra.CompraDto;
import com.ms.sportshop.dtos.usuario.MensajeResultado;
import com.ms.sportshop.r2dbc.repositorios.compra.implementacion.CompraImplRespositorio;
import com.ms.sportshop.utils.MensajeUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Log
public class CompraServicio {
    private final CompraImplRespositorio compraImplRespositorio;

    public Flux<CompraDto> obtenerTodos(){
        return compraImplRespositorio.obternerTodo()
                .doOnNext(compraDto -> log.info("Compras: " + compraDto));
    }

    public Mono<ResponseEntity<MensajeResultado>> guardarCompra(CompraDto compraDto){
        compraDto.setFechaCompra(java.time.LocalDateTime.now());
        return compraImplRespositorio.guardarCompra(compraDto)
                .map(compraGuardado -> MensajeUtil.mensajeValidacion("Compra realizada exitosamente", null))
                .defaultIfEmpty(MensajeUtil.mensajeValidacion("Compra realizada exitosamente", null))
                .onErrorResume(t -> Mono.just(MensajeUtil.mensajeValidacion("Error al realizar la compra " + t.getMessage(), null)));
    }
}
