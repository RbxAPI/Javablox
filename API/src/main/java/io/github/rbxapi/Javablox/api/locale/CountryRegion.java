package io.github.rbxapi.javablox.api.locale;

public interface CountryRegion {
    /**
     * https://locale.roblox.com/docs#!/CountryRegions/get_v1_country_regions
     * @return Regions
     */
    String getCountryRegions();

    /**
     * https://locale.roblox.com/docs#!/CountryRegions/get_v1_country_regions_user_country_region
     * @return Region
     */
    String getUserCountryRegion();

    /**
     * https://locale.roblox.com/docs#!/CountryRegions/patch_v1_country_regions_user_country_region
     * @param userRequest int countryId
     * @return boolean success
     */
    String setUserCountryRegion(String userRequest);
}
