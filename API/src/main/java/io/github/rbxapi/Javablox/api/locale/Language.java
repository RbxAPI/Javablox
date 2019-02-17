package io.github.rbxapi.javablox.api.locale;

public interface Language {
    /**
     * https://locale.roblox.com/docs#!/Language/get_v1_languages
     * @return Languages
     */
    String getLanguages();

    /**
     * https://locale.roblox.com/docs#!/Language/get_v1_languages_user_generated_content
     * @return Languages
     */
    String getUserContentLanguages();
}
