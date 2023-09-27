package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.mappers;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsuleDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpaceXDtoMapper {
    
    public CapsuleDto asCapsuleDto(Capsule capsule) {
        return CapsuleDto.builder()
                .id(capsule.getId())
                .reuseCount(capsule.getReuseCount())
                .type(capsule.getType())
                .status(capsule.getStatus())
                .lastUpdate(capsule.getLastUpdate())
                .landLandings(capsule.getLandLandings())
                .waterLandings(capsule.getWaterLandings())
                .serial(capsule.getSerial())
                .launches(capsule.getLaunches())
                .build();
    }
    
    public List<CapsuleDto> asCapsulesDto(List<Capsule> capsules) {
        return capsules.stream()
                .map(this::asCapsuleDto)
                .toList();
    }
}
