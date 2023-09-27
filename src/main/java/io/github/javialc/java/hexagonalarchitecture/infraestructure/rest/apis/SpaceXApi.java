package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.apis;

import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsuleDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsulesDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.FavouriteCapsuleRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * This interface represents the SpaceX API, which provides endpoints for retrieving and managing information about SpaceX capsules.
 */
@Validated
@RequestMapping("/api/v1/spacex")
public interface SpaceXApi {

    /**
     * Retrieves a CapsuleDto object by its ID.
     *
     * @param id the ID of the capsule to retrieve
     * @return the CapsuleDto object with the specified ID
     */
    @GetMapping("/capsules/{id}")
    CapsuleDto getCapsulesById(@PathVariable("id") String id);

    /**
     * Retrieves a list of capsules from the SpaceX API.
     *
     * @return a CapsulesDto object containing the list of capsules.
     */
    @GetMapping("/capsules")
    CapsulesDto getCapsules();

    /**
     * Retrieves the favourite capsules from the SpaceX API.
     *
     * @return a CapsulesDto object containing the favourite capsules.
     */
    @GetMapping("/favourite-capsules")
    CapsulesDto getFavouriteCapsules();

    /**
     * Adds a favourite capsule to the system.
     *
     * @param request the request containing the favourite capsule data.
     */
    @PostMapping("/favourite-capsules")
    void addFavouriteCapsule(@RequestBody FavouriteCapsuleRequest request);

    /**
     * Removes a favourite capsule with the given ID.
     *
     * @param id the ID of the favourite capsule to remove
     */
    @DeleteMapping("/favourite-capsules/{id}")
    void removeFavouriteCapsule(@PathVariable("id") String id);

}
