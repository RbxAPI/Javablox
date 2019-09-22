package rbxapi.javablox.data;

public class ErrorResponse {
    private JavabloxException[] errors;

    private ErrorResponse() {}

    public static class Builder {
        private JavabloxException[] errors;

        public Builder setErrors(JavabloxException[] errors) {
            this.errors = errors;
            return this;
        }

        public ErrorResponse build() {
            ErrorResponse e = new ErrorResponse();
            e.errors = this.errors;
            return e;
        }
    }

    public JavabloxException[] getErrors() {
        return errors;
    }
}
