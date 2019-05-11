package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.RecoveryMetadataResponse;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Recovery {

    @GET("v2/recovery/metadata")
    Call<RecoveryMetadataResponse> getRecoveryMetadata();
}
