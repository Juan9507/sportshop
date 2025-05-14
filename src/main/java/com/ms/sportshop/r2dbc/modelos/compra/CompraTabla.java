package com.ms.sportshop.r2dbc.modelos.compra;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("COMPRA")
public class CompraTabla {

    @Id
    @Column("CODIGO_COMPRA")
    private Integer codigoCompra;

    @Column("TALLA")
    private String talla;

    @Column("ID_USUARIO")
    private Integer idUsuario;

    @Column("PRECIO_TOTAL")
    private String precioTotal;

    @Column("FECHA_COMPRA")
    private LocalDateTime fechaCompra;

    @Column("ESTADO_ID_ESTADO")
    private Integer estadoIdEestado;

    @Column("PRODUCTO_CODIGO_PRODUCT")
    private Integer productoCodigoProduct;
}
