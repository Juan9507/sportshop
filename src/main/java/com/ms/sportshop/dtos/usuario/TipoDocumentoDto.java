package com.ms.sportshop.dtos.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TipoDocumentoDto {
    private Integer idTipoDocumento;
    private String descripcion;
}
