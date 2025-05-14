package com.ms.sportshop.dtos.producto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class ProductoDto {
    private Integer codigoProduct;
    private String nombre;
    private Integer cantidad;
    private String imagen;
    private String precio;
    private String categoria;
    private String genero;
    private String estado;
    private String talla;
}
