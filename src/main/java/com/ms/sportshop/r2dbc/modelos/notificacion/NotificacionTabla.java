package com.ms.sportshop.r2dbc.modelos.notificacion;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("NOTIFICACION")
public class NotificacionTabla {

    @Id
    @Column("COD_NOTIFICACION")
    private Integer codNotificacion;

    @Column("DESC_NOTIFICACION")
    private String descNotificacion;

    @Column("ES_VISTO")
    private String esVisto;

    @Column("ID_USUARIO")
    private String idUsuario;
}
