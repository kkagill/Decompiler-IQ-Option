package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.checker.e;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: CapturedTypeConstructor.kt */
public final class c implements b {
    private e ftv;
    private final ap ftw;

    public Void bNc() {
        return null;
    }

    public boolean brS() {
        return false;
    }

    public c(ap apVar) {
        i.f(apVar, "projection");
        this.ftw = apVar;
        Object obj = bNa().bPD() != Variance.INVARIANT ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Only nontrivial projections can be captured, not: ");
            stringBuilder.append(bNa());
            throw new AssertionError(stringBuilder.toString());
        }
    }

    public /* synthetic */ f brQ() {
        return (f) bNc();
    }

    public ap bNa() {
        return this.ftw;
    }

    public final void a(e eVar) {
        this.ftv = eVar;
    }

    public final e bNb() {
        return this.ftv;
    }

    public List<ao> getParameters() {
        return m.emptyList();
    }

    public Collection<w> bup() {
        Object bpT;
        if (bNa().bPD() == Variance.OUT_VARIANCE) {
            bpT = bNa().bpT();
        } else {
            bpT = btw().bqN();
        }
        i.e(bpT, "if (projection.projectio… builtIns.nullableAnyType");
        return l.listOf(bpT);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CapturedTypeConstructor(");
        stringBuilder.append(bNa());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public g btw() {
        g btw = bNa().bpT().bMZ().btw();
        i.e(btw, "projection.type.constructor.builtIns");
        return btw;
    }
}
