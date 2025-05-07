package com.ms.sportshop.r2dbc.repositorios.usuario;

import com.ms.sportshop.r2dbc.modelos.usuario.UsuarioTabla;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.query.Param;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @Query("""
            SELECT DOCUMENTO, BARRIO, APELLIDO, CORREO, TELEFONO, NOMBRE, DIRECCION, EDAD
            FROM usuario usuario
            WHERE usuario.correo = :correo and usuario.contrasenia = :contrasenia limit 1
            """)
    Mono<UsuarioTabla> iniciarSesion(
            @Param("correo") String correo,
            @Param("contrasenia") String contrasenia
    );

    @Query("""
            SELECT DOCUMENTO, CORREO
            FROM usuario usuario
            WHERE usuario.documento = :documento OR usuario.correo = :correo limit 1
            """)
    Mono<UsuarioTabla> validarExistencia(
            @Param("documento") Integer documento,
            @Param("correo") String correo
    );

    @Query("""
            INSERT INTO USUARIO (DOCUMENTO, BARRIO, APELLIDO, CONTRASENIA, CORREO, TELEFONO, NOMBRE, DIRECCION, EDAD, TIPO_DOCUMENTO, ROL_ID_ROL, CIUDAD_ID_CIUDAD, PAIS_ID_PAIS)
            VALUES (:documento, :barrio, :apellido, :contrasenia, :correo, :telefono, :nombre, :direccion, :edad, :tipoDocumento, :rol, :ciudad, :pais);
            """)
    Mono<UsuarioTabla> guardarUsuario(
            @Param("documento") Integer documento,
            @Param("barrio") String barrio,
            @Param("apellido") String apellido,
            @Param("contrasenia") String contrasenia,
            @Param("correo") String correo,
            @Param("telefono") long telefono,
            @Param("nombre") String nombre,
            @Param("direccion") String direccion,
            @Param("edad") Integer edad,
            @Param("tipoDocumento")String tipoDocumento,
            @Param("rol") String rol,
            @Param("ciudad") String ciudad,
            @Param("pais") String pais
    );
}
