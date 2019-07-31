package rbxapi.javablox.api.user.account;

import rbxapi.javablox.api.user.account.info.Birthdate;
import rbxapi.javablox.client.JavabloxResponseCallback;
import rbxapi.javablox.model.Gender;

public interface AccountInfo {

    void getBirthdate(JavabloxResponseCallback<Birthdate> callback);

    void updateBirthdate(Birthdate birthdate, JavabloxResponseCallback<Void> callback);

    void getDescription(JavabloxResponseCallback<String> callback);

    void setDescription(String description, JavabloxResponseCallback<Void> callback);

    void getGender(JavabloxResponseCallback<Gender> callback);

    void setGender(Gender gender, JavabloxResponseCallback<Void> callback);
}
