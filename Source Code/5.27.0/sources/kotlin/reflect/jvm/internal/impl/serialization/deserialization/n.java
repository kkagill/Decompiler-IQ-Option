package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.metadata.a.a;

/* compiled from: IncompatibleVersionErrorData.kt */
public final class n<T extends a> {
    private final kotlin.reflect.jvm.internal.impl.name.a classId;
    private final T fvu;
    private final T fvv;
    private final String fvw;

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.classId, r3.classId) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.n;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.n) r3;
        r0 = r2.fvu;
        r1 = r3.fvu;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.fvv;
        r1 = r3.fvv;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.fvw;
        r1 = r3.fvw;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.classId;
        r3 = r3.classId;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        a aVar = this.fvu;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a aVar2 = this.fvv;
        hashCode = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        String str = this.fvw;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        kotlin.reflect.jvm.internal.impl.name.a aVar3 = this.classId;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("IncompatibleVersionErrorData(actualVersion=");
        stringBuilder.append(this.fvu);
        stringBuilder.append(", expectedVersion=");
        stringBuilder.append(this.fvv);
        stringBuilder.append(", filePath=");
        stringBuilder.append(this.fvw);
        stringBuilder.append(", classId=");
        stringBuilder.append(this.classId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public n(T t, T t2, String str, kotlin.reflect.jvm.internal.impl.name.a aVar) {
        i.f(t, "actualVersion");
        i.f(t2, "expectedVersion");
        i.f(str, "filePath");
        i.f(aVar, "classId");
        this.fvu = t;
        this.fvv = t2;
        this.fvw = str;
        this.classId = aVar;
    }
}
