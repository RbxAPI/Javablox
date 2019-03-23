package io.github.rbxapi.javablox.api.thumbnails;

public interface Games {

    /**
     * https://thumbnails.roblox.com/docs#!/Games/get_v1_games_universeId_thumbnails
     *
     * @param universeId   Universe
     * @param thumbnailIds Thumbnails
     * @param size         Size(Default=768x432)
     * @param format       Format
     * @return data
     */
    String getUniverseThumbnails(double universeId, double[] thumbnailIds, String size, int format);

    /**
     * https://thumbnails.roblox.com/docs#!/Games/get_v1_games_icons
     *
     * @param universeIds Universes
     * @param size        Size(Default=50x50)
     * @param format      Format
     * @return data
     */
    String getUniverseIcons(double[] universeIds, String size, int format);

    /**
     * https://thumbnails.roblox.com/docs#!/Games/get_v1_games_multiget_thumbnails
     *
     * @param universeIds      Universes
     * @param countPerUniverse array size
     * @param defaults         return if no media found?
     * @param size             Size(Default=768x432)
     * @param format           Format
     * @return data
     */
    String multigetUniverseThumbnails(double[] universeIds, int countPerUniverse, boolean defaults, String size, int format);
}
