package rbxapi.javablox.callback.user.account;

import rbxapi.javablox.api.user.account.info.Birthdate;
import rbxapi.javablox.client.CallbackAdapter;
import rbxapi.javablox.client.JavabloxCallback;
import rbxapi.javablox.client.JavabloxClient;
import rbxapi.javablox.exception.*;
import rbxapi.javablox.model.Description;
import rbxapi.javablox.model.Gender;

import java.util.stream.IntStream;

public class AccountInfo implements rbxapi.javablox.api.user.account.AccountInfo {

    @Override
    public void getBirthdate(JavabloxCallback<Birthdate> callback) {
        JavabloxClient.getInstance().accountInfo().getBirthdate().enqueue(new CallbackAdapter<>(callback) {
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
        JavabloxClient.getInstance().accountInfo().updateBirthdate(birthdate).enqueue(new CallbackAdapter<>(callback) {
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

    @Override
    public void getDescription(JavabloxCallback<String> callback) {
        JavabloxClient.getInstance().accountInfo().getDescription().enqueue(new CallbackAdapter<>(callback) {
            @Override
            public String convertResponse(Description response) {
                return response.getDescription();
            }

            @Override
            public void castEx(BaseJavabloxException[] ez, int status) {
                IntStream.range(0, ez.length).forEach(i -> ez[i] = ez[i].getCode() == 0 ? new AccessDeniedException(ez[i]) : new UserNotFoundException(ez[i]));
            }
        });
    }

    @Override
    public void setDescription(String description, JavabloxCallback<Void> callback) {
        JavabloxClient.getInstance().accountInfo().setDescription(new Description(description)).enqueue(new CallbackAdapter<>(callback) {
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
                        case 0:
                            ez[i] = status == 500 ? new UnknownErrorException(ez[i]) : new AccessDeniedException(ez[i]);
                            break;
                        case 2:
                            ez[i] = new PinLockedException(ez[i]);
                            break;
                        case 3:
                            ez[i] = new FeatureDisabledException(ez[i]);
                    }
            }
        });
    }

    @Override
    public void getGender(JavabloxCallback<Gender> callback) {
        JavabloxClient.getInstance().accountInfo().getGender().enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Gender convertResponse(Gender response) {
                return response;
            }

            @Override
            public void castEx(BaseJavabloxException[] ez, int status) {
                IntStream.range(0, ez.length).forEach(i -> ez[i] = ez[i].getCode() == 0 ? new AccessDeniedException(ez[i]) : new UserNotFoundException(ez[i]));
            }
        });
    }

    @Override
    public void setGender(Gender gender, JavabloxCallback<Void> callback) {
        JavabloxClient.getInstance().accountInfo().setGender(gender).enqueue(new CallbackAdapter<>(callback) {
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
                        case 6:
                            ez[i] = new InvalidRequestBodyException(ez[i]);
                            break;
                        case 0:
                            ez[i] = status == 500 ? new UnknownErrorException(ez[i]) : new AccessDeniedException(ez[i]);
                            break;
                        case 2:
                            ez[i] = new PinLockedException(ez[i]);
                            break;
                    }
            }
        });
    }

}
