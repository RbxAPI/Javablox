package rbxapi.javablox.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//TODO: Move to javablox-endpoint

/**
 * The base class to easily utilise the lib
 */
public class Javablox {

    /**
     * Applies the JSON header by default
     */
    private static OkHttpClient httpClient = new OkHttpClient.Builder()
            .addInterceptor(
                    chain -> {
                        Request request = chain.request().newBuilder()
                                .addHeader("Accept", "Application/JSON").build();
                        return chain.proceed(request);
                    }).build();

    /**
     * Generates a Retrofit builder
     * @param url Base URL
     * @return Retrofit generated class
     */
    public static Retrofit genRetrofit(String url) {
        return new Retrofit.Builder().addConverterFactory(GsonConverterFactory.create()).baseUrl(url).client(httpClient).build();
    }

}
