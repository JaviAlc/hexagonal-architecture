package io.github.javialc.java.hexagonalarchitecture.domain.services;

import java.util.List;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;

public interface SpaceXService {
    
    List<Capsule> getCapsules();

    Capsule getCapsule(String id);
}
