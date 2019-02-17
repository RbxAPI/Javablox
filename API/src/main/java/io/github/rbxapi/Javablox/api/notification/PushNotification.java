package io.github.rbxapi.javablox.api.notification;

public interface PushNotification {
    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/get_v2_push_notifications_get_current_device_destination
     * @return Destination
     */
    String getCurrentDeviceDestination();

    /**
     * https://notifications.roblox.com/docs#!/PushNotifications/get_v2_push_notifications_get_destinations
     * @return Destinations
     */
    String getUserDestinations();
}
