package io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.apis;

import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsuleDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.CapsulesDto;
import io.github.javialc.java.hexagonalarchitecture.infraestructure.rest.dtos.FavouriteCapsuleRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RequestMapping("/api/v1/spacex")
public interface SpaceXApi {

    @GetMapping("/capsules/{id}")
    CapsuleDto getCapsulesById(@PathVariable("id") String id);

    @GetMapping("/capsules")
    CapsulesDto getCapsules();

    @GetMapping("/favourite-capsules")
    CapsulesDto getFavouriteCapsules();

    @PostMapping("/favourite-capsules")
    void addFavouriteCapsule(@RequestBody FavouriteCapsuleRequest request);

    @DeleteMapping("/favourite-capsules/{id}")
    void removeFavouriteCapsule(@PathVariable("id") String id);

}
