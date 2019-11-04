package com.google.zxing.a.a;

import com.google.zxing.common.a;

/* compiled from: Token */
abstract class g {
    static final g agD = new e(null, 0, 0);
    private final g agE;

    public abstract void a(a aVar, byte[] bArr);

    g(g gVar) {
        this.agE = gVar;
    }

    /* Access modifiers changed, original: final */
    public final g yE() {
        return this.agE;
    }

    /* Access modifiers changed, original: final */
    public final g M(int i, int i2) {
        return new e(this, i, i2);
    }

    /* Access modifiers changed, original: final */
    public final g N(int i, int i2) {
        return new b(this, i, i2);
    }
}
