package com.ms.sportshop.r2dbc.repositorios.producto;

import com.ms.sportshop.r2dbc.modelos.producto.ProductoTabla;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface ProductoRepositorio extends R2dbcRepository<ProductoTabla,Integer> {

    @Query("""
            SELECT CODIGO_PRODUCT AS CODIGO_PRODUCT, NOMBRE,CANTIDAD,IMAGEN, PRECIO,
                categoria.descripcion AS CATEGORIA, genero.descripcion AS GENERO,
                estado.descripcion AS ESTADO, GROUP_CONCAT(talla.descripcion SEPARATOR ', ') AS TALLA
            FROM PRODUCTO producto
            INNER JOIN CATEGORIA categoria ON categoria.ID_CATEGORIA = producto.CATEGORIA_ID_CATEGORIA
            INNER JOIN GENERO genero ON genero.ID_GENERO = producto.GENERO_ID_GENERO
            INNER JOIN ESTADO estado ON estado.ID_ESTADO = producto.ESTADO_ID_ESTADO
            INNER JOIN PRODUCTO_TIENE_TALLA tallas ON tallas.PRODUCTO_COD_PRODUCTO = producto.CODIGO_PRODUCT
            INNER JOIN TALLA talla ON talla.ID_TALLA = tallas.TALLA_ID_TALLA
            GROUP BY CODIGO_PRODUCT, NOMBRE,CANTIDAD,PRECIO,CATEGORIA, GENERO, ESTADO;
            """)
    Flux<ProductoTabla> consultarProductos();
}
