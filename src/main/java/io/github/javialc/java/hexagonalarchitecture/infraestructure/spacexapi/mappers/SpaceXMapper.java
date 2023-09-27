package io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.mappers;

import java.util.List;

import org.springframework.stereotype.Component;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.models.SpaceXCapsule;


@Component
public class SpaceXMapper {
    
    public Capsule aCapsule(SpaceXCapsule spaceXCapsule) {
        return Capsule.builder()
                .id(spaceXCapsule.getId())
                .reuseCount(spaceXCapsule.getReuseCount())
                .waterLandings(spaceXCapsule.getWaterLandings())
                .landLandings(spaceXCapsule.getLandLandings())
                .lastUpdate(spaceXCapsule.getLastUpdate())
                .launches(spaceXCapsule.getLaunches())
                .serial(spaceXCapsule.getSerial())
                .status(spaceXCapsule.getStatus())
                .type(spaceXCapsule.getType())
                .build();
    }

    public List<Capsule> aCapsules(List<SpaceXCapsule> spaceXCapsules) {
        return spaceXCapsules.stream()
                .map(this::aCapsule)
                .toList();
    }

}
