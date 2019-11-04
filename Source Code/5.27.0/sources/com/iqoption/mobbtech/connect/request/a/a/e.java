package com.iqoption.mobbtech.connect.request.a.a;

import com.iqoption.core.microservices.c;
import java.lang.reflect.Type;
import okhttp3.Request;

/* compiled from: ResponseStatusRequestTask */
public class e<T> extends b<T> {
    public e(Class<T> cls, Request request, String str) {
        super((Class) cls, request, str);
    }

    public e(Type type, Request request, String str) {
        super(type, request, str);
    }

    /* Access modifiers changed, original: protected */
    public void ch(T t) {
        if (t instanceof c) {
            c cVar = (c) t;
            if (!cVar.isSuccessful()) {
                this.success = false;
                this.errorMessage = cVar.getMessage();
            }
        }
        super.ch(t);
    }
}
