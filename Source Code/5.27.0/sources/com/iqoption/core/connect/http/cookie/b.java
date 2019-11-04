package com.iqoption.core.connect.http.cookie;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.core.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import kotlin.l;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

@i(bne = {1, 1, 15}, bnf = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0007J\u001e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, bng = {"Lcom/iqoption/core/connect/http/cookie/DecoratedCookieJar;", "Lcom/iqoption/core/connect/http/cookie/ClearableCookieJar;", "userJar", "Lcom/iqoption/core/connect/http/cookie/PersistentCookieJar;", "(Lcom/iqoption/core/connect/http/cookie/PersistentCookieJar;)V", "appCookies", "", "Lokhttp3/Cookie;", "getAppCookies", "()Ljava/util/List;", "clear", "", "clearAppCookies", "clearCookie", "name", "", "host", "loadForRequest", "", "url", "Lokhttp3/HttpUrl;", "putAppCookie", "cookie", "removeAppCookie", "removeCookie", "saveFromResponse", "cookies", "core_release"})
/* compiled from: DecoratedCookieJar.kt */
public final class b implements a {
    private final List<Cookie> baA = new ArrayList();
    private final c bba;

    public b(c cVar) {
        kotlin.jvm.internal.i.f(cVar, "userJar");
        this.bba = cVar;
    }

    public final List<Cookie> UQ() {
        return this.baA;
    }

    public void clear() {
        this.bba.clear();
    }

    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        kotlin.jvm.internal.i.f(httpUrl, "url");
        kotlin.jvm.internal.i.f(list, "cookies");
        this.bba.saveFromResponse(httpUrl, list);
    }

    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        kotlin.jvm.internal.i.f(httpUrl, "url");
        return u.b((Collection) this.baA, (Iterable) this.bba.loadForRequest(httpUrl));
    }

    public final void a(Cookie cookie) {
        kotlin.jvm.internal.i.f(cookie, "cookie");
        int i = 0;
        for (Cookie name : this.baA) {
            if (kotlin.jvm.internal.i.y(name.name(), cookie.name())) {
                break;
            }
            i++;
        }
        i = -1;
        if (i != -1) {
            this.baA.set(i, cookie);
        } else {
            this.baA.add(cookie);
        }
    }

    public final void b(Cookie cookie) {
        kotlin.jvm.internal.i.f(cookie, "cookie");
        this.bba.b(cookie);
        c(cookie);
    }

    public final void c(Cookie cookie) {
        kotlin.jvm.internal.i.f(cookie, "cookie");
        this.baA.remove(cookie);
    }

    public final void UR() {
        this.baA.clear();
    }

    public static /* synthetic */ void a(b bVar, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = d.EE().Vb();
        }
        bVar.ac(str, str2);
    }

    public final void ac(String str, String str2) {
        kotlin.jvm.internal.i.f(str, ConditionalUserProperty.NAME);
        kotlin.jvm.internal.i.f(str2, "host");
        HttpUrl parse = HttpUrl.parse(str2);
        if (parse == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        kotlin.jvm.internal.i.e(parse, "HttpUrl.parse(host)!!");
        List<Cookie> loadForRequest = loadForRequest(parse);
        synchronized (this) {
            for (Cookie cookie : loadForRequest) {
                if (u.v(cookie.name(), str, true)) {
                    b(cookie);
                    break;
                }
            }
            l lVar = l.eVB;
        }
    }
}
