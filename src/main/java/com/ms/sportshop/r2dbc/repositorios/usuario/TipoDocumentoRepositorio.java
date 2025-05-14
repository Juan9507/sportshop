package com.ms.sportshop.r2dbc.repositorios.usuario;

import com.ms.sportshop.r2dbc.modelos.usuario.TipoDocumentoTabla;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface TipoDocumentoRepositorio extends R2dbcRepository<TipoDocumentoTabla,Integer> {
}
