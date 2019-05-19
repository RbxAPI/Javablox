package rbxapi.javablox.model.common.user;

import com.google.gson.annotations.SerializedName;
import rbxapi.javablox.model.common.serial.IdNamePair;

public class User extends IdNamePair {

    @SerializedName(value = "id", alternate = {"userId", "targetId"})
    private long id;

    @SerializedName(value = "name", alternate = {"userName", "username"})
    private String name;
}
