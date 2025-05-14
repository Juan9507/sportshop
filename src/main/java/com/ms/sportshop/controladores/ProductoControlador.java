package com.ms.sportshop.controladores;

import com.ms.sportshop.dtos.producto.ProductoDto;
import com.ms.sportshop.servicios.producto.ProductoServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class ProductoControlador {

    private final ProductoServicio productoServicio;

    @GetMapping("/productos")
    public Flux<ProductoDto> obtenerProductos() {
        return productoServicio.obtenerTodosLosProductos();
    }

    @GetMapping("/producto")
    public Mono<ProductoDto> obtenerProductoPorId(@RequestParam Integer id) {
        return productoServicio.obtenerProductoPorId(id);
    }

}
