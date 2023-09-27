package io.github.javialc.java.hexagonalarchitecture.domain.models;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class FavouriteCapsule implements Serializable {
    
    private String id;
    private String capsuleId;
    private LocalDateTime addedAt;
    
}
