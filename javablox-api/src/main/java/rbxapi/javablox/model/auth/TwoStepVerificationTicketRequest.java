package rbxapi.javablox.model.auth;

public class TwoStepVerificationTicketRequest {
    private String username;
    private String ticket;
    private final String actionType = "Login";
}
