package rbxapi.javablox.model.badge;

import com.google.gson.annotations.SerializedName;
import rbxapi.javablox.model.common.serial.IdNamePair;

public class BadgeAwardUniverse extends IdNamePair {

    @SerializedName(value = "placeId", alternate = "rootPlaceId")
    private int placeId;
}
