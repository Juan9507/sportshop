package com.ms.sportshop.r2dbc.modelos.producto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("PRODUCTO")
public class ProductoTabla {
    @Id
    @Column("CODIGO_PRODUCT")
    private Integer codigoProduct;

    @Column("NOMBRE")
    private String nombre;

    @Column("CANTIDAD")
    private Integer cantidad;

    @Column("IMAGEN")
    private String imagen;

    @Column("PRECIO")
    private double precio;

    @ReadOnlyProperty
    private String categoria;

    @ReadOnlyProperty
    private String genero;

    @ReadOnlyProperty
    private String estado;

    @ReadOnlyProperty
    private String talla;

}
