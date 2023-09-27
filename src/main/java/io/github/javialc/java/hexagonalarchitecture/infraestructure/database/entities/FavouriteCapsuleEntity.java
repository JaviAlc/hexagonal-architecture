package io.github.javialc.java.hexagonalarchitecture.infraestructure.database.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "favourite_capsule")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class FavouriteCapsuleEntity {
    
    @Id
    private String id;
    private String capsuleId;
    private LocalDateTime addedAt;
}
