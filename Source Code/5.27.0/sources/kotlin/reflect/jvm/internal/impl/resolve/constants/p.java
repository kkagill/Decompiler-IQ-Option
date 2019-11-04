package kotlin.reflect.jvm.internal.impl.resolve.constants;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.d;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.v;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ar;
import kotlin.reflect.jvm.internal.impl.types.w;
import kotlin.reflect.jvm.internal.impl.types.x;
import kotlin.reflect.jvm.internal.impl.types.y;

/* compiled from: constantValues.kt */
public final class p extends g<b> {
    public static final a ftG = new a();

    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final g<?> at(w wVar) {
            i.f(wVar, "argumentType");
            g<?> gVar = null;
            if (y.aJ(wVar)) {
                return null;
            }
            w wVar2 = wVar;
            int i = 0;
            while (g.o(wVar2)) {
                wVar2 = ((ap) u.bY(wVar2.btD())).bpT();
                i.e(wVar2, "type.arguments.single().type");
                i++;
            }
            f brQ = wVar2.bMZ().brQ();
            if (brQ instanceof d) {
                kotlin.reflect.jvm.internal.impl.name.a c = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.c(brQ);
                if (c == null) {
                    return new p((b) new a(wVar));
                }
                gVar = new p(c, i);
            } else if (brQ instanceof ao) {
                kotlin.reflect.jvm.internal.impl.name.a s = kotlin.reflect.jvm.internal.impl.name.a.s(g.eZA.eZD.bKf());
                i.e(s, "ClassId.topLevel(KotlinB…ns.FQ_NAMES.any.toSafe())");
                gVar = new p(s, 0);
            }
            return gVar;
        }
    }

    /* compiled from: constantValues.kt */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        public static final class a extends b {
            private final w eYc;

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.eYc, ((kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.a) r2).eYc) != false) goto L_0x0015;
     */
            public boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.a;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.a) r2;
                r0 = r1.eYc;
                r2 = r2.eYc;
                r2 = kotlin.jvm.internal.i.y(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.constants.p$b$a.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                w wVar = this.eYc;
                return wVar != null ? wVar.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("LocalClass(type=");
                stringBuilder.append(this.eYc);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public a(w wVar) {
                i.f(wVar, "type");
                super();
                this.eYc = wVar;
            }

            public final w bpT() {
                return this.eYc;
            }
        }

        /* compiled from: constantValues.kt */
        public static final class b extends b {
            private final f ftH;

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (kotlin.jvm.internal.i.y(r1.ftH, ((kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b) r2).ftH) != false) goto L_0x0015;
     */
            public boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.p.b.b) r2;
                r0 = r1.ftH;
                r2 = r2.ftH;
                r2 = kotlin.jvm.internal.i.y(r0, r2);
                if (r2 == 0) goto L_0x0013;
            L_0x0012:
                goto L_0x0015;
            L_0x0013:
                r2 = 0;
                return r2;
            L_0x0015:
                r2 = 1;
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.constants.p$b$b.equals(java.lang.Object):boolean");
            }

            public int hashCode() {
                f fVar = this.ftH;
                return fVar != null ? fVar.hashCode() : 0;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("NormalClass(value=");
                stringBuilder.append(this.ftH);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }

            public b(f fVar) {
                i.f(fVar, ConditionalUserProperty.VALUE);
                super();
                this.ftH = fVar;
            }

            public final f bNi() {
                return this.ftH;
            }

            public final kotlin.reflect.jvm.internal.impl.name.a getClassId() {
                return this.ftH.getClassId();
            }

            public final int bNh() {
                return this.ftH.bNe();
            }
        }

        private b() {
        }

        public /* synthetic */ b(f fVar) {
            this();
        }
    }

    public p(b bVar) {
        i.f(bVar, ConditionalUserProperty.VALUE);
        super(bVar);
    }

    public p(f fVar) {
        i.f(fVar, ConditionalUserProperty.VALUE);
        this((b) new b(fVar));
    }

    public p(kotlin.reflect.jvm.internal.impl.name.a aVar, int i) {
        i.f(aVar, "classId");
        this(new f(aVar, i));
    }

    public w g(v vVar) {
        i.f(vVar, "module");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.f bug = kotlin.reflect.jvm.internal.impl.descriptors.annotations.f.fdA.bug();
        d bqI = vVar.btw().bqI();
        i.e(bqI, "module.builtIns.kClass");
        return x.a(bug, bqI, l.listOf(new ar(i(vVar))));
    }

    public final w i(v vVar) {
        i.f(vVar, "module");
        b bVar = (b) getValue();
        if (bVar instanceof a) {
            return ((a) getValue()).bpT();
        }
        if (bVar instanceof b) {
            f bNi = ((b) getValue()).bNi();
            kotlin.reflect.jvm.internal.impl.name.a bse = bNi.bse();
            int component2 = bNi.component2();
            d a = r.a(vVar, bse);
            if (a != null) {
                ad bsY = a.bsY();
                i.e(bsY, "descriptor.defaultType");
                w bq = kotlin.reflect.jvm.internal.impl.types.b.a.bq(bsY);
                for (int i = 0; i < component2; i++) {
                    bsY = vVar.btw().a(Variance.INVARIANT, bq);
                    i.e(bsY, "module.builtIns.getArray…Variance.INVARIANT, type)");
                    bq = bsY;
                }
                return bq;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unresolved type: ");
            stringBuilder.append(bse);
            stringBuilder.append(" (arrayDimensions=");
            stringBuilder.append(component2);
            stringBuilder.append(')');
            ad mK = kotlin.reflect.jvm.internal.impl.types.p.mK(stringBuilder.toString());
            i.e(mK, "ErrorUtils.createErrorTy…sions=$arrayDimensions)\")");
            return mK;
        }
        throw new NoWhenBranchMatchedException();
    }
}
