package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeMappingMode.kt */
public final class x {
    public static final x fmq = new x(false, false, false, false, false, null, false, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    public static final x fmr = new x(false, true, false, false, false, null, false, null, null, 509, null);
    public static final x fms = new x(false, false, false, false, false, fmq, false, null, null, 476, null);
    public static final x fmt = new x(false, true, false, false, false, fmq, false, null, null, 476, null);
    public static final x fmu = new x(false, false, false, true, false, fmq, false, null, null, 471, null);
    public static final x fmv = new x(false, false, false, true, false, fmq, false, null, null, 407, null);
    public static final x fmw = new x(false, false, true, false, false, new x(false, false, true, false, false, fmq, false, null, null, 475, null), false, null, null, 472, null);
    public static final a fmx = new a();
    private final boolean fko;
    private final boolean fmi;
    private final boolean fmj;
    private final boolean fmk;
    private final boolean fml;
    private final x fmm;
    private final boolean fmn;
    private final x fmo;
    private final x fmp;

    /* compiled from: TypeMappingMode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    private x(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, x xVar, boolean z6, x xVar2, x xVar3) {
        this.fmi = z;
        this.fmj = z2;
        this.fko = z3;
        this.fmk = z4;
        this.fml = z5;
        this.fmm = xVar;
        this.fmn = z6;
        this.fmo = xVar2;
        this.fmp = xVar3;
    }

    public final boolean byP() {
        return this.fmi;
    }

    public final boolean byQ() {
        return this.fmj;
    }

    public final boolean bxa() {
        return this.fko;
    }

    /* synthetic */ x(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, x xVar, boolean z6, x xVar2, x xVar3, int i, f fVar) {
        int i2 = i;
        boolean z7 = true;
        boolean z8 = (i2 & 1) != 0 ? true : z;
        boolean z9 = (i2 & 2) != 0 ? true : z2;
        boolean z10 = false;
        boolean z11 = (i2 & 4) != 0 ? false : z3;
        boolean z12 = (i2 & 8) != 0 ? false : z4;
        if ((i2 & 16) == 0) {
            z10 = z5;
        }
        x xVar4 = (i2 & 32) != 0 ? (x) null : xVar;
        if ((i2 & 64) == 0) {
            z7 = z6;
        }
        this(z8, z9, z11, z12, z10, xVar4, z7, (i2 & 128) != 0 ? xVar4 : xVar2, (i2 & 256) != 0 ? xVar4 : xVar3);
    }

    public final boolean byR() {
        return this.fmn;
    }

    public final x a(Variance variance) {
        i.f(variance, "effectiveVariance");
        int i = y.aob[variance.ordinal()];
        x thisR;
        if (i == 1) {
            thisR = this.fmo;
            if (thisR != null) {
                return thisR;
            }
        } else if (i != 2) {
            thisR = this.fmm;
            if (thisR != null) {
                return thisR;
            }
        } else {
            thisR = this.fmp;
            if (thisR != null) {
                return thisR;
            }
        }
        return this;
    }

    public final x byO() {
        return new x(this.fmi, true, this.fko, this.fmk, this.fml, this.fmm, this.fmn, this.fmo, this.fmp);
    }
}
