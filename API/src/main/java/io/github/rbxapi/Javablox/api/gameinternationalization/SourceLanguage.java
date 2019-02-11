package io.github.rbxapi.javablox.api.gameinternationalization;

public interface SourceLanguage {

    /**
     * https://gameinternationalization.roblox.com/docs#!/SourceLanguage/get_v1_source_language_games_gameId
     * @param gameId Game ID
     * @return Status
     */
    String getSourceLangauge(double gameId);

    /**
     * https://gameinternationalization.roblox.com/docs#!/SourceLanguage/patch_v1_source_language_games_gameId
     * @param gameId Game ID
     * @param languageCode Langauge Code
     * @return Status Code
     */
    String setSourceLangauge(double gameId, String languageCode);
}
