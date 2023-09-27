package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Data Transfer Object for a list of Capsules.
 */
@Data
@Builder
public class CapsulesDto implements Serializable {
    
    /**
     * List of capsule data transfer objects.
     */
    private List<CapsuleDto> capsules;
}
