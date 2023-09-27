package io.github.javialc.java.hexagonalarchitecture.application.adapters;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;
import io.github.javialc.java.hexagonalarchitecture.domain.ports.inbound.SpaceXClientPort;
import io.github.javialc.java.hexagonalarchitecture.domain.ports.outbound.SpaceXServicePort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SpaceXServiceAdapter implements SpaceXServicePort {

    private final SpaceXClientPort spaceXClientPort;
    
    @Override
    public List<Capsule> getCapsules() {
        return spaceXClientPort.getCapsules();
    }

    @Override
    public Capsule getCapsule(final String id) {
        return spaceXClientPort.getCapsuleById(id);
    }
}
