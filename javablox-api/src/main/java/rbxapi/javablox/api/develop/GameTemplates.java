package rbxapi.javablox.api.develop;

import rbxapi.javablox.model.ApiArrayResponse;
import rbxapi.javablox.model.develop.GameTemplate;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GameTemplates {

    /**
     * @implNote Templates subject to change without notice. Sort order of templates specified by Roblox.
     * @return Game templates
     */
    @GET("/v1/gametemplates")
    Call<ApiArrayResponse<GameTemplate>> getGameTemplates();
}
