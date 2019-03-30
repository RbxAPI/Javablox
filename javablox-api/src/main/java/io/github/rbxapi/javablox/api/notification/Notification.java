package io.github.rbxapi.javablox.api.notification;

public interface Notification {
    /**
     * https://notifications.roblox.com/docs#!/Notifications/get_v2_notifications_get_settings
     *
     * @return Settings
     */
    String getNotificationSettings();

    /**
     * https://notifications.roblox.com/docs#!/Notifications/get_v2_notifications_settings_realtime
     *
     * @return Settings
     */
    String getRealtimeSettings();

    /**
     * https://notifications.roblox.com/docs#!/Notifications/post_v2_notifications_notification_source_types_allow
     *
     * @param requestModel Source Type
     * @return Status Code
     */
    String allowNotificationSource(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/Notifications/post_v2_notifications_notification_source_types_opt_out
     *
     * @param requestModel Model body
     * @return Status Code
     */
    String optOutNotificationSource(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/Notifications/post_v2_notifications_receiver_destination_types_allow
     *
     * @param requestModel Request
     * @return Status Code
     */
    String allowNotificationDestination(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/Notifications/post_v2_notifications_receiver_destination_types_opt_out
     *
     * @param requestModel Request
     * @return Status Code
     */
    String optOutNotificationDestination(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/Notifications/post_v2_notifications_update_destination_setting
     *
     * @param requestModel Destination
     * @return Status Code
     */
    String updateDestinationSettings(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/Notifications/post_v2_notifications_update_notification_settings
     *
     * @param requestModel Request
     * @return Status Code
     */
    String updateNotificationSettings(String requestModel);
}
