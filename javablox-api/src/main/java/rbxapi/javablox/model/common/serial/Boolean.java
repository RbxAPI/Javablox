package rbxapi.javablox.model.common.serial;

import com.google.gson.annotations.SerializedName;

public class Boolean {

    @SerializedName(value="value", alternate = {"valid", "canSend", "enabled", "success"})
    private boolean value;
}
