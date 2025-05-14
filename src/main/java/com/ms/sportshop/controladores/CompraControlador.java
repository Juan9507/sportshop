package com.ms.sportshop.controladores;

import com.ms.sportshop.dtos.compra.CompraDto;
import com.ms.sportshop.dtos.usuario.MensajeResultado;
import com.ms.sportshop.servicios.compra.CompraServicio;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CompraControlador {

    private final CompraServicio compraServicio;

    @PostMapping("/compra/guardar")
    public Mono<ResponseEntity<MensajeResultado>> guardarCompra (@RequestBody CompraDto compraDto){
       return compraServicio.guardarCompra(compraDto);
    }
}
