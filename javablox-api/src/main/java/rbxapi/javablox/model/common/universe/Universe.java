package rbxapi.javablox.model.common.universe;

import com.google.gson.annotations.SerializedName;
import rbxapi.javablox.model.common.serial.IdNamePair;

public class Universe extends IdNamePair {

    @SerializedName(value = "placeId", alternate = "rootPlaceId")
    private int placeId;
}
