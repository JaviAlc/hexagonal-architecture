package io.github.javialc.java.hexagonalarchitecture.domain.ports.inbound;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;

import java.util.List;

public interface SpaceXClientPort {
    
    Capsule getCapsuleById(String id);
    
    List<Capsule> getCapsules();
    
    
}
