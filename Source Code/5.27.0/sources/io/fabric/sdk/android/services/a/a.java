package io.fabric.sdk.android.services.a;

import android.content.Context;

/* compiled from: AbstractValueCache */
public abstract class a<T> implements c<T> {
    private final c<T> eMI;

    public abstract T cg(Context context);

    public abstract void e(Context context, T t);

    public a(c<T> cVar) {
        this.eMI = cVar;
    }

    public final synchronized T a(Context context, d<T> dVar) {
        T cg;
        cg = cg(context);
        if (cg == null) {
            cg = this.eMI != null ? this.eMI.a(context, dVar) : dVar.ch(context);
            f(context, cg);
        }
        return cg;
    }

    private void f(Context context, T t) {
        if (t != null) {
            e(context, t);
            return;
        }
        throw new NullPointerException();
    }
}
