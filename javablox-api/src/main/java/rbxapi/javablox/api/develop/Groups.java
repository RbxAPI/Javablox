package rbxapi.javablox.api.develop;

import rbxapi.javablox.model.common.CursorResponse;
import rbxapi.javablox.model.common.SortOrder;
import rbxapi.javablox.model.develop.DevelopUniverse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Groups {

    @GET("/v1/groups/{groupId}/universes")
    Call<CursorResponse<DevelopUniverse>> getGroupUniverses(
            @Path("groupId") int groupId,
            @Query("sortOrder") SortOrder sortOrder,
            @Query("limit") int limit,
            @Query("cursor") String cursor
            );
}
