package com.ms.sportshop.dtos.compra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CompraDto {

    private Integer codigoCompra;
    private String cantidad;
    private String idUsuario;
    private Double precioTotal;
    private Date date;
    private Integer estadoIdEestado;
}
