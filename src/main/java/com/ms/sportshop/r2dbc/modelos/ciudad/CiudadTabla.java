package com.ms.sportshop.r2dbc.modelos.ciudad;

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
@Table("CIUDAD")
public class CiudadTabla {

    @Id
    @Column("ID_CIUDAD")
    private Integer idCiudad;

    @Column("DESCRIPCION")
    private String descripcion;
}
