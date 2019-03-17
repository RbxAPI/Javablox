package io.github.rbxapi.javablox.api.thumbnails;

public interface Bundles {

    /**
     * https://thumbnails.roblox.com/docs#!/Bundles/get_v1_bundles_thumbnails
     *
     * @param bundleIds Bundles
     * @param size      Size
     * @param format    Format
     * @return data
     */
    String getBundleThumbnails(double bundleIds, String size, int format);
}
