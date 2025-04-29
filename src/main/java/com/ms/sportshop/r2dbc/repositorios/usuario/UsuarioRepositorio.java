package com.ms.sportshop.r2dbc.repositorios.usuario;

import com.ms.sportshop.r2dbc.modelos.usuario.UsuarioTabla;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Flux;

public interface UsuarioRepositorio extends R2dbcRepository<UsuarioTabla,Integer> {

    @Query("""
            SELECT
            	DOCUMENTO, BARRIO, APELLIDO, CONTRASENIA, CORREO, TELEFONO, NOMBRE, DIRECCION, EDAD,
            	tipoDocumento.DESCRIPCION AS TIPO_DOCUMENTO, rol.DESCRIPCION AS ROL,
                ciudad.DESCRIPCION AS CIUDAD, pais.DESCRIPCION AS PAIS
            FROM usuario usuario
            INNER JOIN TIPO_DOCUMENTO tipoDocumento ON tipoDocumento.ID_TIPO_DOCUMENTO = usuario.TIPO_DOCUMENTO
            INNER JOIN ROL rol ON rol.id_rol = usuario.ROL_ID_ROL
            INNER JOIN CIUDAD ciudad ON ciudad.id_ciudad = usuario.CIUDAD_ID_CIUDAD
            INNER JOIN PAIS pais ON pais.id_pais = usuario.PAIS_ID_PAIS
            """)
    Flux<UsuarioTabla> consultarUsuarios();
}
