package kotlin.reflect.jvm.internal.impl.load.java;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.name.f;

/* compiled from: specialBuiltinMembers.kt */
final class p {
    private final f fdP;
    private final String signature;

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.signature, r3.signature) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.p;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (kotlin.reflect.jvm.internal.impl.load.java.p) r3;
        r0 = r2.fdP;
        r1 = r3.fdP;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.signature;
        r3 = r3.signature;
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.p.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        f fVar = this.fdP;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        String str = this.signature;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NameAndSignature(name=");
        stringBuilder.append(this.fdP);
        stringBuilder.append(", signature=");
        stringBuilder.append(this.signature);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public p(f fVar, String str) {
        i.f(fVar, ConditionalUserProperty.NAME);
        i.f(str, "signature");
        this.fdP = fVar;
        this.signature = str;
    }

    public final String RX() {
        return this.signature;
    }

    public final f bsZ() {
        return this.fdP;
    }
}
