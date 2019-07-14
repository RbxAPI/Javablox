package rbxapi.javablox.callback.user.account;

import rbxapi.javablox.api.user.account.info.Birthdate;
import rbxapi.javablox.client.JavabloxClient;
import retrofit2.Call;
import retrofit2.Callback;

public class AccountInfo implements rbxapi.javablox.api.user.account.AccountInfo {

    @Override
    public void getBirthdate(Callback<Birthdate> callback) {
        Call<Birthdate> call = JavabloxClient.getInstance().accountInfo().getBirthdate();
        call.enqueue(callback);
    }

    @Override
    public void updateBirthdate(Birthdate birthdate, Callback<Void> callback) {
        Call<Void> call = JavabloxClient.getInstance().accountInfo().updateBirthdate(birthdate);
        call.enqueue(callback);
    }

}
