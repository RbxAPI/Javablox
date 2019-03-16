package io.github.rbxapi.javablox.api.notification;

public interface NotificationStream {

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/get_v2_stream_notifications_get_latest_game_updates
     *
     * @param universeIds   Universes
     * @param sinceDateTime Since
     * @return Stream
     */
    String getLatestGameUpdates(double[] universeIds, String sinceDateTime);

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/get_v2_stream_notifications_get_prompt_settings
     *
     * @return Settings
     */
    String getPromptSettings();

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/get_v2_stream_notifications_get_recent
     *
     * @param startIndex Start, Default=0
     * @param maxRows    Limit, Default=10
     * @return Recent notifications
     */
    String getRecent(int startIndex, int maxRows);

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/get_v2_stream_notifications_unread_count
     *
     * @return Count and Status Msg
     */
    String getUnreadCount();

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/post_v2_stream_notifications_clear_unread
     *
     * @return Status Message
     */
    String clearUnread();

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/post_v2_stream_notifications_game_update_notification_interacted
     *
     * @param requestModel {
     *                     "universeId": 0,
     *                     "createdOnKey": "string",
     *                     "interactionType": "Unknown",
     *                     "currentUserId": 0
     *                     }
     * @return Status message
     */
    String gameUpdateNotificationInteracted(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/post_v2_stream_notifications_game_update_notification_read
     *
     * @param requestModel Universe, CreateOn(String), CurrentUserID
     * @return Status Message
     */
    String gameUpdateNotificationRead(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/post_v2_stream_notifications_mark_interacted
     *
     * @param requestModel Event
     * @return Status Message
     */
    String markInteracted(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/NotificationStream/post_v2_stream_notifications_suppress_prompt
     *
     * @return Status Message
     */
    String suppressPrompt();
}
