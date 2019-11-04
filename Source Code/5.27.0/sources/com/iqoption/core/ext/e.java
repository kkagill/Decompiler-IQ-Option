package com.iqoption.core.ext;

import kotlin.i;
import okhttp3.Cookie;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0004"}, bng = {"isExpired", "", "Lokhttp3/Cookie;", "isNotExpired", "core_release"})
/* compiled from: HttpExtensions.kt */
public final class e {
    public static final boolean f(Cookie cookie) {
        kotlin.jvm.internal.i.f(cookie, "$this$isExpired");
        return cookie.expiresAt() != 0 && cookie.expiresAt() < System.currentTimeMillis();
    }
}
