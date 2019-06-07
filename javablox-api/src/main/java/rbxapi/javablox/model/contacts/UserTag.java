package rbxapi.javablox.model.contacts;

import com.google.gson.annotations.SerializedName;

public class UserTag {
    private int targetUserId;

    @SerializedName(value = "userTag", alternate = "targetUserTag")
    private String userTag;
}
