package kotlin.reflect.jvm.internal.impl.descriptors;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.z;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ah;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.g;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h.c;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.e;

/* compiled from: NotFoundClasses.kt */
public final class x {
    private final h eZz;
    private final v fbz;
    private final kotlin.reflect.jvm.internal.impl.storage.b<kotlin.reflect.jvm.internal.impl.name.b, y> fcM = this.eZz.q(new NotFoundClasses$packageFragments$1(this));
    private final kotlin.reflect.jvm.internal.impl.storage.b<a, d> fcN = this.eZz.q(new NotFoundClasses$classes$1(this));

    /* compiled from: NotFoundClasses.kt */
    private static final class a {
        private final kotlin.reflect.jvm.internal.impl.name.a classId;
        private final List<Integer> fcO;

        public final kotlin.reflect.jvm.internal.impl.name.a bse() {
            return this.classId;
        }

        public final List<Integer> btx() {
            return this.fcO;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.fcO, r3.fcO) != false) goto L_0x001f;
     */
        public boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.x.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (kotlin.reflect.jvm.internal.impl.descriptors.x.a) r3;
            r0 = r2.classId;
            r1 = r3.classId;
            r0 = kotlin.jvm.internal.i.y(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.fcO;
            r3 = r3.fcO;
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.x$a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            kotlin.reflect.jvm.internal.impl.name.a aVar = this.classId;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            List list = this.fcO;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ClassRequest(classId=");
            stringBuilder.append(this.classId);
            stringBuilder.append(", typeParametersCount=");
            stringBuilder.append(this.fcO);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }

        public a(kotlin.reflect.jvm.internal.impl.name.a aVar, List<Integer> list) {
            i.f(aVar, "classId");
            i.f(list, "typeParametersCount");
            this.classId = aVar;
            this.fcO = list;
        }
    }

    /* compiled from: NotFoundClasses.kt */
    public static final class b extends g {
        private final List<ao> fcP;
        private final e fcQ;
        private final boolean fcR;

        public boolean AZ() {
            return false;
        }

        public boolean brA() {
            return false;
        }

        public boolean brB() {
            return false;
        }

        public boolean brC() {
            return false;
        }

        public boolean brD() {
            return false;
        }

        public d brq() {
            return null;
        }

        public c brw() {
            return null;
        }

        public boolean bry() {
            return false;
        }

        public b(h hVar, k kVar, f fVar, boolean z, int i) {
            i.f(hVar, "storageManager");
            i.f(kVar, "container");
            i.f(fVar, ConditionalUserProperty.NAME);
            super(hVar, kVar, fVar, aj.fcV, false);
            this.fcR = z;
            Iterable bh = m.bh(0, i);
            Collection arrayList = new ArrayList(n.e(bh, 10));
            Iterator it = bh.iterator();
            while (it.hasNext()) {
                int nextInt = ((z) it).nextInt();
                k kVar2 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.f bug = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
                Variance variance = Variance.INVARIANT;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append('T');
                stringBuilder.append(nextInt);
                arrayList.add(ah.a(kVar2, bug, false, variance, f.ms(stringBuilder.toString()), nextInt));
            }
            this.fcP = (List) arrayList;
            this.fcQ = new e(this, this.fcP, ak.df(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.P(this).btw().bqM()), hVar);
        }

        public ClassKind brt() {
            return ClassKind.CLASS;
        }

        public Modality bru() {
            return Modality.FINAL;
        }

        public aw brx() {
            aw awVar = av.fde;
            i.e(awVar, "Visibilities.PUBLIC");
            return awVar;
        }

        /* renamed from: bty */
        public e brm() {
            return this.fcQ;
        }

        public List<ao> brI() {
            return this.fcP;
        }

        public boolean brz() {
            return this.fcR;
        }

        public kotlin.reflect.jvm.internal.impl.descriptors.annotations.f brE() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
        }

        /* renamed from: btz */
        public c bro() {
            return c.fuD;
        }

        /* renamed from: brk */
        public c brl() {
            return c.fuD;
        }

        public Collection<c> brs() {
            return al.emptySet();
        }

        public Collection<d> brH() {
            return m.emptyList();
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("class ");
            stringBuilder.append(bsZ());
            stringBuilder.append(" (not found)");
            return stringBuilder.toString();
        }
    }

    public x(h hVar, v vVar) {
        i.f(hVar, "storageManager");
        i.f(vVar, "module");
        this.eZz = hVar;
        this.fbz = vVar;
    }

    public final d a(kotlin.reflect.jvm.internal.impl.name.a aVar, List<Integer> list) {
        i.f(aVar, "classId");
        i.f(list, "typeParametersCount");
        return (d) this.fcN.invoke(new a(aVar, list));
    }
}
