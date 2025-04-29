package com.ms.sportshop.r2dbc.modelos.producto.mapeo;

import com.ms.sportshop.dtos.producto.ProductoDto;
import com.ms.sportshop.r2dbc.modelos.producto.ProductoTabla;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductoMapeo {

    ProductoMapeo INSTANCE = Mappers.getMapper(ProductoMapeo.class);

    ProductoDto aEntidad(ProductoTabla tabla);

    ProductoTabla aTabla(ProductoDto entidad);
}
