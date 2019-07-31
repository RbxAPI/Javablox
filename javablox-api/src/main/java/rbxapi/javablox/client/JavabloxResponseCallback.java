package rbxapi.javablox.client;

public interface JavabloxResponseCallback<T> extends JavabloxExceptionCallback{

    /**
     * The processed response from the request.
     * @param body  Processed response
     */
    void onSuccess(T body);

    /**
     * An error thrown by Retrofit. This is usually unrelated to Roblox.
     * @param error Throwable
     */
    void onError(Throwable error);
}
