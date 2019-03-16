package io.github.rbxapi.javablox.api.accountsettings.privacysettings;

/**
 * https://accountsettings.roblox.com/docs#/PrivacySettings
 */
public interface GameChatPrivacy {

    /**
     * Get a user's game chat privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/get_v1_game_chat_privacy
     *
     * @return {
     * "gameChatPrivacy": "string"
     * }
     */
    String getGameChatPrivacy();

    /**
     * Updates a user's game chat privacy setting
     * https://accountsettings.roblox.com/docs#!/PrivacySettings/post_v1_game_chat_privacy
     *
     * @param model {
     *              "gameChatPrivacy": "NoOne"
     *              }
     * @return {}
     */
    String setGameChatPrivacy(String model);
}
