package io.github.javialc.java.hexagonalarchitecture.infraestructure.database.mappers;

import io.github.javialc.java.hexagonalarchitecture.domain.models.FavouriteCapsule;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.database.entities.FavouriteCapsuleEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FavouriteCapsuleMapper {
    
    public FavouriteCapsule asFavouriteCapsule(FavouriteCapsuleEntity favouriteCapsuleEntity) {
        return FavouriteCapsule.builder()
                .id(favouriteCapsuleEntity.getId())
                .capsuleId(favouriteCapsuleEntity.getCapsuleId())
                .addedAt(favouriteCapsuleEntity.getAddedAt())
                .build();
    }
    
    public List<FavouriteCapsule> asFavouriteCapsules(List<FavouriteCapsuleEntity> favouriteCapsuleEntities) {
        return favouriteCapsuleEntities.stream()
                .map(this::asFavouriteCapsule)
                .toList();
    }

    public FavouriteCapsuleEntity asFavouriteCapsuleEntity(FavouriteCapsule favouriteCapsule) {
        return FavouriteCapsuleEntity.builder()
                .id(favouriteCapsule.getId())
                .capsuleId(favouriteCapsule.getCapsuleId())
                .addedAt(favouriteCapsule.getAddedAt())
                .build();
    }
}
