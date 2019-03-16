package io.github.rbxapi.javablox.api.locale;

public interface Locale {
    /**
     * https://locale.roblox.com/docs#!/Locale/get_v1_locales_supported_locales
     *
     * @return Locales
     */
    String getLocales();

    /**
     * https://locale.roblox.com/docs#!/Locale/get_v1_locales_user_locale
     *
     * @return Locale
     */
    String getUserLocale();

    /**
     * https://locale.roblox.com/docs#!/Locale/get_v1_locales_user_localization_locus_supported_locales
     *
     * @return Locale
     */
    String getUserLocusLocale();

    /**
     * https://locale.roblox.com/docs#!/Locale/post_v1_locales_set_user_supported_locale
     *
     * @param userRequest Locale
     * @return Boolean success
     */
    String setUserLocale(String userRequest);
}
