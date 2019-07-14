package rbxapi.javablox.api.user.account;

import rbxapi.javablox.api.user.account.info.Birthdate;
import retrofit2.Callback;

public interface AccountInfo {

    void getBirthdate(Callback<Birthdate> callback);

    void updateBirthdate(Birthdate birthdate, Callback<Void> callback);
}
