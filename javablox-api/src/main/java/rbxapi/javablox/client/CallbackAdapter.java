package rbxapi.javablox.client;

import com.google.gson.Gson;
import rbxapi.javablox.data.JavabloxException;
import rbxapi.javablox.data.ErrorResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;

public abstract class CallbackAdapter<T, R> implements Callback<T> {
    private JavabloxResponseCallback<R> jcb;

    public CallbackAdapter(JavabloxResponseCallback<R> jcb) {
        this.jcb = jcb;
    }

    public abstract R convertResponse(T response);

    public abstract void onExceptions(JavabloxException[] ez, int status);

    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        if (response.isSuccessful()) {
            jcb.onSuccess(convertResponse(response.body()));
        } else {
            try {
                JavabloxException[] e = new Gson().fromJson(response.errorBody().string(), ErrorResponse.class).getErrors();
                onExceptions(e, response.code());
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
