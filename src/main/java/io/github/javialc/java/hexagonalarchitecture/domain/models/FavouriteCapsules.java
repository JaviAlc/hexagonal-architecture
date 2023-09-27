package io.github.javialc.java.hexagonalarchitecture.domain.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class FavouriteCapsules {
    
    List<Capsule> capsules;
    
}
