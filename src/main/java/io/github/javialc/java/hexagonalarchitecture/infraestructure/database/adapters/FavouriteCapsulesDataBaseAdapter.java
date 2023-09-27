package io.github.javialc.java.hexagonalarchitecture.infraestructure.database.adapters;

import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsule;
import io.github.javialc.java.hexagonalarchitecture.domain.ports.inbound.FavouriteCapsulesDataBasePort;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.database.entities.FavouriteCapsuleEntity;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.database.mappers.FavouriteCapsuleMapper;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.database.repositories.FavouriteCapsuleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Component
@AllArgsConstructor
public class FavouriteCapsulesDataBaseAdapter implements FavouriteCapsulesDataBasePort {

    private final FavouriteCapsuleRepository favouriteCapsulesRepository;
    private final FavouriteCapsuleMapper favouriteCapsuleMapper;

    @Override
    public void addFavouriteCapsule(final String capsuleId) {
        if (!favouriteCapsulesRepository.existsByCapsuleId(capsuleId)) {
            final FavouriteCapsuleEntity favouriteCapsuleEntity = FavouriteCapsuleEntity.builder()
                    .id(UUID.randomUUID().toString())
                    .capsuleId(capsuleId)
                    .addedAt(LocalDateTime.now())
                    .build();
            favouriteCapsulesRepository.save(favouriteCapsuleEntity);
        }
    }

    @Override
    public void removeFavouriteCapsule(final String id) {
        favouriteCapsulesRepository.deleteById(id);
    }

    @Override
    public List<FavouriteCapsule> getFavouriteCapsules() {
        final List<FavouriteCapsuleEntity> favouriteCapsuleEntities = favouriteCapsulesRepository.findAll();
        return favouriteCapsuleMapper.asFavouriteCapsules(favouriteCapsuleEntities);
    }
}
