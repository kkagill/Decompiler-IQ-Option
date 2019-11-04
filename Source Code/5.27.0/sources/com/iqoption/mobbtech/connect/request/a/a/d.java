package com.iqoption.mobbtech.connect.request.a.a;

import okhttp3.Request;
import okhttp3.Response;

/* compiled from: ResponseHttpAPiRequestTask */
public class d<T> extends b<T> {
    public d(Class<T> cls, Request request, String str) {
        super((Class) cls, request, str);
    }

    /* Access modifiers changed, original: protected */
    public String b(Response response) {
        String string = response.body().string();
        response.close();
        return string;
    }
}
