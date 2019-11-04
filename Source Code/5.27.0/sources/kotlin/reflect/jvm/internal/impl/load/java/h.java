package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.t;
import kotlin.reflect.jvm.internal.impl.name.b;

/* compiled from: JavaClassFinder.kt */
public interface h {

    /* compiled from: JavaClassFinder.kt */
    public static final class a {
        private final kotlin.reflect.jvm.internal.impl.name.a classId;
        private final byte[] fhb;
        private final g fhc;

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (kotlin.jvm.internal.i.y(r2.fhc, r3.fhc) != false) goto L_0x0029;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.h.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (kotlin.reflect.jvm.internal.impl.load.java.h.a) r3;
            r0 = r2.classId;
            r1 = r3.classId;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.fhb;
            r1 = r3.fhb;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.fhc;
            r3 = r3.fhc;
            r3 = kotlin.jvm.internal.i.y(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.h$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.name.a aVar = this.classId;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            byte[] bArr = this.fhb;
            hashCode = (hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
            g gVar = this.fhc;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Request(classId=");
            stringBuilder.append(this.classId);
            stringBuilder.append(", previouslyFoundClassFileContent=");
            stringBuilder.append(Arrays.toString(this.fhb));
            stringBuilder.append(", outerClass=");
            stringBuilder.append(this.fhc);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(kotlin.reflect.jvm.internal.impl.name.a aVar, byte[] bArr, g gVar) {
            i.f(aVar, "classId");
            this.classId = aVar;
            this.fhb = bArr;
            this.fhc = gVar;
        }

        public final kotlin.reflect.jvm.internal.impl.name.a getClassId() {
            return this.classId;
        }

        public /* synthetic */ a(kotlin.reflect.jvm.internal.impl.name.a aVar, byte[] bArr, g gVar, int i, f fVar) {
            if ((i & 2) != 0) {
                bArr = (byte[]) null;
            }
            if ((i & 4) != 0) {
                gVar = (g) null;
            }
            this(aVar, bArr, gVar);
        }
    }

    g a(a aVar);

    t a(b bVar);

    Set<String> b(b bVar);
}
