package io.github.rbxapi.javablox.api.metrics;

public interface ThumbnailMetrics {

    /**
     * https://metrics.roblox.com/docs#!/ThumbnailMetrics/post_v1_thumbnails_load
     *
     * @param request Duration (number)
     * @return Status Code
     */
    String load(String request);
}
