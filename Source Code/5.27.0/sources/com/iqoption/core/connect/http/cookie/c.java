package com.iqoption.core.connect.http.cookie;

import com.iqoption.core.ext.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.i;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bJ\u0014\u0010\u0010\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u001e\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, bng = {"Lcom/iqoption/core/connect/http/cookie/PersistentCookieJar;", "Lcom/iqoption/core/connect/http/cookie/ClearableCookieJar;", "cache", "Lcom/iqoption/core/connect/http/cookie/cache/CookieCache;", "persistor", "Lcom/iqoption/core/connect/http/cookie/persistence/CookiePersistor;", "(Lcom/iqoption/core/connect/http/cookie/cache/CookieCache;Lcom/iqoption/core/connect/http/cookie/persistence/CookiePersistor;)V", "clear", "", "loadForRequest", "", "Lokhttp3/Cookie;", "url", "Lokhttp3/HttpUrl;", "removeCookie", "cookie", "removeCookies", "removedCookies", "saveFromResponse", "cookies", "Companion", "core_release"})
/* compiled from: PersistentCookieJar.kt */
public final class c implements a {
    private static final String TAG = c.class.getName();
    public static final a bbd = new a();
    private final com.iqoption.core.connect.http.cookie.a.a bbb;
    private final com.iqoption.core.connect.http.cookie.persistence.a bbc;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, bng = {"Lcom/iqoption/core/connect/http/cookie/PersistentCookieJar$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "isCookieExpired", "", "cookie", "Lokhttp3/Cookie;", "core_release"})
    /* compiled from: PersistentCookieJar.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    public c(com.iqoption.core.connect.http.cookie.a.a aVar, com.iqoption.core.connect.http.cookie.persistence.a aVar2) {
        kotlin.jvm.internal.i.f(aVar, "cache");
        kotlin.jvm.internal.i.f(aVar2, "persistor");
        this.bbb = aVar;
        this.bbc = aVar2;
        this.bbb.addAll(this.bbc.UU());
    }

    public synchronized void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        kotlin.jvm.internal.i.f(httpUrl, "url");
        kotlin.jvm.internal.i.f(list, "cookies");
        this.bbb.addAll(list);
        this.bbc.y(list);
    }

    public synchronized List<Cookie> loadForRequest(HttpUrl httpUrl) {
        ArrayList arrayList;
        kotlin.jvm.internal.i.f(httpUrl, "url");
        ArrayList arrayList2 = new ArrayList();
        arrayList = new ArrayList();
        Iterator it = this.bbb.iterator();
        while (it.hasNext()) {
            Cookie cookie = (Cookie) it.next();
            if (e.f(cookie)) {
                arrayList2.add(cookie);
                it.remove();
            } else if (cookie.matches(httpUrl)) {
                arrayList.add(cookie);
            }
        }
        this.bbc.v(arrayList2);
        return arrayList;
    }

    public final synchronized void b(Cookie cookie) {
        kotlin.jvm.internal.i.f(cookie, "cookie");
        ArrayList arrayList = new ArrayList();
        arrayList.add(cookie);
        al(arrayList);
    }

    public final synchronized void al(List<Cookie> list) {
        kotlin.jvm.internal.i.f(list, "removedCookies");
        this.bbb.v(list);
        this.bbc.v(list);
    }

    public synchronized void clear() {
        this.bbb.clear();
        this.bbc.clear();
    }
}
