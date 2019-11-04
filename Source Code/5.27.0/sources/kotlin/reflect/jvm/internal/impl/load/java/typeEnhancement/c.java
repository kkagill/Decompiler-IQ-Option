package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: typeEnhancement.kt */
final class c<T> {
    private final f fkA;
    private final T result;

    public final T bnj() {
        return this.result;
    }

    public final f bxP() {
        return this.fkA;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.fkA, r3.fkA) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c) r3;
        r0 = r2.result;
        r1 = r3.result;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.fkA;
        r3 = r3.fkA;
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object obj = this.result;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        f fVar = this.fkA;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EnhancementResult(result=");
        stringBuilder.append(this.result);
        stringBuilder.append(", enhancementAnnotations=");
        stringBuilder.append(this.fkA);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(T t, f fVar) {
        this.result = t;
        this.fkA = fVar;
    }
}
