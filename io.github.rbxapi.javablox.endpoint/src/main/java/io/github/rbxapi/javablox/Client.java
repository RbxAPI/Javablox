package io.github.rbxapi.javablox;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

/**
 * Net client for Javablox Endpoint
 */
public final class Client {
    private static HttpClient client;

    private Client() {
        client = HttpClient.newHttpClient();
    }

    private static HttpRequest.Builder genRequest(String filledUrl, String... headers) {
        return HttpRequest.newBuilder()
                .uri(URI.create(filledUrl))
                .timeout(Duration.ofSeconds(10))
                .header("Content-Type", "application/json")
                .headers(headers);
    }

    /**
     * Performs HTTP GET request.
     * @param filledUrl URL with parameters filled in
     * @param headers Additional headers
     * @return Future for the response.
     */
    public static CompletableFuture<String> get(String filledUrl, String... headers) {
        HttpRequest request = genRequest(filledUrl, headers).GET().build();
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .exceptionally(e -> null)
                .thenApply(HttpResponse::body);

    }

}
