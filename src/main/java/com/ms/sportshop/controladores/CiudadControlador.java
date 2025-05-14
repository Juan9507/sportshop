package com.ms.sportshop.controladores;

import com.ms.sportshop.dtos.ciudad.CiudadDto;
import com.ms.sportshop.servicios.ciudad.CiudadServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class CiudadControlador {

    private final CiudadServicio ciudadServicio;

    /**
     * Obtiene todas las ciudades de la base de datos.
     *
     * @return Un flujo reactivo que emite todas las ciudades.
     */
    @GetMapping("/ciudades")
    public Flux<CiudadDto> obtenerCiudades() {
        return ciudadServicio.obtenerCiudades();
    }
}
