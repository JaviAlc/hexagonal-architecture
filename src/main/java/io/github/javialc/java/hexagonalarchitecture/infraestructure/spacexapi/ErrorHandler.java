package io.github.javialc.java.hexagonalarchitecture.infraestructure.spacexapi;


import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@Component
public class ErrorHandler implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        return response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError();
    }

    @Override
    public void handleError(ClientHttpResponse httpResponse) throws IOException {
            if (httpResponse.getStatusCode() == HttpStatus.NOT_FOUND) {
                //TODO change with custom exception
                throw new RuntimeException("Entity not found");
            }
    }
}
