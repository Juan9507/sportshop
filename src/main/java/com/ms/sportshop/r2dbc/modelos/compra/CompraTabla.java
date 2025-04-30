package com.ms.sportshop.r2dbc.modelos.compra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("COMPRA")
public class CompraTabla {

    @Id
    @Column("CODIGO_COMPRA")
    private Integer codigoCompra;

    @Column("CANTIDAD")
    private String cantidad;

    @Column("ID_USUARIO")
    private String idUsuario;

    @Column("PRECIO_TOTAL")
    private Double precioTotal;

    @Column("FECHA_COMPRA")
    private Date date;

    @Column("ESTADO_ID_ESTADO")
    private Integer estadoIdEestado;
}
