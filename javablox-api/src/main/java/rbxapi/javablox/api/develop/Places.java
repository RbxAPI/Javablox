package rbxapi.javablox.api.develop;

import rbxapi.javablox.model.develop.PlaceCompatiblitiesResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Places {

    @GET("/v1/places/{placeId}/compatibilities")
    Call<PlaceCompatiblitiesResponse> getPlaceCompatibilities(@Path("placeId") long placeId);
}
