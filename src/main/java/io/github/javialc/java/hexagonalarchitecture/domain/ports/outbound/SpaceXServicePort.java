package io.github.javialc.java.hexagonalarchitecture.domain.ports.outbound;

import java.util.List;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;

public interface SpaceXServicePort {
    
    List<Capsule> getCapsules();

    Capsule getCapsule(String id);
}
