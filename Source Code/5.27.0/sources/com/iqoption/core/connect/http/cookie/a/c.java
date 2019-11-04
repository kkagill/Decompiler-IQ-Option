package com.iqoption.core.connect.http.cookie.a;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.i;
import kotlin.jvm.internal.a.d;
import okhttp3.Cookie;

@i(bne = {1, 1, 15}, bnf = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0002J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/connect/http/cookie/cache/SetCookieCache;", "Lcom/iqoption/core/connect/http/cookie/cache/CookieCache;", "()V", "cookies", "", "Lcom/iqoption/core/connect/http/cookie/cache/IdentifiableCookie;", "addAll", "", "", "Lokhttp3/Cookie;", "clear", "iterator", "", "removeAll", "updateCookies", "SetCookieCacheIterator", "core_release"})
/* compiled from: SetCookieCache.kt */
public final class c implements a {
    private final Set<b> bbg = new HashSet();

    @i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\tH\u0002J\t\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/connect/http/cookie/cache/SetCookieCache$SetCookieCacheIterator;", "", "Lokhttp3/Cookie;", "cookies", "", "Lcom/iqoption/core/connect/http/cookie/cache/IdentifiableCookie;", "(Ljava/lang/Iterable;)V", "iterator", "hasNext", "", "next", "remove", "", "core_release"})
    /* compiled from: SetCookieCache.kt */
    private static final class a implements Iterator<Cookie>, d {
        private final Iterator<b> WJ;

        public a(Iterable<b> iterable) {
            kotlin.jvm.internal.i.f(iterable, "cookies");
            this.WJ = iterable.iterator();
        }

        public boolean hasNext() {
            return this.WJ.hasNext();
        }

        /* renamed from: UT */
        public Cookie next() {
            return ((b) this.WJ.next()).US();
        }

        public void remove() {
            this.WJ.remove();
        }
    }

    public void addAll(Collection<Cookie> collection) {
        kotlin.jvm.internal.i.f(collection, "cookies");
        x(b.bbf.w(collection));
    }

    private final void x(Collection<b> collection) {
        this.bbg.removeAll(collection);
        this.bbg.addAll(collection);
    }

    public void v(Collection<Cookie> collection) {
        kotlin.jvm.internal.i.f(collection, "cookies");
        this.bbg.removeAll(b.bbf.w(collection));
    }

    public void clear() {
        this.bbg.clear();
    }

    public Iterator<Cookie> iterator() {
        return new a(this.bbg);
    }
}
