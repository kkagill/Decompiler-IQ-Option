package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.p;

/* compiled from: NewCapturedType.kt */
public final class d extends ad {
    private final f fdr;
    private final boolean ftu;
    private final CaptureStatus fxL;
    private final e fxM;
    private final ay fxN;

    /* renamed from: bPI */
    public e bMZ() {
        return this.fxM;
    }

    public final ay bPJ() {
        return this.fxN;
    }

    public /* synthetic */ d(CaptureStatus captureStatus, e eVar, ay ayVar, f fVar, boolean z, int i, f fVar2) {
        if ((i & 8) != 0) {
            fVar = f.fdA.bug();
        }
        this(captureStatus, eVar, ayVar, fVar, (i & 16) != 0 ? false : z);
    }

    public f brE() {
        return this.fdr;
    }

    public boolean boc() {
        return this.ftu;
    }

    public d(CaptureStatus captureStatus, e eVar, ay ayVar, f fVar, boolean z) {
        i.f(captureStatus, "captureStatus");
        i.f(eVar, "constructor");
        i.f(fVar, "annotations");
        this.fxL = captureStatus;
        this.fxM = eVar;
        this.fxN = ayVar;
        this.fdr = fVar;
        this.ftu = z;
    }

    public d(CaptureStatus captureStatus, ay ayVar, ap apVar) {
        i.f(captureStatus, "captureStatus");
        i.f(apVar, "projection");
        this(captureStatus, new e(apVar, null, 2, null), ayVar, null, false, 24, null);
    }

    public List<ap> btD() {
        return m.emptyList();
    }

    public h bsF() {
        h C = p.C("No member resolution should be done on captured type!", true);
        i.e(C, "ErrorUtils.createErrorSc…on captured type!\", true)");
        return C;
    }

    /* renamed from: q */
    public d h(f fVar) {
        i.f(fVar, "newAnnotations");
        return new d(this.fxL, bMZ(), this.fxN, fVar, boc());
    }

    /* renamed from: hf */
    public d gM(boolean z) {
        return new d(this.fxL, bMZ(), this.fxN, brE(), z);
    }
}
