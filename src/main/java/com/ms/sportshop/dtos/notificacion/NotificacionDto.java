package com.ms.sportshop.dtos.notificacion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class NotificacionDto {

    private Integer codNotificacion;
    private String descNotificacion;
    private String esVisto;
    private String idUsuario;
}
