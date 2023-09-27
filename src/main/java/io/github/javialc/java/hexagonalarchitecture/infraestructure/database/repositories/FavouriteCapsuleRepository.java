package io.github.javialc.java.hexagonalarchitecture.infraestructure.database.repositories;

import io.github.javialc.java.hexagonalarchitecture.infraestructure.database.entities.FavouriteCapsuleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavouriteCapsuleRepository extends JpaRepository<FavouriteCapsuleEntity, String> {
    
    boolean existsByCapsuleId(String capsuleId);
    
}
