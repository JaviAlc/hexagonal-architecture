package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.apis;

import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsuleDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsulesDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.FavouriteCapsuleRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
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
    @Operation(description = "Find a SpaceX Capsule by Id", tags = { "SpaceX" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "SpaceX capsule found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CapsuleDto.class))}),
            @ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    
    CapsuleDto getCapsulesById(@PathVariable("id") String id);

    /**
     * Retrieves a list of capsules from the SpaceX API.
     *
     * @return a CapsulesDto object containing the list of capsules.
     */
    @GetMapping("/capsules")
    @Operation(description = "Find all SpaceX Capsules", tags = { "SpaceX" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "SpaceX capsules retrieved", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CapsulesDto.class))}),
            @ApiResponse(responseCode = "404", description = "Product not found", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    CapsulesDto getCapsules();

    /**
     * Retrieves the favourite capsules from the SpaceX API.
     *
     * @return a CapsulesDto object containing the favourite capsules.
     */
    @GetMapping("/favourite-capsules")
    @Operation(description = "Find all SpaceX Favourite Capsules", tags = { "SpaceX" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Favourite capsules retrieved", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = CapsulesDto.class))}),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    CapsulesDto getFavouriteCapsules();

    /**
     * Adds a favourite capsule to the system.
     *
     * @param request the request containing the favourite capsule data.
     */
    @PostMapping("/favourite-capsules")
    @Operation(description = "Add a SpaceX Favourite Capsule", tags = { "SpaceX" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Added capsule to favourites."),
            @ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    void addFavouriteCapsule(@RequestBody FavouriteCapsuleRequest request);

    /**
     * Removes a favourite capsule with the given ID.
     *
     * @param id the ID of the favourite capsule to remove
     */
    @DeleteMapping("/favourite-capsules/{id}")
    @Operation(description = "Remove a SpaceX Favourite Capsule", tags = { "SpaceX" })
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Remove capsule from favourites successfully"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content)
    })
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void removeFavouriteCapsule(@PathVariable("id") String id);

}
