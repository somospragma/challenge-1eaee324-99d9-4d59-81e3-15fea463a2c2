package com.example.microservice;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ExternalServiceClient {
    private final WebClient webClient;

    public ExternalServiceClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://external-service").build();
    }

    public String callExternalService() {
        return webClient.get()
               .retrieve()
               .bodyToMono(String.class)
               .block();
    }
}