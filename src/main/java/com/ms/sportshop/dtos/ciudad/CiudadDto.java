package com.ms.sportshop.dtos.ciudad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class CiudadDto {

    private Integer idCiudad;
    private String descripcion;
}
