package com.sanmarcos.promecal.model.dto;

import com.sanmarcos.promecal.model.entity.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    String nombreusuario;
    String contrasena;
    String nombrecompleto;
    String correoelectronico;
    Rol rol;
}
