package rbxapi.javablox.client;

import com.google.gson.Gson;
import rbxapi.javablox.exception.BaseJavabloxException;
import rbxapi.javablox.model.ErrorResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public abstract class CallbackAdapter<T, R> implements Callback<T> {
    private JavabloxCallback<R> jcb;

    public CallbackAdapter(JavabloxCallback<R> jcb) {
        this.jcb = jcb;
    }

    public abstract R convertResponse(T response);

    public abstract void castEx(BaseJavabloxException[] ez, int status);

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            jcb.onSuccess(convertResponse(response.body()));
        } else {
            try {
                BaseJavabloxException[] e = new Gson().fromJson(response.errorBody().string(), ErrorResponse.class).getErrors();
                castEx(e, response.code());
                jcb.onEndpointException(e);
            } catch (IOException e) {
                jcb.onError(e);
            }
        }
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        jcb.onError(t);
    }
}
