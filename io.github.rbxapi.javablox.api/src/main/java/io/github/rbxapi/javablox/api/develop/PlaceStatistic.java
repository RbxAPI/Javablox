package io.github.rbxapi.javablox.api.develop;

public interface PlaceStatistic {

    /**
     * https://develop.roblox.com/docs#!/Statistics/get_v1_places_placeId_stats_type
     *
     * @param placeId      The place id.
     * @param type         The place id.
     * @param granularity  Time interval?
     * @param divisionType Optional division type for the data.
     * @param startTime    Optional time of first sample.
     * @param endTime      Optional time of last sample.
     * @return Stats
     */
    String getPlaceStatistics(double placeId, String type, String granularity, String divisionType, String startTime, String endTime);
}
