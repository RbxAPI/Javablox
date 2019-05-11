package rbxapi.javablox.model.auth;

public class TwoStepVerificationVerifyRequest {
    private String username;
    private String ticket;
    private String code;
    private boolean rememberDevice;
    private final String actionType = "Login";
}
