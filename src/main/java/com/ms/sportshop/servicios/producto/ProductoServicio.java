package com.ms.sportshop.servicios.producto;

import com.ms.sportshop.dtos.producto.ProductoDto;
import com.ms.sportshop.r2dbc.repositorios.producto.implementacion.ProductoImplRepositorio;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

/**
 * Clase dedicada para la logica de negocio que se le requiera hacer
 * a la información que se obtienen de la base de datos
 * **/
@Service
@RequiredArgsConstructor
@Log
public class ProductoServicio {

    private final ProductoImplRepositorio productoImplRepositorio;

    public Flux<ProductoDto> obtenerTodosLosProductos(){
        return productoImplRepositorio.obternerTodosLosProductos();
    }

    public Mono<ProductoDto> obtenerProductoPorId(Integer id){
        return productoImplRepositorio.obtenerProductoPorId(id);
    }
}
