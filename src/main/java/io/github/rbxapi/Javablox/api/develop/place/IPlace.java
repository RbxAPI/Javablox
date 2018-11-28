package io.github.rbxapi.Javablox.api.develop.place;

public interface IPlace {

    /**
     * https://develop.roblox.com/docs#!/Places/get_v1_places_placeId_compatibilities
     *
     * @param placeId place id
     * @return compatibilities
     */
    String getCompatibility(double placeId);

    /**
     * @param placeId       place id
     * @param configuration new config
     * @return status
     */
    String setCompatibility(double placeId, String configuration);
}
