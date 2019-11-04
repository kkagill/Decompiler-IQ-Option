package com.google.common.b;

import com.google.common.base.e;
import com.google.common.base.i;

/* compiled from: DeadEvent */
public class b {
    private final Object XX;
    private final Object source;

    public b(Object obj, Object obj2) {
        this.source = i.checkNotNull(obj);
        this.XX = i.checkNotNull(obj2);
    }

    public Object uG() {
        return this.XX;
    }

    public String toString() {
        return e.aj(this).d("source", this.source).d("event", this.XX).toString();
    }
}
