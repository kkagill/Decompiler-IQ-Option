package com.google.common.b;

import com.google.common.base.i;
import java.lang.reflect.Method;

/* compiled from: SubscriberExceptionContext */
public class g {
    private final Object XX;
    private final d Yk;
    private final Object Yl;
    private final Method Ym;

    g(d dVar, Object obj, Object obj2, Method method) {
        this.Yk = (d) i.checkNotNull(dVar);
        this.XX = i.checkNotNull(obj);
        this.Yl = i.checkNotNull(obj2);
        this.Ym = (Method) i.checkNotNull(method);
    }

    public d uM() {
        return this.Yk;
    }

    public Object uG() {
        return this.XX;
    }

    public Object uN() {
        return this.Yl;
    }

    public Method uO() {
        return this.Ym;
    }
}
