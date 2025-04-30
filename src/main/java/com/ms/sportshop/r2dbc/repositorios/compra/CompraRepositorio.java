package com.ms.sportshop.r2dbc.repositorios.compra;

import com.ms.sportshop.r2dbc.modelos.compra.CompraTabla;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CompraRepositorio extends R2dbcRepository<CompraTabla,Integer> {
}
