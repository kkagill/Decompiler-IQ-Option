package io.fabric.sdk.android.services.a;

import android.content.Context;

/* compiled from: MemoryValueCache */
public class b<T> extends a<T> {
    private T value;

    public b() {
        this(null);
    }

    public b(c<T> cVar) {
        super(cVar);
    }

    /* Access modifiers changed, original: protected */
    public T cg(Context context) {
        return this.value;
    }

    /* Access modifiers changed, original: protected */
    public void e(Context context, T t) {
        this.value = t;
    }
}
