package rbxapi.javablox.model.assetdelivery;

import rbxapi.javablox.model.common.serial.CodeMsgPair;

public class AssetBatch {
    private String Location;
    private CodeMsgPair[] Errors;
    private String requestId;
    private boolean IsHashDynamic;
    private boolean IsCopyrightProtected;
}
