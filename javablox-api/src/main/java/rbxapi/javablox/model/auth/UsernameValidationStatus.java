package rbxapi.javablox.model.auth;

public enum UsernameValidationStatus {
    ValidUsername,
    AlreadyInUseError,
    ModerationError,
    InvalidLengthError,
    StartsOrEndsWithUnderscoreError,
    TooManyUnderscoresError,
    ContainsSpacesError,
    InvalidCharactersError,
    ContainsPiiError,
    ContainsReservedUsernameError
}
