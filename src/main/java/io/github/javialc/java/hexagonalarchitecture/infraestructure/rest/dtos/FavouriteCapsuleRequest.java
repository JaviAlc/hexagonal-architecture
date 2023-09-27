package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FavouriteCapsuleRequest {
    
    @NotBlank
    private String capsuleId;
}
