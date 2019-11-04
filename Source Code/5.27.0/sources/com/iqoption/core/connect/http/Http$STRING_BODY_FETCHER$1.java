package com.iqoption.core.connect.http;

import kotlin.i;
import kotlin.jvm.a.b;
import kotlin.jvm.internal.Lambda;
import okhttp3.ResponseBody;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, bng = {"<anonymous>", "", "kotlin.jvm.PlatformType", "body", "Lokhttp3/ResponseBody;", "invoke"})
/* compiled from: Http.kt */
final class Http$STRING_BODY_FETCHER$1 extends Lambda implements b<ResponseBody, String> {
    public static final Http$STRING_BODY_FETCHER$1 baL = new Http$STRING_BODY_FETCHER$1();

    Http$STRING_BODY_FETCHER$1() {
        super(1);
    }

    /* renamed from: b */
    public final String invoke(ResponseBody responseBody) {
        kotlin.jvm.internal.i.f(responseBody, "body");
        return responseBody.string();
    }
}
