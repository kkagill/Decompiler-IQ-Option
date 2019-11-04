package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.d;

/* compiled from: ClassDeserializer.kt */
public final class f {
    private static final Set<kotlin.reflect.jvm.internal.impl.name.a> fuW = ak.df(kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.eZF.bKf()));
    public static final b fuX = new b();
    private final h flH;
    private final kotlin.jvm.a.b<a, d> fuV = this.flH.bqz().r(new ClassDeserializer$classes$1(this));

    /* compiled from: ClassDeserializer.kt */
    private static final class a {
        private final kotlin.reflect.jvm.internal.impl.name.a classId;
        private final d fuY;

        public a(kotlin.reflect.jvm.internal.impl.name.a aVar, d dVar) {
            i.f(aVar, "classId");
            this.classId = aVar;
            this.fuY = dVar;
        }

        public final d bNV() {
            return this.fuY;
        }

        public final kotlin.reflect.jvm.internal.impl.name.a getClassId() {
            return this.classId;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && i.y(this.classId, ((a) obj).classId);
        }

        public int hashCode() {
            return this.classId.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    public f(h hVar) {
        i.f(hVar, "components");
        this.flH = hVar;
    }

    public static /* synthetic */ d a(f fVar, kotlin.reflect.jvm.internal.impl.name.a aVar, d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            dVar = (d) null;
        }
        return fVar.a(aVar, dVar);
    }

    public final d a(kotlin.reflect.jvm.internal.impl.name.a aVar, d dVar) {
        i.f(aVar, "classId");
        return (d) this.fuV.invoke(new a(aVar, dVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bb A:{SYNTHETIC, EDGE_INSN: B:45:0x00bb->B:37:0x00bb ?: BREAK  } */
    private final kotlin.reflect.jvm.internal.impl.descriptors.d a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f.a r13) {
        /*
        r12 = this;
        r0 = r13.getClassId();
        r1 = r12.flH;
        r1 = r1.bOe();
        r1 = r1.iterator();
    L_0x000e:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0021;
    L_0x0014:
        r2 = r1.next();
        r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a.b) r2;
        r2 = r2.f(r0);
        if (r2 == 0) goto L_0x000e;
    L_0x0020:
        return r2;
    L_0x0021:
        r1 = fuW;
        r1 = r1.contains(r0);
        r2 = 0;
        if (r1 == 0) goto L_0x002b;
    L_0x002a:
        return r2;
    L_0x002b:
        r13 = r13.bNV();
        if (r13 == 0) goto L_0x0032;
    L_0x0031:
        goto L_0x003c;
    L_0x0032:
        r13 = r12.flH;
        r13 = r13.bOa();
        r13 = r13.k(r0);
    L_0x003c:
        if (r13 == 0) goto L_0x00f4;
    L_0x003e:
        r1 = r13.bNR();
        r10 = r13.bNS();
        r11 = r13.bNT();
        r13 = r13.bNU();
        r3 = r0.bJX();
        r4 = "classId.shortClassName";
        if (r3 == 0) goto L_0x007a;
    L_0x0056:
        r5 = 2;
        r3 = a(r12, r3, r2, r5, r2);
        r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d;
        if (r5 != 0) goto L_0x0060;
    L_0x005f:
        r3 = r2;
    L_0x0060:
        r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d) r3;
        if (r3 == 0) goto L_0x0079;
    L_0x0064:
        r0 = r0.bJV();
        kotlin.jvm.internal.i.e(r0, r4);
        r0 = r3.O(r0);
        if (r0 != 0) goto L_0x0072;
    L_0x0071:
        return r2;
    L_0x0072:
        r0 = r3.bOB();
    L_0x0076:
        r4 = r0;
        goto L_0x00e7;
    L_0x0079:
        return r2;
    L_0x007a:
        r3 = r12.flH;
        r3 = r3.buP();
        r5 = r0.getPackageFqName();
        r6 = "classId.packageFqName";
        kotlin.jvm.internal.i.e(r5, r6);
        r3 = r3.h(r5);
        r3 = (java.lang.Iterable) r3;
        r3 = r3.iterator();
    L_0x0093:
        r5 = r3.hasNext();
        if (r5 == 0) goto L_0x00ba;
    L_0x0099:
        r5 = r3.next();
        r6 = r5;
        r6 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r6;
        r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
        if (r7 == 0) goto L_0x00b6;
    L_0x00a4:
        r6 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.k) r6;
        r7 = r0.bJV();
        kotlin.jvm.internal.i.e(r7, r4);
        r6 = r6.N(r7);
        if (r6 == 0) goto L_0x00b4;
    L_0x00b3:
        goto L_0x00b6;
    L_0x00b4:
        r6 = 0;
        goto L_0x00b7;
    L_0x00b6:
        r6 = 1;
    L_0x00b7:
        if (r6 == 0) goto L_0x0093;
    L_0x00b9:
        goto L_0x00bb;
    L_0x00ba:
        r5 = r2;
    L_0x00bb:
        r4 = r5;
        r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4;
        if (r4 == 0) goto L_0x00f4;
    L_0x00c0:
        r3 = r12.flH;
        r6 = new kotlin.reflect.jvm.internal.impl.metadata.a.h;
        r0 = r10.bAP();
        r2 = "classProto.typeTable";
        kotlin.jvm.internal.i.e(r0, r2);
        r6.<init>(r0);
        r0 = kotlin.reflect.jvm.internal.impl.metadata.a.k.fon;
        r2 = r10.bAS();
        r5 = "classProto.versionRequirementTable";
        kotlin.jvm.internal.i.e(r2, r5);
        r7 = r0.g(r2);
        r9 = 0;
        r5 = r1;
        r8 = r11;
        r0 = r3.a(r4, r5, r6, r7, r8, r9);
        goto L_0x0076;
    L_0x00e7:
        r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.d;
        r3 = r0;
        r5 = r10;
        r6 = r1;
        r7 = r11;
        r8 = r13;
        r3.<init>(r4, r5, r6, r7, r8);
        r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0;
        return r0;
    L_0x00f4:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.f.a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.f$a):kotlin.reflect.jvm.internal.impl.descriptors.d");
    }
}
