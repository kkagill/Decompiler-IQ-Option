package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class l extends as {
    public static final a fwR = new a();
    private final as fwP;
    private final as fwQ;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final as a(as asVar, as asVar2) {
            i.f(asVar, "first");
            i.f(asVar2, "second");
            if (asVar.isEmpty()) {
                return asVar2;
            }
            if (asVar2.isEmpty()) {
                return asVar;
            }
            return new l(asVar, asVar2, null);
        }
    }

    public static final as a(as asVar, as asVar2) {
        return fwR.a(asVar, asVar2);
    }

    public boolean isEmpty() {
        return false;
    }

    public /* synthetic */ l(as asVar, as asVar2, f fVar) {
        this(asVar, asVar2);
    }

    private l(as asVar, as asVar2) {
        this.fwP = asVar;
        this.fwQ = asVar2;
    }

    public ap Y(w wVar) {
        i.f(wVar, "key");
        ap Y = this.fwP.Y(wVar);
        return Y != null ? Y : this.fwQ.Y(wVar);
    }

    public w a(w wVar, Variance variance) {
        i.f(wVar, "topLevelType");
        i.f(variance, "position");
        return this.fwQ.a(this.fwP.a(wVar, variance), variance);
    }

    public boolean bPm() {
        return this.fwP.bPm() || this.fwQ.bPm();
    }

    public boolean bNd() {
        return this.fwP.bNd() || this.fwQ.bNd();
    }

    public f m(f fVar) {
        i.f(fVar, "annotations");
        return this.fwQ.m(this.fwP.m(fVar));
    }
}
