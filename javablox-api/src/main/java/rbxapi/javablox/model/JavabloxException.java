package rbxapi.javablox.model;

public class JavabloxException extends Throwable{
    private int code;
    private String message;

    public JavabloxException(int code, String msg) {
        this.code = code;
        message = msg;
    }

    public JavabloxException(JavabloxException e) {
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
