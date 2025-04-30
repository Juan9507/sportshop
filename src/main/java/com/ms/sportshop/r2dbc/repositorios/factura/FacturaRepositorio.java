package com.ms.sportshop.r2dbc.repositorios.factura;

import com.ms.sportshop.r2dbc.modelos.factura.FacturaTabla;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface FacturaRepositorio extends R2dbcRepository<FacturaTabla,Integer> {
}
