package io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.clients;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.ErrorHandler;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi.models.SpaceXCapsule;
import lombok.AllArgsConstructor;

@Service
public class SpaceXClient {
    

    private static final String BASE_URL = "https://api.spacexdata.com/v4";
    private static final String CAPSULES_URL = BASE_URL + "/capsules";
    private static final String CAPSULE_URL = CAPSULES_URL + "/{id}";

    private final RestTemplate restTemplate = new RestTemplate();

    public SpaceXClient() {
        restTemplate.setErrorHandler(new ErrorHandler());
        
    }

    public SpaceXCapsule retrieveCapsule(String id) {
        Map<String,Object> params = new HashMap<>();
        params.put("id", id);
        ResponseEntity<SpaceXCapsule> response = restTemplate.getForEntity(CAPSULE_URL, SpaceXCapsule.class, params);
        return response.getBody();
    }


    public List<SpaceXCapsule> retrieveCapsules() {
        ResponseEntity<List<SpaceXCapsule>> response = restTemplate.exchange(
            CAPSULES_URL,HttpMethod.GET,null, new ParameterizedTypeReference<>() {
                });
        return response.getBody();
    }


}
