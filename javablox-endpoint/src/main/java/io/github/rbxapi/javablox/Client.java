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
    private static HttpClient client = HttpClient.newHttpClient();

    private static HttpRequest.Builder genRequest(String filledUrl) {
        return HttpRequest.newBuilder()
                .uri(URI.create(filledUrl))
                .timeout(Duration.ofSeconds(10))
                .header("Content-Type", "application/json");
    }

    private static HttpRequest.Builder genRequest(String filledUrl, String... headers) {
        return genRequest(filledUrl).headers(headers);
    }

    private static CompletableFuture<String> getStringCompletableFuture(HttpRequest request) {
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body);
    }

    /**
     * Performs HTTP GET request.
     * @param filledUrl URL with parameters filled in
     * @param headers Additional headers
     * @return Future for the response.
     */
    public static CompletableFuture<String> get(String filledUrl, String... headers) {
        HttpRequest request = genRequest(filledUrl, headers).GET().build();
        return getStringCompletableFuture(request);
    }

    public static CompletableFuture<String> get(String filledUrl) {
        HttpRequest request = genRequest(filledUrl).GET().build();
        return getStringCompletableFuture(request);
    }

    public static CompletableFuture<String> post(String filledUrl, String... headers) {
        HttpRequest request = genRequest(filledUrl, headers).POST(HttpRequest.BodyPublishers.noBody()).build();
        return getStringCompletableFuture(request);
    }

    public static CompletableFuture<String> post(String filledUrl) {
        HttpRequest request = genRequest(filledUrl).POST(HttpRequest.BodyPublishers.noBody()).build();
        return getStringCompletableFuture(request);
    }

}
