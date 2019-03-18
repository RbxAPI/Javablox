package io.github.rbxapi.javablox;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.time.Duration;

/**
 * Net client for Javablox Endpoint
 */
public final class Client {
    private static HttpClient client;

    private Client() {
        client = HttpClient.newHttpClient();
    }

    private static HttpRequest.Builder genRequest(String filledUrl, String... strings) {
        return HttpRequest.newBuilder()
                .uri(URI.create(filledUrl))
                .timeout(Duration.ofSeconds(10))
                .header("Content-Type", "application/json")
                .headers(strings);
    }


}
