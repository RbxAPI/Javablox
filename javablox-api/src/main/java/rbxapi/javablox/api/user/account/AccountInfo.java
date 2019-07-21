package rbxapi.javablox.api.user.account;

import rbxapi.javablox.api.user.account.info.Birthdate;
import rbxapi.javablox.client.JavabloxCallback;
import rbxapi.javablox.model.Gender;

public interface AccountInfo {

    void getBirthdate(JavabloxCallback<Birthdate> callback);

    void updateBirthdate(Birthdate birthdate, JavabloxCallback<Void> callback);

    void getDescription(JavabloxCallback<String> callback);

    void setDescription(String description, JavabloxCallback<Void> callback);

    void getGender(JavabloxCallback<Gender> callback);

    void setGender(Gender gender, JavabloxCallback<Void> callback);
}
