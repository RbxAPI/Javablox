package rbxapi.javablox.model.common.serial;

import com.google.gson.annotations.SerializedName;

public class CodeMsgPair {

    @SerializedName(value = "code", alternate = "Code")
    private String code;

    @SerializedName(value = "message", alternate = "Message")
    private String message;
}
