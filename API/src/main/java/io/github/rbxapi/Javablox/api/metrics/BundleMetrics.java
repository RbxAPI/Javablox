package io.github.rbxapi.javablox.api.metrics;

public interface BundleMetrics {

    /**
     * https://metrics.roblox.com/docs#!/BundleMetrics/post_v1_bundle_metrics_report
     * @param request Bundle request
     * @return Status Code
     */
    String report(String request);
}
