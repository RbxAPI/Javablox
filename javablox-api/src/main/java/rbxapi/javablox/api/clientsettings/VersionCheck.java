package rbxapi.javablox.api.clientsettings;

import rbxapi.javablox.model.clientsettings.ClientVersion;
import rbxapi.javablox.model.clientsettings.Platform;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface VersionCheck {

    @GET("/v1/client-version/{binaryType}")
    Call<ClientVersion> getClientVersion(@Path("binaryType")Platform binaryType);
}
