package io.github.rbxapi.javablox.api.notification;

public interface PushNotification {

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/get_v2_push_notifications_chrome_manifest
     *
     * @return Name and GCM sender ID
     */
    String getChromeManifest();

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/get_v2_push_notifications_get_current_device_destination
     *
     * @return Destination
     */
    String getCurrentDeviceDestination();

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/get_v2_push_notifications_get_destinations
     *
     * @return Destinations
     */
    String getUserDestinations();

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/get_v2_push_notifications_metadata
     *
     * @param notificationToken Token
     * @param notificationId    ID
     * @return Metadata
     */
    String getMetadata(String notificationToken, String notificationId);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/get_v2_push_notifications_notification_ids
     *
     * @param notificationToken Token
     * @param limit             Limit of IDs to get
     * @param cursor            Starting point
     * @return IDs
     */
    String getIDsByToken(String notificationToken, int limit, int cursor);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_deregister_all_devices
     *
     * @return Status Message
     */
    String deregisterAllDevices();

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_deregister_current_device
     *
     * @return Status Message
     */
    String deregisterCurrentDevice();

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_mark_as_read
     *
     * @param requestModel Platform and Notification ID
     * @return Status Message
     */
    String markAsRead(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_mark_category_as_read
     *
     * @param requestModel Notification Type, Category and LatestNotificationID
     * @return Status Message
     */
    String markCategoryAsRead(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_mark_interaction
     *
     * @param requestModel 4 var
     * @return Status Message
     */
    String markInteraction(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_register_android_amazon
     *
     * @param requestModel Request Model
     * @return Registration
     */
    String registerAndroidAmazon(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_register_android_native
     *
     * @param requestModel Request Model
     * @return Registration
     */
    String registerAndroidNative(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_register_chrome
     *
     * @param requestModel Request Model
     * @return Registration
     */
    String registerChrome(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_register_firefox
     *
     * @param requestModel Request Model
     * @return Registration
     */
    String registerFirefox(String requestModel);

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/post_v2_push_notifications_register_ios_native
     *
     * @param requestModel Request Model
     * @return Registration
     */
    String registerIOSNative(String requestModel);
}
