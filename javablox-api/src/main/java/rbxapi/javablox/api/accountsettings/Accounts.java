package rbxapi.javablox.api.accountsettings;

import rbxapi.javablox.model.accountsettings.SettingsGroup;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Accounts {

    @GET("v1/account/settings/settings-groups")
    Call<SettingsGroup[]> getSettingsGroups();
}
