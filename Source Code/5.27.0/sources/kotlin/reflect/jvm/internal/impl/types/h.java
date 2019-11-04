package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.f;

/* compiled from: TypeSubstitution.kt */
public class h extends as {
    private final as feZ;

    public h(as asVar) {
        i.f(asVar, "substitution");
        this.feZ = asVar;
    }

    public ap Y(w wVar) {
        i.f(wVar, "key");
        return this.feZ.Y(wVar);
    }

    public w a(w wVar, Variance variance) {
        i.f(wVar, "topLevelType");
        i.f(variance, "position");
        return this.feZ.a(wVar, variance);
    }

    public boolean isEmpty() {
        return this.feZ.isEmpty();
    }

    public boolean bPm() {
        return this.feZ.bPm();
    }

    public boolean bNd() {
        return this.feZ.bNd();
    }

    public f m(f fVar) {
        i.f(fVar, "annotations");
        return this.feZ.m(fVar);
    }
}
