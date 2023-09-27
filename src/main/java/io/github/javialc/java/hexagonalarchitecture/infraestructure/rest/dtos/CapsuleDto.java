package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class CapsuleDto implements Serializable {
    /**
     * The unique identifier of the capsule.
     */
    private String id;

    /**
     * The number of times the capsule has been reused.
     */
    private Integer reuseCount;

    /**
     * The number of times the capsule has landed on water.
     */
    private Integer waterLandings;

    /**
     * The number of times the capsule has landed on land.
     */
    private Integer landLandings;

    /**
     * The date and time when the capsule was last updated.
     */
    private String lastUpdate;

    /**
     * An array of launch IDs associated with the capsule.
     */
    private String[] launches;

    /**
     * The serial number of the capsule.
     */
    private String serial;

    /**
     * The status of the capsule.
     */
    private String status;

    /**
     * The type of the capsule.
     */
    private String type;
}
