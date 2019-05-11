package rbxapi.javablox.model.auth;

import rbxapi.javablox.model.common.Gender;
import rbxapi.javablox.model.common.Locale;

public class SignupRequest {
    private String username;
    private String password;
    private Gender gender;
    private String birthday;
    private boolean isTosAgreementBoxChecked;
    private String email;
    private Locale locale;
}
