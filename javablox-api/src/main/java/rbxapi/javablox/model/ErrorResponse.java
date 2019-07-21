package rbxapi.javablox.model;

import rbxapi.javablox.exception.BaseJavabloxException;

public class ErrorResponse {
    private BaseJavabloxException[] errors;

    private ErrorResponse() {}

    public static class Builder {
        private BaseJavabloxException[] errors;

        public Builder setErrors(BaseJavabloxException[] errors) {
            this.errors = errors;
            return this;
        }

        public ErrorResponse build() {
            ErrorResponse e = new ErrorResponse();
            e.errors = this.errors;
            return e;
        }
    }

    public BaseJavabloxException[] getErrors() {
        return errors;
    }
}
