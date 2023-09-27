package io.github.javialc.java.hexagonalarchitecture.application.service.impl;

import io.github.javialc.java.hexagonalarchitecture.domain.models.Capsule;
import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsule;
import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsules;
import io.github.javialc.java.hexagonalarchitecture.domain.ports.inbound.FavouriteCapsulesDataBasePort;
import io.github.javialc.java.hexagonalarchitecture.domain.ports.inbound.SpaceXClientPort;
import io.github.javialc.java.hexagonalarchitecture.domain.services.FavouriteCapsulesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FavouriteCapsulesServiceImpl implements FavouriteCapsulesService {
    
    private final FavouriteCapsulesDataBasePort favouriteCapsulesDataBasePort;
    private final SpaceXClientPort spaceXClientPort;
    
    @Override
    public void addFavouriteCapsule(final String capsuleId) {
        favouriteCapsulesDataBasePort.addFavouriteCapsule(capsuleId);
    }

    @Override
    public void removeFavouriteCapsule(final String id) {
        favouriteCapsulesDataBasePort.removeFavouriteCapsule(id);
    }

    @Override
    public FavouriteCapsules getFavouriteCapsules() {
        final List<FavouriteCapsule> favouriteCapsules = favouriteCapsulesDataBasePort.getFavouriteCapsules();
        final List<Capsule> capsules = favouriteCapsules.stream()
                .map(f -> spaceXClientPort.getCapsuleById(f.getCapsuleId()))
                .toList();
        return FavouriteCapsules.builder().capsules(capsules).build();
    }
}
