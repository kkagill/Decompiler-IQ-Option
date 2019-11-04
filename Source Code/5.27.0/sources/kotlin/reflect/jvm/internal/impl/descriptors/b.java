package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.ad;
import kotlin.reflect.jvm.internal.impl.types.an;
import kotlin.reflect.jvm.internal.impl.types.w;

/* compiled from: typeParameterUtils.kt */
final class b implements ao {
    private final ao fcG;
    private final k fcH;
    private final int fcI;

    public <R, D> R a(m<R, D> mVar, D d) {
        return this.fcG.a(mVar, d);
    }

    public List<w> bod() {
        return this.fcG.bod();
    }

    public f brE() {
        return this.fcG.brE();
    }

    public aj brF() {
        return this.fcG.brF();
    }

    public an brm() {
        return this.fcG.brm();
    }

    public boolean bsU() {
        return true;
    }

    public ad bsY() {
        return this.fcG.bsY();
    }

    public kotlin.reflect.jvm.internal.impl.name.f bsZ() {
        return this.fcG.bsZ();
    }

    public Variance bta() {
        return this.fcG.bta();
    }

    public boolean btb() {
        return this.fcG.btb();
    }

    public b(ao aoVar, k kVar, int i) {
        i.f(aoVar, "originalDescriptor");
        i.f(kVar, "declarationDescriptor");
        this.fcG = aoVar;
        this.fcH = kVar;
        this.fcI = i;
    }

    /* renamed from: bsV */
    public ao bsX() {
        ao bsV = this.fcG.bsV();
        i.e(bsV, "originalDescriptor.original");
        return bsV;
    }

    public k brj() {
        return this.fcH;
    }

    public int getIndex() {
        return this.fcI + this.fcG.getIndex();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.fcG.toString());
        stringBuilder.append("[inner-copy]");
        return stringBuilder.toString();
    }
}
