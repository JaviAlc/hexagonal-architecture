package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.controllers;

import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsules;
import io.github.javialc.java.hexagonalarchitecture.domain.services.FavouriteCapsulesService;
import io.github.javialc.java.hexagonalarchitecture.domain.services.SpaceXService;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.apis.SpaceXApi;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsuleDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsulesDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.FavouriteCapsuleRequest;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.mappers.SpaceXDtoMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SpaceXController implements SpaceXApi {
    
    private final SpaceXService spaceXService;
    private final FavouriteCapsulesService favouriteCapsuleServicePort;
    private final SpaceXDtoMapper spaceXDtoMapper;
    
    @Override
    public CapsuleDto getCapsulesById(final String id) {
        return spaceXDtoMapper.asCapsuleDto(spaceXService.getCapsule(id));
        
    }

    @Override
    public CapsulesDto getCapsules() {
        final List<CapsuleDto> capsules =  spaceXDtoMapper.asCapsulesDto(spaceXService.getCapsules());
        return CapsulesDto.builder().capsules(capsules).build();
    }

    @Override
    public CapsulesDto getFavouriteCapsules() {
        FavouriteCapsules favouriteCapsules = favouriteCapsuleServicePort.getFavouriteCapsules();
        return CapsulesDto.builder()
                .capsules(spaceXDtoMapper.asCapsulesDto(favouriteCapsules.getCapsules()))
                .build();
    }

    @Override
    public void addFavouriteCapsule(final FavouriteCapsuleRequest request) {
        favouriteCapsuleServicePort.addFavouriteCapsule(request.getCapsuleId());
    }

    @Override
    public void removeFavouriteCapsule(String id) {
        favouriteCapsuleServicePort.removeFavouriteCapsule(id);

    }
}
