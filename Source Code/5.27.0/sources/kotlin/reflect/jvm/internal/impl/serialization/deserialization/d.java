package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.aj;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.a.a;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;

/* compiled from: ClassData.kt */
public final class d {
    private final c eWN;
    private final Class fuS;
    private final a fuT;
    private final aj fuU;

    public final c bNR() {
        return this.eWN;
    }

    public final Class bNS() {
        return this.fuS;
    }

    public final a bNT() {
        return this.fuT;
    }

    public final aj bNU() {
        return this.fuU;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.fuU, r3.fuU) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.d;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.d) r3;
        r0 = r2.eWN;
        r1 = r3.eWN;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.fuS;
        r1 = r3.fuS;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.fuT;
        r1 = r3.fuT;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.fuU;
        r3 = r3.fuU;
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        c cVar = this.eWN;
        int i = 0;
        int hashCode = (cVar != null ? cVar.hashCode() : 0) * 31;
        Class classR = this.fuS;
        hashCode = (hashCode + (classR != null ? classR.hashCode() : 0)) * 31;
        a aVar = this.fuT;
        hashCode = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        aj ajVar = this.fuU;
        if (ajVar != null) {
            i = ajVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClassData(nameResolver=");
        stringBuilder.append(this.eWN);
        stringBuilder.append(", classProto=");
        stringBuilder.append(this.fuS);
        stringBuilder.append(", metadataVersion=");
        stringBuilder.append(this.fuT);
        stringBuilder.append(", sourceElement=");
        stringBuilder.append(this.fuU);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(c cVar, Class classR, a aVar, aj ajVar) {
        i.f(cVar, "nameResolver");
        i.f(classR, "classProto");
        i.f(aVar, "metadataVersion");
        i.f(ajVar, "sourceElement");
        this.eWN = cVar;
        this.fuS = classR;
        this.fuT = aVar;
        this.fuU = ajVar;
    }
}
