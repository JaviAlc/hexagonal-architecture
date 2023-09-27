package io.github.javialc.java.hexagonalarchitecture.domain.services;

import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsules;

public interface FavouriteCapsulesService {

    void addFavouriteCapsule(String capsuleId);

    void removeFavouriteCapsule(String id);

    FavouriteCapsules getFavouriteCapsules();

}
