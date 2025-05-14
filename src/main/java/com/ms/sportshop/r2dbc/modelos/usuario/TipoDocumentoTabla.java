package com.ms.sportshop.r2dbc.modelos.usuario;

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
@Table("TIPO_DOCUMENTO")
public class TipoDocumentoTabla {

    @Id
    @Column("ID_TIPO_DOCUMENTO")
    private Integer idTipoDocumento;

    @Column("DESCRIPCION")
    private String descripcion;

}
