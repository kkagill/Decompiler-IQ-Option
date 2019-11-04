package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: signatureEnhancement.kt */
final class n {
    private final w eYc;
    private final d flk;

    public final w bym() {
        return this.eYc;
    }

    public final d byn() {
        return this.flk;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.flk, r3.flk) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n) r3;
        r0 = r2.eYc;
        r1 = r3.eYc;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.flk;
        r3 = r3.flk;
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        w wVar = this.eYc;
        int i = 0;
        int hashCode = (wVar != null ? wVar.hashCode() : 0) * 31;
        d dVar = this.flk;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TypeAndDefaultQualifiers(type=");
        stringBuilder.append(this.eYc);
        stringBuilder.append(", defaultQualifiers=");
        stringBuilder.append(this.flk);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public n(w wVar, d dVar) {
        i.f(wVar, "type");
        this.eYc = wVar;
        this.flk = dVar;
    }

    public final w bpT() {
        return this.eYc;
    }
}
