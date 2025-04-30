package com.ms.sportshop.r2dbc.modelos.factura;

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
@Table("FACTURA")
public class FacturaTabla {

    @Id
    @Column("NUMERO_FACTURA")
    private Integer numeroFactura;

    @Column("ID_USUARIO")
    private String idUsuario;

    @Column("CODIGO_COMPRA")
    private String codigoCompra;
}
