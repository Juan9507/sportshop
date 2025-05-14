package com.ms.sportshop.r2dbc.repositorios.compra.implementacion;

import com.ms.sportshop.dtos.compra.CompraDto;
import com.ms.sportshop.r2dbc.modelos.compra.mapeo.CompraMapeo;
import com.ms.sportshop.r2dbc.repositorios.compra.CompraRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class CompraImplRespositorio  {

    private final CompraRepositorio compraRepositorio;

    public Flux<CompraDto> obternerTodo(){
        return compraRepositorio.findAll()
                .map(CompraMapeo.INSTANCE::aEntidad);
    }

    public Mono<CompraDto> guardarCompra(CompraDto compraDto){
        return Mono.just(compraDto)
                .map(CompraMapeo.INSTANCE::aTabla)
                .flatMap(compraTabla -> compraRepositorio.guardarCompra(
                        compraTabla.getTalla(), compraTabla.getIdUsuario(),
                        compraTabla.getPrecioTotal(), compraTabla.getFechaCompra(),
                        compraTabla.getEstadoIdEestado(), compraTabla.getProductoCodigoProduct()
                ))
                .map(CompraMapeo.INSTANCE::aEntidad);
    }
}
