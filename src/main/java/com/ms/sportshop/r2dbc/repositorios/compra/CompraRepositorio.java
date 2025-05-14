package com.ms.sportshop.r2dbc.repositorios.compra;

import com.ms.sportshop.r2dbc.modelos.compra.CompraTabla;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public interface CompraRepositorio extends R2dbcRepository<CompraTabla,Integer> {

    @Query("""
            INSERT INTO COMPRA (TALLA, ID_USUARIO, PRECIO_TOTAL, FECHA_COMPRA, ESTADO_ID_ESTADO, PRODUCTO_CODIGO_PRODUCT)
            VALUES (:talla, :idUsuario, :precioTotal, :fechaCompra, :idEstado, :codigoProducto);
            """)
    Mono<CompraTabla> guardarCompra(
            @Param("talla") String talla,
            @Param("idUsuario") Integer idUsuario,
            @Param("precioTotal") String precioTotal,
            @Param("fechaCompra") LocalDateTime fechaCompra,
            @Param("idEstado") Integer idEstado,
            @Param("codigoProducto") Integer codigoProducto
    );
}
