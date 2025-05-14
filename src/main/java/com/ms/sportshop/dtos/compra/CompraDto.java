package com.ms.sportshop.dtos.compra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CompraDto {

    private Integer codigoCompra;
    private String talla;
    private Integer idUsuario;
    private String precioTotal;
    private LocalDateTime fechaCompra;
    private Integer estadoIdEestado;
    private Integer productoCodigoProduct;
}
