package rbxapi.javablox.model;

public class CursorResponse<T> {
    private String previousPageCursor;
    private String nextPageCursor;
    private T[] data;
}
