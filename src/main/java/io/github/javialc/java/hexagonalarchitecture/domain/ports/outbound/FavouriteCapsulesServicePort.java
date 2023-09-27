package io.github.javialc.java.hexagonalarchitecture.domain.ports.outbound;

import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsules;

public interface FavouriteCapsulesServicePort {

    void addFavouriteCapsule(String capsuleId);

    void removeFavouriteCapsule(String id);

    FavouriteCapsules getFavouriteCapsules();

}
