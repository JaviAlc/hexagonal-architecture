package io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.adapters;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;
import io.github.javialc.java.hexagonalarchitecture.domain.ports.inbound.SpaceXClientPort;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.clients.SpaceXClient;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.mappers.SpaceXMapper;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.models.SpaceXCapsule;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class SpaceXClientAdapter implements SpaceXClientPort {


    private final SpaceXClient spaceXClient;
    private final SpaceXMapper spaceXMapper;

    @Override
    public Capsule getCapsuleById(String id) {
        SpaceXCapsule spaceXCapsule = spaceXClient.retrieveCapsule(id);
        return spaceXMapper.aCapsule(spaceXCapsule);
    }

    @Override
    public List<Capsule> getCapsules() {
        List<SpaceXCapsule> spaceXCapsules = spaceXClient.retrieveCapsules();
        return spaceXMapper.aCapsules(spaceXCapsules);
    }
}
