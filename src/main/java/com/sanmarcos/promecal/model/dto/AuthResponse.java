package com.sanmarcos.promecal.model.dto;

import com.sanmarcos.promecal.model.entity.Rol;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    String token;
    Rol rol;
}
