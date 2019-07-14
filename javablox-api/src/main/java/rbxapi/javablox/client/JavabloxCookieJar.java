package rbxapi.javablox.client;

import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

import java.util.Collections;
import java.util.List;

public class JavabloxCookieJar implements CookieJar {
    private List<Cookie> cookies;
    private Cookie cookie;

    JavabloxCookieJar(String cookie) {
        this.cookie = new Cookie.Builder().name(".ROBLOSECURITY").value(cookie).build();
        this.cookies = Collections.singletonList(new Cookie.Builder().name(".ROBLOSECURITY").value(cookie).build());
    }

    @Override
    public void saveFromResponse(HttpUrl url, List<Cookie> cookies) {
        if (!cookies.contains(cookie)) cookies.add(cookie);
    }

    @Override
    public List<Cookie> loadForRequest(HttpUrl url) {
        return cookies;
    }
}
