package io.github.rbxapi.javablox.api.thumbnails;

public interface Assets {

    /**
     * https://thumbnails.roblox.com/docs#!/Assets/get_v1_assets
     *
     * @param assetIds Assets
     * @param size     Enum, pixels
     * @param format   file format(e.g. png), however should support PNG only.
     * @return data
     */
    String getAssetThumbnails(double[] assetIds, String size, int format);
}
