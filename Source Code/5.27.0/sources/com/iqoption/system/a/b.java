package com.iqoption.system.a;

import com.google.common.base.n;
import com.iqoption.app.IQApp;
import com.iqoption.util.ae;

/* compiled from: EventBusValue */
public class b<T> {
    private T defaultValue;
    private final n<c<T>> dtS;
    private T value;

    public b(n<c<T>> nVar, T t) {
        this.dtS = nVar;
        this.defaultValue = t;
    }

    public boolean cm(T t) {
        if (ae.equals(this.value, t)) {
            return false;
        }
        this.value = t;
        c cVar = (c) this.dtS.get();
        cVar.setValue(t);
        if (IQApp.Eu() != null) {
            IQApp.Ex().bd(cVar);
        }
        return true;
    }

    public void cn(T t) {
        this.value = t;
    }

    public void aUB() {
        this.value = this.defaultValue;
    }

    public T getValue() {
        T t = this.value;
        return t == null ? this.defaultValue : t;
    }
}
