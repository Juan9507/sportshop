package com.ms.sportshop.r2dbc.repositorios.ciudad;

import com.ms.sportshop.r2dbc.modelos.ciudad.CiudadTabla;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CiudadRepositorio extends R2dbcRepository<CiudadTabla,Integer> {
}
