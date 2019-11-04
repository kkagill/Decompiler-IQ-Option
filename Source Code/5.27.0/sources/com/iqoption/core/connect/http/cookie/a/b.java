package com.iqoption.core.connect.http.cookie.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.i;
import okhttp3.Cookie;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/core/connect/http/cookie/cache/IdentifiableCookie;", "", "cookie", "Lokhttp3/Cookie;", "(Lokhttp3/Cookie;)V", "getCookie", "()Lokhttp3/Cookie;", "equals", "", "other", "hashCode", "", "Companion", "core_release"})
/* compiled from: IdentifiableCookie.kt */
public final class b {
    public static final a bbf = new a();
    private final Cookie bbe;

    @i(bne = {1, 1, 15}, bnf = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, bng = {"Lcom/iqoption/core/connect/http/cookie/cache/IdentifiableCookie$Companion;", "", "()V", "decorateAll", "", "Lcom/iqoption/core/connect/http/cookie/cache/IdentifiableCookie;", "cookies", "", "Lokhttp3/Cookie;", "core_release"})
    /* compiled from: IdentifiableCookie.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final List<b> w(Collection<Cookie> collection) {
            kotlin.jvm.internal.i.f(collection, "cookies");
            ArrayList arrayList = new ArrayList(collection.size());
            for (Cookie bVar : collection) {
                arrayList.add(new b(bVar));
            }
            return arrayList;
        }
    }

    public b(Cookie cookie) {
        kotlin.jvm.internal.i.f(cookie, "cookie");
        this.bbe = cookie;
    }

    public final Cookie US() {
        return this.bbe;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.i.y(bVar.bbe.name(), this.bbe.name()) && kotlin.jvm.internal.i.y(bVar.bbe.domain(), this.bbe.domain()) && kotlin.jvm.internal.i.y(bVar.bbe.path(), this.bbe.path()) && bVar.bbe.secure() == this.bbe.secure() && bVar.bbe.hostOnly() == this.bbe.hostOnly()) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((527 + this.bbe.name().hashCode()) * 31) + this.bbe.domain().hashCode()) * 31) + this.bbe.path().hashCode()) * 31) + (this.bbe.secure() ^ 1)) * 31) + (this.bbe.hostOnly() ^ 1);
    }
}
