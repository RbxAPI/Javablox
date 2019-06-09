package rbxapi.javablox.model.common;

public class CursorResponse<T> extends ApiArrayResponse<T> {
    private String previousPageCursor;
    private String nextPageCursor;
}
