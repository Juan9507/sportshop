package com.ms.sportshop.r2dbc.repositorios.producto.implementacion;

import com.ms.sportshop.dtos.producto.ProductoDto;
import com.ms.sportshop.r2dbc.modelos.producto.mapeo.ProductoMapeo;
import com.ms.sportshop.r2dbc.repositorios.producto.ProductoRepositorio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class ProductoImplRepositorio {

    private final ProductoRepositorio productoRepositorio;

    public Flux<ProductoDto> obternerTodosLosProductos(){
        return productoRepositorio.consultarProductos()
                .map(ProductoMapeo.INSTANCE::aEntidad);
    }

    public Mono<ProductoDto> obtenerProductoPorId(Integer id){
        return productoRepositorio.consultarProductoConId(id)
                .map(ProductoMapeo.INSTANCE::aEntidad);
    }
}
