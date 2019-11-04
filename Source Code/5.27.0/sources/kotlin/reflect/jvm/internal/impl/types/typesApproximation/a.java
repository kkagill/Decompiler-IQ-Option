package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* compiled from: CapturedTypeApproximation.kt */
public final class a<T> {
    private final T fyh;
    private final T fyi;

    public final T bnj() {
        return this.fyh;
    }

    public final T bnk() {
        return this.fyi;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.fyi, r3.fyi) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.types.typesApproximation.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.a) r3;
        r0 = r2.fyh;
        r1 = r3.fyh;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.fyi;
        r3 = r3.fyi;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typesApproximation.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object obj = this.fyh;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.fyi;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ApproximationBounds(lower=");
        stringBuilder.append(this.fyh);
        stringBuilder.append(", upper=");
        stringBuilder.append(this.fyi);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(T t, T t2) {
        this.fyh = t;
        this.fyi = t2;
    }

    public final T bPO() {
        return this.fyh;
    }

    public final T bPP() {
        return this.fyi;
    }
}
