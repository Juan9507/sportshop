package com.ms.sportshop.r2dbc.modelos.factura.mapeo;

import com.ms.sportshop.dtos.compra.CompraDto;
import com.ms.sportshop.dtos.factura.FacturaDto;
import com.ms.sportshop.r2dbc.modelos.compra.CompraTabla;
import com.ms.sportshop.r2dbc.modelos.compra.mapeo.CompraMapeo;
import com.ms.sportshop.r2dbc.modelos.factura.FacturaTabla;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface FacturaMapeo {

    FacturaMapeo INSTANCE = Mappers.getMapper(FacturaMapeo.class);

    FacturaDto aEntidad(FacturaTabla tabla);

    FacturaTabla aTabla(FacturaDto entidad);
}
