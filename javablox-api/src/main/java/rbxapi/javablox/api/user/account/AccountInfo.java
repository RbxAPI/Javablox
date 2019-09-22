package rbxapi.javablox.api.user.account;

import rbxapi.javablox.client.JavabloxResponseCallback;
import rbxapi.javablox.data.Gender;

public interface AccountInfo {

    void getBirthdate(JavabloxResponseCallback<Birthdate> callback);

    void updateBirthdate(Birthdate birthdate, JavabloxResponseCallback<Void> callback);

    void getDescription(JavabloxResponseCallback<String> callback);

    void setDescription(String description, JavabloxResponseCallback<Void> callback);

    void getGender(JavabloxResponseCallback<Gender> callback);

    void setGender(Gender gender, JavabloxResponseCallback<Void> callback);

    void getXboxConsecutiveLoginDays(JavabloxResponseCallback<Integer> callback);

    void fetchMetadata(JavabloxResponseCallback callback);

    boolean isDescriptionEnabled();

    boolean isBirthdateEnabled();

    boolean isGenderEnabled();

    boolean isPromotionChannelEnabled();

    boolean isAllowedNotificationsEndpointDisabled();

    boolean isAccountSettingsPolicyEnabled();

    boolean isPhoneNumberEnabled();
}
