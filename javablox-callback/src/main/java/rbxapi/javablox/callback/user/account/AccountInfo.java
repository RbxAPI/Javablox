package rbxapi.javablox.callback.user.account;

import rbxapi.javablox.api.user.account.Birthdate;
import rbxapi.javablox.data.AccountInfoMetadata;
import rbxapi.javablox.client.CallbackAdapter;
import rbxapi.javablox.client.JavabloxResponseCallback;
import rbxapi.javablox.data.Count;
import rbxapi.javablox.data.Description;
import rbxapi.javablox.data.Gender;
import rbxapi.javablox.data.JavabloxException;
import rbxapi.javablox.svc.AccountInfoService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AccountInfo implements rbxapi.javablox.api.user.account.AccountInfo {
    private AccountInfoService svc;
    private AccountInfoMetadata metadata;

    public AccountInfo(AccountInfoService svc) {
        this.svc = svc;
    }

    @Override
    public void getBirthdate(JavabloxResponseCallback<Birthdate> callback) {
        svc.getBirthdate().enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Birthdate convertResponse(Birthdate response) {
                return response;
            }

            @Override
            public void onExceptions(JavabloxException[] ez, int status) {
                callback.onAccessDenied(ez[0]);
            }
        });
    }

    @Override
    public void updateBirthdate(Birthdate birthdate, JavabloxResponseCallback<Void> callback) {
        svc.updateBirthdate(birthdate).enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Void convertResponse(Void response) {
                return response;
            }

            @Override
            public void onExceptions(JavabloxException[] ez, int status) {
                for (JavabloxException e : ez)
                    switch (e.getCode()) {
                        case 1:
                            callback.onUserNotFound(e);
                            break;
                        case 4:
                        case 5:
                            callback.onInvalidRequestBody(e);
                            break;
                        case 0:
                            if (status == 401) callback.onAccessDenied(e);
                            else callback.onUnknownError(e);
                            break;
                        case 2:
                            callback.onPinLocked(e);
                    }
            }
        });
    }

    @Override
    public void getDescription(JavabloxResponseCallback<String> callback) {
        svc.getDescription().enqueue(new CallbackAdapter<>(callback) {
            @Override
            public String convertResponse(Description response) {
                return response.getDescription();
            }

            @Override
            public void onExceptions(JavabloxException[] ez, int status) {
                for (JavabloxException e : ez)
                    if (e.getCode() == 0) callback.onAccessDenied(e);
                    else callback.onUserNotFound(e);
            }
        });
    }

    @Override
    public void setDescription(String description, JavabloxResponseCallback<Void> callback) {
        svc.setDescription(new Description(description)).enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Void convertResponse(Void response) {
                return response;
            }

            @Override
            public void onExceptions(JavabloxException[] ez, int status) {
                for (JavabloxException e : ez)
                    switch (e.getCode()) {
                        case 1:
                            callback.onUserNotFound(e);
                            break;
                        case 0:
                            if (status == 500) callback.onUnknownError(e);
                            else callback.onAccessDenied(e);
                            break;
                        case 2:
                            callback.onPinLocked(e);
                            break;
                        case 3:
                            callback.onFeatureDisabled(e);
                    }
            }
        });
    }

    @Override
    public void getGender(JavabloxResponseCallback<Gender> callback) {
        svc.getGender().enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Gender convertResponse(Gender response) {
                return response;
            }

            @Override
            public void onExceptions(JavabloxException[] ez, int status) {
                for (JavabloxException e : ez) {
                    if (e.getCode() == 0) callback.onAccessDenied(e);
                    else callback.onUserNotFound(e);
                }
            }
        });
    }

    @Override
    public void setGender(Gender gender, JavabloxResponseCallback<Void> callback) {
        svc.setGender(gender).enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Void convertResponse(Void response) {
                return response;
            }

            @Override
            public void onExceptions(JavabloxException[] ez, int status) {
                for (JavabloxException e : ez)
                    switch (e.getCode()) {
                        case 1:
                            callback.onUserNotFound(e);
                            break;
                        case 6:
                            callback.onInvalidRequestBody(e);
                            break;
                        case 0:
                            if (status == 500) callback.onUnknownError(e);
                            else callback.onAccessDenied(e);
                            break;
                        case 2:
                            callback.onPinLocked(e);
                    }
            }
        });
    }

    @Override
    public void getXboxConsecutiveLoginDays(JavabloxResponseCallback<Integer> callback) {
        svc.getXboxConsecutiveLoginDays().enqueue(new CallbackAdapter<>(callback) {
            @Override
            public Integer convertResponse(Count response) {
                return response.getCount();
            }

            @Override
            public void onExceptions(JavabloxException[] ez, int status) {
                if (ez[0].getCode() == 0) callback.onAccessDenied(ez[0]);
                else callback.onNotXboxLiveAccount(ez[0]);
            }
        });
    }

    @Override
    public void fetchMetadata(JavabloxResponseCallback callback) {
        svc.getMetadata().enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<AccountInfoMetadata> call, Response<AccountInfoMetadata> response) {
                metadata = response.body();
            }

            @Override
            public void onFailure(Call<AccountInfoMetadata> call, Throwable t) {
                callback.onError(t);
            }
        });
    }

    @Override
    public boolean isDescriptionEnabled() {
        return metadata.isDescriptionEnabled();
    }

    @Override
    public boolean isBirthdateEnabled() {
        return metadata.isBirthdayEnabled();
    }

    @Override
    public boolean isGenderEnabled() {
        return metadata.isGenderEnabled();
    }

    @Override
    public boolean isPromotionChannelEnabled() {
        return metadata.isPromotionChannelEnabled();
    }

    @Override
    public boolean isAllowedNotificationsEndpointDisabled() {
        return metadata.isAllowedNotificationsEndpointDisabled();
    }

    @Override
    public boolean isAccountSettingsPolicyEnabled() {
        return metadata.isAccountSettingsPolicyEnabled();
    }

    @Override
    public boolean isPhoneNumberEnabled() {
        return metadata.isPhoneNumberEnabled();
    }
}
