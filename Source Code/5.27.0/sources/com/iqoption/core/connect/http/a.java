package com.iqoption.core.connect.http;

import io.reactivex.b.l;
import kotlin.i;
import okhttp3.Response;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/connect/http/AlwaysTrueResponseValidator;", "Lio/reactivex/functions/Predicate;", "Lokhttp3/Response;", "()V", "test", "", "t", "core_release"})
/* compiled from: ResponseValidators.kt */
public final class a implements l<Response> {
    public static final a bas = new a();

    /* renamed from: a */
    public boolean test(Response response) {
        kotlin.jvm.internal.i.f(response, "t");
        return true;
    }

    private a() {
    }
}
