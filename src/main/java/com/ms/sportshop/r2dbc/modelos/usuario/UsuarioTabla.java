package com.ms.sportshop.r2dbc.modelos.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table("USUARIO")
public class UsuarioTabla {

    @Id
    @Column("DOCUMENTO")
    private Integer documento;

    @Column("BARRIO")
    private String barrio;

    @Column("APELLIDO")
    private String apellido;

    @Column("CONTRASENIA")
    private String contrasenia;

    @Column("CORREO")
    private String correo;

    @Column("TELEFONO")
    private long telefono;

    @Column("NOMBRE")
    private String nombre;

    @Column("DIRECCION")
    private String direccion;

    @Column("EDAD")
    private Integer edad;

    @ReadOnlyProperty
    private String tipoDocumento;

    @ReadOnlyProperty
    private String rol;

    @ReadOnlyProperty
    private String ciudad;

    @ReadOnlyProperty
    private String pais;
}
