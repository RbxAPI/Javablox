package rbxapi.javablox.model.catelog;

import com.google.gson.annotations.SerializedName;

public class Favorite {

    @SerializedName(value = "id", alternate = {"assetId", "bundleId"})
    private long id;

    private long userId;
    private String created;
}
