package com.ms.sportshop.dtos.usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UsuarioDto {

    private Integer documento;
    private String barrio;
    private String apellido;
    private String contrasenia;
    private String correo;
    private long telefono;
    private String nombre;
    private String direccion;
    private Integer edad;
    private String tipoDocumento;
    private String rol;
    private String ciudad;
    private String pais;
}
