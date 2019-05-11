package rbxapi.javablox.api.auth;

import rbxapi.javablox.model.auth.TwoStepVerificationMetadataResponse;
import rbxapi.javablox.model.auth.TwoStepVerificationSentResponse;
import rbxapi.javablox.model.auth.TwoStepVerificationTicketRequest;
import rbxapi.javablox.model.auth.TwoStepVerificationVerifyRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TwoStepVerification {

    @GET("v2/twostepverification/metadata")
    Call<TwoStepVerificationMetadataResponse> getMetadata();

    @POST("v2/twostepverification/resend")
    Call<TwoStepVerificationSentResponse> resend(@Body TwoStepVerificationTicketRequest request);

    @POST("v2/twostepverification/verify")
    Call verify(@Body TwoStepVerificationVerifyRequest request);
}
