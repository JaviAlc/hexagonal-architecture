package io.github.javialc.java.hexagonalarchitecture.domain.ports.inbound;

import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsule;

import java.util.List;

public interface FavouriteCapsulesDataBasePort {
    
    void addFavouriteCapsule(String capsuleId);
    
    void removeFavouriteCapsule(String id);
    
    List<FavouriteCapsule> getFavouriteCapsules();
    
}
