package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.m;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.ao;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ay;
import kotlin.reflect.jvm.internal.impl.types.b.a;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: NewCapturedType.kt */
public final class e implements b {
    private final ap ftw;
    private List<? extends ay> fxO;

    public f brQ() {
        return null;
    }

    public boolean brS() {
        return false;
    }

    public e(ap apVar, List<? extends ay> list) {
        i.f(apVar, "projection");
        this.ftw = apVar;
        this.fxO = list;
    }

    public /* synthetic */ e(ap apVar, List list, int i, f fVar) {
        if ((i & 2) != 0) {
            list = (List) null;
        }
        this(apVar, list);
    }

    public ap bNa() {
        return this.ftw;
    }

    public final void cp(List<? extends ay> list) {
        i.f(list, "supertypes");
        Object obj = this.fxO == null ? 1 : null;
        if (m.eVC && obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Already initialized! oldValue = ");
            stringBuilder.append(this.fxO);
            stringBuilder.append(", newValue = ");
            stringBuilder.append(list);
            throw new AssertionError(stringBuilder.toString());
        }
        this.fxO = list;
    }

    /* renamed from: bPh */
    public List<ay> bup() {
        List<ay> list = this.fxO;
        return list != null ? list : m.emptyList();
    }

    public List<ao> getParameters() {
        return m.emptyList();
    }

    public g btw() {
        w bpT = bNa().bpT();
        i.e(bpT, "projection.type");
        return a.bo(bpT);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CapturedType(");
        stringBuilder.append(bNa());
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
