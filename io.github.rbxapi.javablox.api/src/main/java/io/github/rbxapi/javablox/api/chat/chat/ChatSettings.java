package io.github.rbxapi.javablox.api.chat.chat;

/**
 * https://chat.roblox.com/docs#!/Chat
 */
public interface ChatSettings {

    /**
     * For every authenticated user, the clients hit this endpoint to get the chat related settings.
     * https://chat.roblox.com/docs#!/Chat/get_v2_chat_settings
     *
     * @return {
     * "chatEnabled": true,
     * "hasSentChatMessageRecently": true
     * }
     */
    String getChatSettings();

    /**
     * Gets the rollout settings for requested feature
     * https://chat.roblox.com/docs#!/Chat/get_v2_get_rollout_settings
     *
     * @param featureNames string array to request feature rollout settings
     * @return {
     * "rolloutFeatures": [
     * {
     * "featureName": "LuaChat",
     * "isRolloutEnabled": true
     * }
     * ]
     * }
     */
    String getRolloutSettings(String[] featureNames);

}
