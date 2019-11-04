package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.ak;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.c;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.n;

/* compiled from: JvmPackagePartSource.kt */
public final class h implements e {
    private final String eWb;
    private final c flT;
    private final c flU;
    private final n<g> flV;
    private final boolean flW;
    private final n flX;

    /* JADX WARNING: Missing block: B:3:0x0037, code skipped:
            if (r2 != null) goto L_0x003c;
     */
    public h(kotlin.reflect.jvm.internal.impl.resolve.jvm.c r2, kotlin.reflect.jvm.internal.impl.resolve.jvm.c r3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r4, kotlin.reflect.jvm.internal.impl.metadata.a.c r5, kotlin.reflect.jvm.internal.impl.serialization.deserialization.n<kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g> r6, boolean r7, kotlin.reflect.jvm.internal.impl.load.kotlin.n r8) {
        /*
        r1 = this;
        r0 = "className";
        kotlin.jvm.internal.i.f(r2, r0);
        r0 = "packageProto";
        kotlin.jvm.internal.i.f(r4, r0);
        r0 = "nameResolver";
        kotlin.jvm.internal.i.f(r5, r0);
        r1.<init>();
        r1.flT = r2;
        r1.flU = r3;
        r1.flV = r6;
        r1.flW = r7;
        r1.flX = r8;
        r4 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage) r4;
        r2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.foB;
        r3 = "JvmProtoBuf.packageModuleName";
        kotlin.jvm.internal.i.e(r2, r3);
        r2 = kotlin.reflect.jvm.internal.impl.metadata.a.f.a(r4, r2);
        r2 = (java.lang.Integer) r2;
        if (r2 == 0) goto L_0x003a;
    L_0x002d:
        r2 = (java.lang.Number) r2;
        r2 = r2.intValue();
        r2 = r5.getString(r2);
        if (r2 == 0) goto L_0x003a;
    L_0x0039:
        goto L_0x003c;
    L_0x003a:
        r2 = "main";
    L_0x003c:
        r1.eWb = r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.h.<init>(kotlin.reflect.jvm.internal.impl.resolve.jvm.c, kotlin.reflect.jvm.internal.impl.resolve.jvm.c, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, kotlin.reflect.jvm.internal.impl.metadata.a.c, kotlin.reflect.jvm.internal.impl.serialization.deserialization.n, boolean, kotlin.reflect.jvm.internal.impl.load.kotlin.n):void");
    }

    public final c byA() {
        return this.flT;
    }

    public final c byB() {
        return this.flU;
    }

    public final n byC() {
        return this.flX;
    }

    public h(n nVar, Package packageR, kotlin.reflect.jvm.internal.impl.metadata.a.c cVar, n<g> nVar2, boolean z) {
        i.f(nVar, "kotlinClass");
        i.f(packageR, "packageProto");
        i.f(cVar, "nameResolver");
        c l = c.l(nVar.getClassId());
        i.e(l, "JvmClassName.byClassId(kotlinClass.classId)");
        String byS = nVar.bqj().byS();
        c cVar2 = null;
        if (byS != null) {
            if ((((CharSequence) byS).length() > 0 ? 1 : null) != null) {
                cVar2 = c.mH(byS);
            }
        }
        c cVar3 = cVar2;
        this(l, cVar3, packageR, cVar, nVar2, z, nVar);
    }

    public String byy() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Class '");
        stringBuilder.append(getClassId().bJZ().boi());
        stringBuilder.append('\'');
        return stringBuilder.toString();
    }

    public final f byz() {
        String byE = this.flT.byE();
        i.e(byE, "className.internalName");
        f ms = f.ms(v.c(byE, '/', null, 2, null));
        i.e(ms, "Name.identifier(classNam….substringAfterLast('/'))");
        return ms;
    }

    public final a getClassId() {
        return new a(this.flT.getPackageFqName(), byz());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append(": ");
        stringBuilder.append(this.flT);
        return stringBuilder.toString();
    }

    public ak bqg() {
        ak akVar = ak.fcW;
        i.e(akVar, "SourceFile.NO_SOURCE_FILE");
        return akVar;
    }
}
