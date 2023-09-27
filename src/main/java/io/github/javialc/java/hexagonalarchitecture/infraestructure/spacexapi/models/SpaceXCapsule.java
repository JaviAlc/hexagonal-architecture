package io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class SpaceXCapsule {

    /**
     * The unique identifier of the capsule.
     */
    private String id;
    
    /**
     * The number of times the capsule has been reused.
     */
    @JsonProperty("reuse_count")
    private Integer reuseCount;
    
    /**
     * The number of times the capsule has landed on water.
     */
    @JsonProperty("water_landings")
    private Integer waterLandings;
    
    /**
     * The number of times the capsule has landed on land.
     */
    @JsonProperty("land_landings")
    private Integer landLandings;
    
    /**
     * The date and time when the capsule was last updated.
     */
    @JsonProperty("last_update")
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
