package rbxapi.javablox.api.user.account;

import rbxapi.javablox.api.user.account.info.Birthdate;
import rbxapi.javablox.client.JavabloxCallback;

public interface AccountInfo {

    void getBirthdate(JavabloxCallback<Birthdate> callback);

    void updateBirthdate(Birthdate birthdate, JavabloxCallback<Void> callback);
}
