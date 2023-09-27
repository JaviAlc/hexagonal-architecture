package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
public class CapsulesDto implements Serializable {
    
    private List<CapsuleDto> capsules;
}
