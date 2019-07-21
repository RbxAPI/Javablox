package rbxapi.javablox.callback.user.account;

import rbxapi.javablox.api.user.account.info.Birthdate;
import rbxapi.javablox.client.CallbackAdapter;
import rbxapi.javablox.client.JavabloxCallback;
import rbxapi.javablox.client.JavabloxClient;
import rbxapi.javablox.exception.*;
import retrofit2.Call;

public class AccountInfo implements rbxapi.javablox.api.user.account.AccountInfo {

    @Override
    public void getBirthdate(JavabloxCallback<Birthdate> callback) {
        Call<Birthdate> call = JavabloxClient.getInstance().accountInfo().getBirthdate();
        call.enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Birthdate convertResponse(Birthdate response) {
                return response;
            }

            @Override
            public void castEx(BaseJavabloxException[] ez, int status) {
                ez[0] = new AccessDeniedException(ez[0]);
            }
        });
    }

    @Override
    public void updateBirthdate(Birthdate birthdate, JavabloxCallback<Void> callback) {
        Call<Void> call = JavabloxClient.getInstance().accountInfo().updateBirthdate(birthdate);
        call.enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Void convertResponse(Void response) {
                return response;
            }

            @Override
            public void castEx(BaseJavabloxException[] ez, int status) {
                for (int i = 0; i < ez.length; i++)
                    switch (ez[i].getCode()) {
                        case 1:
                            ez[i] = new UserNotFoundException(ez[i]);
                            break;
                        case 4:
                        case 5:
                            ez[i] = new InvalidRequestBodyException(ez[i]);
                            break;
                        case 0:
                            ez[i] = status == 401 ? new AccessDeniedException(ez[i]) : new UnknownErrorException(ez[i]);
                            break;
                        case 2:
                            ez[i] = new PinLockedException(ez[i]);
                            break;

                    }
            }
        });
    }

}
