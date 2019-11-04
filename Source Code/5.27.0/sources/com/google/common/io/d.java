package com.google.common.io;

import com.google.common.base.i;
import java.io.Reader;

/* compiled from: CharSource */
public abstract class d {
    public abstract Reader uX();

    protected d() {
    }

    public String read() {
        g va = g.va();
        try {
            String a = e.a((Reader) va.a(uX()));
            va.close();
            return a;
        } catch (Throwable th) {
            va.close();
        }
    }

    public <T> T a(i<T> iVar) {
        i.checkNotNull(iVar);
        g va = g.va();
        try {
            Object a = e.a((Reader) va.a(uX()), (i) iVar);
            va.close();
            return a;
        } catch (Throwable th) {
            va.close();
        }
    }
}
