package io.github.javialc.java.hexagonalarchitecture.domain.models;

import java.io.Serial;
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

/**
 * Represents a capsule used by SpaceX.
 */
@Data
@Builder
public class Capsule implements Serializable {

    @Serial
    private static final long serialVersionUID = -1L;
    
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
