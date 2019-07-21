package rbxapi.javablox.exception;

public class BaseJavabloxException extends Throwable{
    private int code;
    private String message;

    public BaseJavabloxException(int code, String msg) {
        this.code = code;
        message = msg;
    }

    public BaseJavabloxException(BaseJavabloxException e) {
        this.code = e.getCode();
        this.message = e.getMessage();
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
