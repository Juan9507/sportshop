package com.ms.sportshop.dtos.factura;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class FacturaDto {

    private Integer numeroFactura;
    private String idUsuario;
    private String codigoCompra;
}
