package com.iqoption.core.data.config;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0006"}, bng = {"buildUrl", "", "endPoint", "path", "fixEndpoint", "fixPath", "core_release"})
/* compiled from: ApiConfigData.kt */
public final class b {
    public static final String fC(String str) {
        kotlin.jvm.internal.i.f(str, "$this$fixEndpoint");
        if (u.b(str, "/", false, 2, null)) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append('/');
        return stringBuilder.toString();
    }

    public static final String fD(String str) {
        kotlin.jvm.internal.i.f(str, "$this$fixPath");
        return u.a(str, "/", false, 2, null) ? x.X(str, 1) : str;
    }

    public static final String ad(String str, String str2) {
        kotlin.jvm.internal.i.f(str, "endPoint");
        kotlin.jvm.internal.i.f(str2, "path");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(fC(str));
        stringBuilder.append(fD(str2));
        return stringBuilder.toString();
    }
}
