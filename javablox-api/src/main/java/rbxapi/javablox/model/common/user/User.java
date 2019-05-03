package rbxapi.javablox.model.common.user;

import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName(value = "id", alternate = "userId")
    private long id;

    @SerializedName(value = "name", alternate = {"userName", "username"})
    private String name;
}
