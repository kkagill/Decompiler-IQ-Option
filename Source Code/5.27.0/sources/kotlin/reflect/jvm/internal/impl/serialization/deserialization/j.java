package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.a.a;
import kotlin.reflect.jvm.internal.impl.metadata.a.c;
import kotlin.reflect.jvm.internal.impl.metadata.a.h;
import kotlin.reflect.jvm.internal.impl.metadata.a.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e;

/* compiled from: context.kt */
public final class j {
    private final c eWN;
    private final h eWO;
    private final k fej;
    private final h flH;
    private final a fuT;
    private final v fvp;
    private final p fvq;
    private final kotlin.reflect.jvm.internal.impl.metadata.a.k fvr;
    private final e fvs;

    /* JADX WARNING: Missing block: B:3:0x006b, code skipped:
            if (r0 != null) goto L_0x0070;
     */
    public j(kotlin.reflect.jvm.internal.impl.serialization.deserialization.h r13, kotlin.reflect.jvm.internal.impl.metadata.a.c r14, kotlin.reflect.jvm.internal.impl.descriptors.k r15, kotlin.reflect.jvm.internal.impl.metadata.a.h r16, kotlin.reflect.jvm.internal.impl.metadata.a.k r17, kotlin.reflect.jvm.internal.impl.metadata.a.a r18, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e r19, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v r20, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> r21) {
        /*
        r12 = this;
        r9 = r12;
        r0 = r13;
        r1 = r14;
        r2 = r15;
        r3 = r16;
        r4 = r17;
        r5 = r18;
        r6 = "components";
        kotlin.jvm.internal.i.f(r13, r6);
        r6 = "nameResolver";
        kotlin.jvm.internal.i.f(r14, r6);
        r6 = "containingDeclaration";
        kotlin.jvm.internal.i.f(r15, r6);
        r6 = "typeTable";
        kotlin.jvm.internal.i.f(r3, r6);
        r6 = "versionRequirementTable";
        kotlin.jvm.internal.i.f(r4, r6);
        r6 = "metadataVersion";
        kotlin.jvm.internal.i.f(r5, r6);
        r6 = "typeParameters";
        r7 = r21;
        kotlin.jvm.internal.i.f(r7, r6);
        r12.<init>();
        r9.flH = r0;
        r9.eWN = r1;
        r9.fej = r2;
        r9.eWO = r3;
        r9.fvr = r4;
        r9.fuT = r5;
        r0 = r19;
        r9.fvs = r0;
        r10 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.v;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "Deserializer for \"";
        r0.append(r1);
        r1 = r9.fej;
        r1 = r1.bsZ();
        r0.append(r1);
        r1 = 34;
        r0.append(r1);
        r4 = r0.toString();
        r0 = r9.fvs;
        if (r0 == 0) goto L_0x006e;
    L_0x0067:
        r0 = r0.byy();
        if (r0 == 0) goto L_0x006e;
    L_0x006d:
        goto L_0x0070;
    L_0x006e:
        r0 = "[container not found]";
    L_0x0070:
        r5 = r0;
        r6 = 0;
        r8 = 32;
        r11 = 0;
        r0 = r10;
        r1 = r12;
        r2 = r20;
        r3 = r21;
        r7 = r8;
        r8 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r9.fvp = r10;
        r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
        r0.<init>(r12);
        r9.fvq = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.j.<init>(kotlin.reflect.jvm.internal.impl.serialization.deserialization.h, kotlin.reflect.jvm.internal.impl.metadata.a.c, kotlin.reflect.jvm.internal.impl.descriptors.k, kotlin.reflect.jvm.internal.impl.metadata.a.h, kotlin.reflect.jvm.internal.impl.metadata.a.k, kotlin.reflect.jvm.internal.impl.metadata.a.a, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v, java.util.List):void");
    }

    public final h bys() {
        return this.flH;
    }

    public final c bot() {
        return this.eWN;
    }

    public final k brj() {
        return this.fej;
    }

    public final h bou() {
        return this.eWO;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.a.k bOo() {
        return this.fvr;
    }

    public final e bOp() {
        return this.fvs;
    }

    public final v bOm() {
        return this.fvp;
    }

    public final p bOn() {
        return this.fvq;
    }

    public final kotlin.reflect.jvm.internal.impl.storage.h bqz() {
        return this.flH.bqz();
    }

    public static /* synthetic */ j a(j jVar, k kVar, List list, c cVar, h hVar, kotlin.reflect.jvm.internal.impl.metadata.a.k kVar2, a aVar, int i, Object obj) {
        if ((i & 4) != 0) {
            cVar = jVar.eWN;
        }
        c cVar2 = cVar;
        if ((i & 8) != 0) {
            hVar = jVar.eWO;
        }
        h hVar2 = hVar;
        if ((i & 16) != 0) {
            kVar2 = jVar.fvr;
        }
        kotlin.reflect.jvm.internal.impl.metadata.a.k kVar3 = kVar2;
        if ((i & 32) != 0) {
            aVar = jVar.fuT;
        }
        return jVar.a(kVar, list, cVar2, hVar2, kVar3, aVar);
    }

    public final j a(k kVar, List<TypeParameter> list, c cVar, h hVar, kotlin.reflect.jvm.internal.impl.metadata.a.k kVar2, a aVar) {
        k kVar3 = kVar;
        i.f(kVar, "descriptor");
        List<TypeParameter> list2 = list;
        i.f(list, "typeParameterProtos");
        c cVar2 = cVar;
        i.f(cVar, "nameResolver");
        i.f(hVar, "typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.a.k kVar4 = kVar2;
        i.f(kVar4, "versionRequirementTable");
        i.f(aVar, "metadataVersion");
        h hVar2 = this.flH;
        if (!l.c(aVar)) {
            kVar4 = this.fvr;
        }
        return new j(hVar2, cVar, kVar, hVar, kVar4, aVar, this.fvs, this.fvp, list);
    }
}
