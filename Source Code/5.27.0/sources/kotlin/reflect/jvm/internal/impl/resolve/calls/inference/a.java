package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.ak;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.p;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: CapturedTypeConstructor.kt */
public final class a extends ad implements ak {
    private final f fdr;
    private final ap fts;
    private final b ftt;
    private final boolean ftu;

    public /* synthetic */ a(ap apVar, b bVar, boolean z, f fVar, int i, f fVar2) {
        if ((i & 2) != 0) {
            bVar = new c(apVar);
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            fVar = f.fdA.bug();
        }
        this(apVar, bVar, z, fVar);
    }

    /* renamed from: bMY */
    public b bMZ() {
        return this.ftt;
    }

    public boolean boc() {
        return this.ftu;
    }

    public f brE() {
        return this.fdr;
    }

    public a(ap apVar, b bVar, boolean z, f fVar) {
        i.f(apVar, "typeProjection");
        i.f(bVar, "constructor");
        i.f(fVar, "annotations");
        this.fts = apVar;
        this.ftt = bVar;
        this.ftu = z;
        this.fdr = fVar;
    }

    public List<ap> btD() {
        return m.emptyList();
    }

    public h bsF() {
        h C = p.C("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        i.e(C, "ErrorUtils.createErrorSc…solution\", true\n        )");
        return C;
    }

    public w bMW() {
        Variance variance = Variance.OUT_VARIANCE;
        ad bqN = kotlin.reflect.jvm.internal.impl.types.b.a.bo(this).bqN();
        i.e(bqN, "builtIns.nullableAnyType");
        return b(variance, bqN);
    }

    public w bMX() {
        Variance variance = Variance.IN_VARIANCE;
        ad bqK = kotlin.reflect.jvm.internal.impl.types.b.a.bo(this).bqK();
        i.e(bqK, "builtIns.nothingType");
        return b(variance, bqK);
    }

    private final w b(Variance variance, w wVar) {
        Object wVar2;
        if (this.fts.bPD() == variance) {
            wVar2 = this.fts.bpT();
        }
        i.e(wVar2, "if (typeProjection.proje…jection.type else default");
        return wVar2;
    }

    public boolean ar(w wVar) {
        i.f(wVar, "type");
        return bMZ() == wVar.bMZ();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Captured(");
        stringBuilder.append(this.fts);
        stringBuilder.append(')');
        stringBuilder.append(boc() ? "?" : "");
        return stringBuilder.toString();
    }

    /* renamed from: gZ */
    public a gM(boolean z) {
        if (z == boc()) {
            return this;
        }
        return new a(this.fts, bMZ(), z, brE());
    }

    /* renamed from: j */
    public a h(f fVar) {
        i.f(fVar, "newAnnotations");
        return new a(this.fts, bMZ(), boc(), fVar);
    }
}
