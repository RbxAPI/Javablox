package rbxapi.javablox.client;

import rbxapi.javablox.exception.BaseJavabloxException;

public interface JavabloxCallback<T> {

    /**
     * The processed response from the request.
     * @param body  Processed response
     */
    void onSuccess(T body);

    /**
     * Processed exceptions returned by the endpoint.
     * @param exceptions Exceptions, subclassed
     */
    void onEndpointException(BaseJavabloxException[] exceptions);

    /**
     * An error throwb by Retrofit. This is usually unrelated to Roblox.
     * @param error Throwable
     */
    void onError(Throwable error);
}
